package _2_typy;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Szkolenie {

    double cena;
    int liczbaUczestnikow;
    String nazwa;
    LocalDate data;
    Adres adres;

    //1. tworzenie nowego obiektu
    // budowa konstruktora = [public/private] [nazwa] [(lista_parametrów)]
    //nazwa taka sama jak nazwa klasy
    // konstruktor, odpowiada za tworzzenie nowego obiektu: bezparametrycznhy
    public Szkolenie(String szkolenie_java, int i, int i1, LocalDate of) {
        System.out.println("Wykonał się konstruktor bezparametryczny");
    }

    //konstruktor parametryczny
    public Szkolenie(String nazwa, int liczbaUczestnikow, double cena, LocalDate data, Adres adres) {

        System.out.println("Wykonał się konstruktor parametryczny");
        this.nazwa = nazwa;
        this.liczbaUczestnikow = liczbaUczestnikow;
        this.cena = cena;
        this.data = data;
        this.adres = adres;



    }

    //2. wypisanie informacji o obiekcie
    //tworzenie metody
    //[public/private] [typ_zwracany] [nazwa] [(lista_parametrów)]
    public void wyswietl() {

        System.out.print("Nazwa: ");
        System.out.println(this.nazwa);
        System.out.print("\t Ilość uczestników: ");
        System.out.println(this.liczbaUczestnikow);
        System.out.printf("\t Cena: %.2f PLN\n", this.cena);
        System.out.print("\t Data: ");
        System.out.println(this.data);
        adres.wyswietl();
    }
}
