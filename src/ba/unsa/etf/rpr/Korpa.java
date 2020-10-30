package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa {
    Artikl[] korpa = new Artikl[50];
    int brojArtikalaUKorpi;

    public boolean dodajArtikl(Artikl artikl) {
        if(brojArtikalaUKorpi==50) return false;
        korpa[brojArtikalaUKorpi] = artikl;
        brojArtikalaUKorpi = brojArtikalaUKorpi + 1;
        return true;
    }

    public Artikl[] getArtikli() {

        return korpa;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {

        for(int i=0; i<korpa.length; i++) {
            if(korpa[i] != null && korpa[i].getKod().equals(kod)) {
                Artikl pomocni = korpa[i];
                korpa[i] = null;
                brojArtikalaUKorpi = brojArtikalaUKorpi - 1;
                return pomocni;
            }
        }

        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int ukupnaCijena = 0;
        for (Artikl artikl: korpa) {
            if(artikl != null)
            ukupnaCijena = ukupnaCijena + artikl.getCijena();

        }
        return ukupnaCijena;
    }
}
