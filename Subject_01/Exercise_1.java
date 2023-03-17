package Subject_01;

public class Exercise_1 {
    public static void main(String[] args) {
        Muzyk[] muzycy = {new Skrzypek("Aleks", 2),    // Imie, czas wystapienia (w godz.)
                new Wiolonczelista("Bartek", 1),
                new Flecista("Czarek", 0.5)};
        for (Muzyk m : muzycy)
            System.out.println("Subject_01.Muzyk: " + m.imie() + '\n' +
                    "Instrument: " + m.instrument() + '\n' +
                    "Czas wystąpienia: " + m.czas() + " godz. " + '\n' +
                    "Stawka godzinowa: " + m.stawka() + '\n');

        System.out.println(Muzyk.maxHonorarium(muzycy));    // muzyk otrzymujący najwyższe honorarium za występ


    }

}
abstract class Muzyk {

    private String imie;
    private double czas;

    // konstruktor
    protected Muzyk(String imie, double czas) {
        this.imie = imie;
        this.czas = czas;
    }

    // metoda getter
    protected String imie() {
        return imie;
    }

    // metoda getter
    protected double czas() {
        return czas;
    }

    // metody abstrakcyjne
    abstract protected String instrument();
    abstract protected double stawka();

    public String toString() {
        return imie + ", czas = " + czas + " godz., stawka = " + stawka();
    }

    public static Muzyk maxHonorarium(Muzyk[] muzycy) {
        double maxHonorarium = 0;
        Muzyk muzykMaxHonorarium = null;
        for (Muzyk m : muzycy) {
            double honorarium = m.czas * m.stawka();
            if (honorarium > maxHonorarium) {
                maxHonorarium = honorarium;
                muzykMaxHonorarium = m;
            }
        }
        return muzykMaxHonorarium;
    }

}

class Skrzypek extends Muzyk {

    // konstruktor
    public Skrzypek(String imie, double czas) {
        super(imie, czas);
    }

    @Override
    protected String instrument() {
        return "skrzypce";
    }

    @Override
    protected double stawka() {
        return 200.0;
    }
}

class Wiolonczelista extends Muzyk {

    // konstruktor
    public Wiolonczelista(String imie, double czas) {
        super(imie, czas);
    }

    @Override
    protected String instrument() {
        return "wiolonczela";
    }

    @Override
    protected double stawka() {
        return 250.0;
    }
}

class Flecista extends Muzyk {

    // konstruktor
    public Flecista(String imie, double czas) {
        super(imie, czas);
    }

    @Override
    protected String instrument() {
        return "flet";
    }

    @Override
    protected double stawka() {
        return 300.0;
    }
}

