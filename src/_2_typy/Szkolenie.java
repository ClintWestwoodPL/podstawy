package _2_typy;

import com.sun.xml.internal.ws.assembler.jaxws.ValidationTubeFactory;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Szkolenie {

    BigDecimal cena;
    int liczbaUczestnikow;
    String nazwa;
    LocalDate data;
    Adres adres;

    //1. tworzenie nowego obiektu
    // budowa konstruktora = [public/private] [nazwa] [(lista_parametrów)]
    //nazwa taka sama jak nazwa klasy
    // konstruktor, odpowiada za tworzzenie nowego obiektu: bezparametrycznhy
    public Szkolenie() {
        System.out.println("Wykonał się konstruktor bezparametryczny");
    }

    //konstruktor parametryczny
    public Szkolenie(String nazwa, int liczbaUczestnikow, BigDecimal cena, LocalDate data, Adres adres) {

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

    public BigDecimal obliczPrzychodBrutto() {

     //   double przychod = this.liczbaUczestnikow * this.cena

     //   return przychod;
      // return this.liczbaUczestnikow * this.cena;
        return cena.multiply(BigDecimal.valueOf(liczbaUczestnikow));
    }

    public BigDecimal obliczPrzychodNetto() {
       // return liczbaUczestnikow*cena/1.23;
      //  return obliczPrzychodBrutto()/1.23;
    // zapis uproszczony niepoprawny
       // return obliczPrzychodBrutto().divide(BigDecimal.ONE.add(StaleAplikacji.STAWKA_VAT),2, RoundingMode.HALF_UP);


        BigDecimal vat = BigDecimal.ONE.add(StaleAplikacji.STAWKA_VAT);
        return  obliczPrzychodBrutto().divide(vat, 2, RoundingMode.HALF_UP);
    }
}
