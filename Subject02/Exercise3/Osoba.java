package Exercise3;


import java.util.*;

public class Osoba implements Comparable<Osoba> {
    private String imie;
    private int rokUrodzenia;

    public Osoba(String imie, int rokUrodzenia) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
    }

    public static boolean wKolekcji(Collection<Osoba> kol, String imie, int rokUrodzenia) {
        return kol.contains(new Osoba(imie, rokUrodzenia));
    }

    public String getImie() {
        return imie;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    @Override
    public int compareTo(Osoba o) {
        int cmp = this.imie.compareTo(o.imie);
        if (cmp == 0) {
            cmp = Integer.compare(this.rokUrodzenia, o.rokUrodzenia);
        }
        return cmp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Osoba)) return false;
        Osoba osoba = (Osoba) o;
        return rokUrodzenia == osoba.rokUrodzenia &&
                Objects.equals(imie, osoba.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, rokUrodzenia);
    }
}