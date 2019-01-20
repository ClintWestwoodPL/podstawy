package _9_kalkulator;

import java.util.Scanner;

public class KalkulatorKonsolowy2 {
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
                double wynik;

                switch (operacja) {
                    case "+":
                        wynik = arg1 + arg2;
                        break;
                    case "-":
                        wynik = arg1 - arg2;
                        break;
                    case "*":
                        wynik = arg1 * arg2;
                        break;
                    case "/":
                        wynik = arg1 / arg2;
                        break;
                    default:
                        wynik = 0;
                }
                System.out.println("Wynik to: " + wynik);

            } catch (Exception e) {
                break;
            }
        }
        System.out.println("Dziękujemy!");
    }
}
