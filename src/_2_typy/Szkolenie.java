package _2_typy;

import java.time.LocalDate;

public class Szkolenie {

    double cena;
    int liczbaUczestnikow;
    String nazwa;
    LocalDate data;

    //1. tworzenie nowego obiektu
    // konstruktor, odpowiada za tworzzenie nowego obiektu: bezparametrycznhy
    public Szkolenie() {
        System.out.println("Wykonał się konstruktor bezparametryczny");
    }

    //konstruktor parametryczny
    public Szkolenie(String nazwa, int liczbaUczestnikow, double cena, LocalDate data) {

        System.out.println("Wykonał się konstruktor parametryczny");
        this.nazwa = nazwa;
        this.liczbaUczestnikow = liczbaUczestnikow;
        this.cena = cena;
        this.data = data;



    }

    //2. wypisanie informacji o obiekcie

}
