package Exercise1;

public abstract class Spiewak {
    private static int nextStartNumber = 1; // numer startowy dla kolejnego utworzonego obiektu
    private final String nazwisko; // nazwisko śpiewaka
    private final int startNumber;// numer startowy śpiewaka// numer startowy śpiewaka

    public Spiewak(String nazwisko) {
        this.nazwisko = nazwisko;
        this.startNumber = nextStartNumber;
        nextStartNumber++;
    }
    public String toString() {
        return "("+startNumber+")"+ nazwisko + ": " + spiewaj();
    }

    abstract String spiewaj();

    int glosnosc() {
        String tekst = spiewaj();
        int maxCyfra = 0;
        int maxLitera = 0;

        for (int i = 0; i < tekst.length(); i++) {
            char c = tekst.charAt(i);
            if (Character.isDigit(c)) {
                int cyfra = Character.getNumericValue(c);
                if (cyfra > maxCyfra) {
                    maxCyfra = cyfra;
                }
            } else if (Character.isLetter(c)) {
                int litera = Character.toLowerCase(c);
                if (litera > maxLitera) {
                    maxLitera = litera;
                }
            }
        }

        int sumaKodow = maxCyfra + maxLitera;
        return sumaKodow == 0 ? 0 : (sumaKodow + 111); // suma kodów + 111, aby uniknąć wartości 0
    }
    public static Spiewak najglosniej(Spiewak[] spiewacy) {
        if (spiewacy.length == 0) {
            return null;
        }

        Spiewak najglosniejszy = spiewacy[0];
        int maxGlosnosc = spiewacy[0].glosnosc();

        for (int i = 1; i < spiewacy.length; i++) {
            int glosnosc = spiewacy[i].glosnosc();
            if (glosnosc > maxGlosnosc) {
                maxGlosnosc = glosnosc;
                najglosniejszy = spiewacy[i];
            }
        }

        return najglosniejszy;
    }
    }


