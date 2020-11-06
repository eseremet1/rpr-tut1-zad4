package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl3() {
        Supermarket supermarket = new Supermarket();
        Artikl artikl = new Artikl("televizor",1000,"12");
        supermarket.setBrojArtikalaUSupermarketu(400);
        supermarket.dodajArtikl(artikl);
        assertEquals(401, supermarket.getBrojArtikalaUSupermarketu());



    }

    @Test
    void dodajArtikl4() {
        Supermarket supermarket = new Supermarket();
        Artikl artikl = new Artikl("televizor",1000,"12");
        supermarket.setBrojArtikalaUSupermarketu(1000);
        assertThrows(IllegalArgumentException.class, () -> supermarket.dodajArtikl(artikl));
        
    }




    @Test
    void izbacivanjeArtikla() {
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("televizor",1000,"12"));
        supermarket.dodajArtikl(new Artikl("biciklo",1000,"13"));
        supermarket.dodajArtikl(new Artikl("stolica", 1000, "14"));
        supermarket.dodajArtikl(new Artikl("ormar", 1000, "15"));

        assertEquals(4,supermarket.getBrojArtikalaUSupermarketu());
        Artikl artikl = supermarket.izbaciArtiklSaKodom("12");
        assertEquals(3,supermarket.getBrojArtikalaUSupermarketu());
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