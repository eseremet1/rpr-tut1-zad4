package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void provjeraKontruktora() {
        Artikl artikl = new Artikl("televizor",1000,"12");
        assertEquals("televizor", artikl.getNaziv());
        assertEquals(1000, artikl.getCijena());
        assertEquals("12", artikl.getKod());
    }
    @Test
    void provjeraSetMetode() {
        Artikl artikl = new Artikl("televizor",1000,"12");
        artikl.setCijena(2000);
        assertEquals(2000, artikl.getCijena());

    }
    @Test
    void provjeraGetMetode() {
        Artikl artikl = new Artikl("televizor",1000,"12");
        assertEquals("televizor", artikl.getNaziv());

    }




}