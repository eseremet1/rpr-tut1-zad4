package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {
    Artikl[] supermarket = new Artikl[1000];
    int brojArtikalaUSupermarketu;

    public Artikl[] getArtikli() {
        return supermarket;
    }

    public void dodajArtikl(Artikl artikl) {
        if(brojArtikalaUSupermarketu==1000) throw new IllegalArgumentException();
        supermarket[brojArtikalaUSupermarketu] = artikl;
        brojArtikalaUSupermarketu = brojArtikalaUSupermarketu + 1;

    }

    public Artikl[] getSupermarket() {
        return supermarket;
    }

    public void setSupermarket(Artikl[] supermarket) {
        this.supermarket = supermarket;
    }

    public int getBrojArtikalaUSupermarketu() {
        return brojArtikalaUSupermarketu;
    }

    public void setBrojArtikalaUSupermarketu(int brojArtikalaUSupermarketu) {
        this.brojArtikalaUSupermarketu = brojArtikalaUSupermarketu;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {

        for(int i=0; i<supermarket.length; i++) {
            if(supermarket[i] != null && supermarket[i].getKod().equals(kod)) {
                Artikl pomocni = supermarket[i];
                supermarket[i] = null;
                brojArtikalaUSupermarketu = brojArtikalaUSupermarketu - 1;
                return pomocni;
            }
        }

        return null;
    }
}
