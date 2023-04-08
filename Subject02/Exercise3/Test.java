package Exercise3;
import java.util.*;
import static java.lang.System.out;

public class Test {

    public static void main(String[] args) {

        List<Osoba> lista = Arrays.asList(
                new Osoba("Anna", 2000),
                new Osoba("Bartek", 2001),
                new Osoba("Maria", 2002)
        );
        out.println(Osoba.wKolekcji(lista, "Bartek", 2001));
        out.println(Osoba.wKolekcji(lista, "Daria", 2001));
        Set<Osoba> tZbior = new TreeSet<>(lista);
        out.println(Osoba.wKolekcji(tZbior, "Bartek", 2001));
        out.println(Osoba.wKolekcji(tZbior, "Daria", 2001));
        Set<Osoba> hZbior = new HashSet<>(lista);
        out.println(Osoba.wKolekcji(hZbior, "Bartek", 2001));
        out.println(Osoba.wKolekcji(hZbior, "Daria", 2001));

    }

}

/*
a. Czy podany program spowoduje błędy kompilacji? Jeśli tak poprawić klasę Osoba,

Nie, podany program nie powinien spowodować błędów kompilacji.

b. Czy wyniki w przypadku przekazania listy do metody wKolekcji są poprawne? Jeśli nie, poprawić klasę Osoba żeby osiągnąć poprawne wyniki,

Tak, wyniki w przypadku przekazania listy do metody wKolekcji są poprawne. Metoda contains wykorzystuje implementację metody equals klasy Object,
co w przypadku listy oznacza porównanie referencji do obiektów, a nie ich wartości.
Implementacja metody equals w klasie Osoba porównuje wartości pól imie i rokUrodzenia,
co pozwala na poprawne porównanie dwóch obiektów typu Osoba.


c. Czy wyniki w przypadku przekazania zbioru typu TreeSet do metody wKolekcji są poprawne? Jeśli nie, poprawić klasę Osoba żeby osiągnąć poprawne wyniki,

Nie, wyniki w przypadku przekazania zbioru typu TreeSet do metody wKolekcji nie są poprawne.
W przypadku zbioru typu TreeSet, aby elementy były posortowane, korzysta on z metody compareTo zaimplementowanej w klasie Osoba.
Ta implementacja jest jednak niepoprawna, ponieważ nie uwzględnia przypadku, gdy dwa obiekty mają takie same imiona.
Aby poprawić implementację, należy zmienić metodę compareTo w klasie Osoba

d. Czy wyniki w przypadku przekazania zbioru typu HashSet do metody wKolekcji są poprawne? Jeśli nie, poprawić klasę Osoba żeby osiągnąć poprawne wyniki.

 Tak, wyniki w przypadku przekazania zbioru typu HashSet do metody wKolekcji są poprawne. Zbiór typu HashSet korzysta z metod equals i hashCode
 zaimplementowanych w klasie Osoba, co pozwala na poprawne porównanie dwóch obiektów typu Osoba.

 */