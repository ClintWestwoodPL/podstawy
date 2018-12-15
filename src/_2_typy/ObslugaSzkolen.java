package _2_typy;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;

public class ObslugaSzkolen {
    public static void main(String[] args) {
        Szkolenie szkolenieJava = new Szkolenie("Szkolenie Java", 10, 1000, LocalDate.of(2018, Month.DECEMBER, 15)

        );

        szkolenieJava.nazwa = "Szkolenie Java";
        szkolenieJava.cena = 1000;
        szkolenieJava.liczbaUczestnikow = 10;
        szkolenieJava.data = LocalDate.of(2018, Month.DECEMBER, 15);

        System.out.print("Nazwa: ");
        System.out.println(szkolenieJava.nazwa);
        System.out.print("\t Ilość uczestników: ");
        System.out.println(szkolenieJava.liczbaUczestnikow);
        System.out.printf("\t Cena: %.2f PLN\n", szkolenieJava.cena);
        System.out.print("\t Data: ");
        System.out.println(szkolenieJava.data);

        Szkolenie szkoleniePython = new Szkolenie();

        szkoleniePython.nazwa = "Szkolenie Python";
        szkoleniePython.cena = 855;
        szkoleniePython.liczbaUczestnikow = 12;
        szkoleniePython.data = LocalDate.of(2018, Month.APRIL, 24);

        System.out.print("Nazwa: ");
        System.out.println(szkoleniePython.nazwa);
        System.out.print("\t Ilość uczestników: ");
        System.out.println(szkoleniePython.liczbaUczestnikow);
        System.out.printf("\t Cena: %.2f PLN\n", szkoleniePython.cena);
        System.out.print("\t Data: ");
        System.out.println(szkoleniePython.data);
    }

}
