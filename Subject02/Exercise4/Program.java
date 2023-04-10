package Exercise4;
import java.util.*;

public class Program {

    public static void main(String[] args) {
        String[] arr = {
                "salon A", "Mercedes", "130000",
                "salon B", "Mercedes", "120000",
                "salon C", "Ford", "110000",
                "salon B", "Opel", "90000",
                "salon C", "Honda", "95000",
                "salon A", "Ford", "105000",
                "salon A", "Renault", "75000"
        };

        Map<String, List<Samochod>> mapa = new HashMap<>();
        String nazwaSalonu = null;
        for (int i = 0; i < arr.length; i += 3) {
            nazwaSalonu = arr[i];
            Samochod samochod = new Samochod(arr[i + 1], Integer.parseInt(arr[i + 2]));
            mapa.computeIfAbsent(nazwaSalonu, k -> new ArrayList<>()).add(samochod);
        }
        System.out.println(mapa);

        String najtanszyModel = null;
        int najtanszaCena = Integer.MAX_VALUE;
        String najtanszySalon = null;
        for (String salon : mapa.keySet()) {
            for (Samochod samochod : mapa.get(salon)) {
                if (samochod.getCena() < najtanszaCena) {
                    najtanszyModel = samochod.getMarka();
                    najtanszaCena = samochod.getCena();
                    najtanszySalon = salon;
                }
            }
        }
        System.out.println(najtanszyModel + ", " + najtanszySalon + ", " + najtanszaCena);
    }

    private static class Samochod {
        private String marka;
        private int cena;

        public Samochod(String marka, int cena) {
            this.marka = marka;
            this.cena = cena;
        }

        public String getMarka() {
            return marka;
        }

        public int getCena() {
            return cena;
        }

        @Override
        public String toString() {
            return marka + " " + cena;
        }
    }
}