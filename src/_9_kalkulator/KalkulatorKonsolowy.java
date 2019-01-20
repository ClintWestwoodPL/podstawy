package _9_kalkulator;

import java.util.Scanner;

public class KalkulatorKonsolowy {
    public static void main(String[] args) {
        System.out.println("Podaj kolejne działanie w formie");
        System.out.println("12 + 15");
        System.out.println("Zakończ wpisując napis nie będący liczbą");
        System.out.println();

        Scanner wejscie = new Scanner(System.in);
        while (true) {
            System.out.println("> ");
            try {
                double arg1 = wejscie.nextDouble();
                String operacja = wejscie.next();
                double arg2 = wejscie.nextDouble();
                double wynik = 0;

                if ("+".equals(operacja)) {
                    wynik = arg1 + arg2;
                }else if ("-".equals(operacja)) {
                    wynik = arg1 - arg2;
                }else if ("*".equals(operacja)) {
                    wynik = arg1 * arg2;
                } else if ("/".equals(operacja)) {
                    wynik = arg1 / arg2;
                } else {
                    System.out.println("Nie ma takiego działania: " + operacja);
                }


                System.out.println("Wynik to: " + wynik);


            } catch (Exception e) {
                break;
            }
        }
        System.out.println("Dziękujemy!");
    }
}
