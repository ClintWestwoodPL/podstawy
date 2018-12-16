package _2_typy;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;

public class ObslugaSzkolen {


    public static void main(String[] args) {
        Adres adresSzkoleniaJava = new Adres ("Dąbrowskiej 12", "Siemianowice", "41-103");
        Szkolenie szkolenieJava = new Szkolenie("Szkolenie Java", 10, new BigDecimal ("1000"),
                LocalDate.of(2018, Month.DECEMBER, 15), adresSzkoleniaJava

        );


        szkolenieJava.wyswietl();

        BigDecimal przychodBrutto = szkolenieJava.obliczPrzychodBrutto();
        BigDecimal przychodNetto = szkolenieJava.obliczPrzychodNetto();
        System.out.println("Przychód ze szkolenia Brutto: " + przychodBrutto);
        System.out.println("Przychód ze szkolenia Netto: " + przychodNetto);



        Adres adresSzkoleniaPython = new Adres ("Dąbrowskiej 12", "Siemianowice", "41-103");
        Szkolenie szkoleniePython = new Szkolenie("Szkolenie Python", 855, new BigDecimal ("12"), LocalDate.of(2018, Month.APRIL, 24),
adresSzkoleniaPython

        );



      szkoleniePython.wyswietl();


    }

}
