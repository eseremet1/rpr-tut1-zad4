package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {


    @Test
    void dodajArtikl1() {
        Korpa korpa = new Korpa();
        Artikl artikl = new Artikl("televizor",1000,"12");
        korpa.setBrojArtikalaUKorpi(50);
        assertFalse(korpa.dodajArtikl(artikl));

    }

    @Test
    void dodajArtikl2() {
        Korpa korpa = new Korpa();
        Artikl artikl = new Artikl("televizor",1000,"12");
        assertTrue(korpa.dodajArtikl(artikl));

    }

    @Test
    void izbacivanjeArtikla() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("televizor",1000,"12"));
        korpa.dodajArtikl(new Artikl("biciklo",1000,"13"));
        korpa.dodajArtikl(new Artikl("stolica", 1000, "14"));

        assertEquals(3,korpa.getBrojArtikalaUKorpi());
        Artikl artikl = korpa.izbaciArtiklSaKodom("12");
        assertEquals(2,korpa.getBrojArtikalaUKorpi());
        assertEquals("televizor",artikl.getNaziv());



    }

    @Test
    void ukupnaCijenaArtikala() {
        Korpa korpa = new Korpa();
        assertEquals(0,korpa.dajUkupnuCijenuArtikala());
        korpa.dodajArtikl(new Artikl("televizor",1080,"12"));
        korpa.dodajArtikl(new Artikl("biciklo",1030,"13"));
        korpa.dodajArtikl(new Artikl("stolica", 1200, "14"));

        assertEquals(3310,korpa.dajUkupnuCijenuArtikala());




    }




}