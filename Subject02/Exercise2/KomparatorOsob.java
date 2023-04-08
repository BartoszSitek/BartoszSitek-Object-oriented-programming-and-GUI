package Exercise2;
import java.util.Comparator;
public class KomparatorOsob implements Comparator<Osoba> {

    private Kryterium kryterium;

    public KomparatorOsob(Kryterium kryterium) {
        this.kryterium = kryterium;
    }

    @Override
    public int compare(Osoba o1, Osoba o2) {
        switch (kryterium) {
            case imie:
                return o1.getImie().compareTo(o2.getImie());
            case wiek:
                return Integer.compare(o1.getWiek(), o2.getWiek());
            default:
                throw new IllegalArgumentException("Nieznane kryterium sortowania");
        }
    }
}

