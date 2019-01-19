package _5_zadania_domowe;

public class Lista3 {

    private String nazwa;
    private double cena;
    private int ilosc;

    public Lista3(String nazwa, double cena, int ilość) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.ilosc = ilosc;
    }

    String getNazwa(){ return nazwa;}
    double getCena(){ return cena;}
    int getIlosc(){ return ilosc;}

    public String toString() {

        return "Nazwa: "+nazwa+"Cena: "+cena+"Ilość: "+ilosc;

    }




    }

