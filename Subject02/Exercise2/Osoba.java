package Exercise2;

public class Osoba implements Comparable<Osoba>{
    private String imie;
    private int wiek;

    Osoba(String imie, int wiek){
        this.imie=imie;
        this.wiek=wiek;
    }
    public String getImie(){
        return imie;
    }
    public int getWiek(){
        return wiek;
    }
    public void setImie(String imie){
        this.imie=imie;
    }
    public void setWiek(int wiek){
        this.wiek=wiek;
    }
    public String toString(){
        return "(" + imie + ", " + wiek + ")";
    }



    @Override
    public int Compareto(Osoba o) {
        int porownanieImion = imie.compareTo(o.getImie());
        if (porownanieImion != 0) {
            return porownanieImion;
        } else {
            return Integer.compare(wiek, o.getWiek());
        }
    }
    }


