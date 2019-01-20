package _9_kalkulator;

import java.util.Scanner;

public class KalkulatorKonsolowy3 {
    public static void main(String[] args) {
        System.out.println("Podaj kolejne działanie w formie");
        System.out.println("12 + 15");
        System.out.println("Zakończ wpisując napis nie będący liczbą");
        System.out.println();

        Scanner wejscie = new Scanner(System.in);
        while (true) {
            System.out.println("> ");
           if (! wejscie.hasNextDouble()) {
               break;
           }

            try {
                double arg1 = wejscie.nextDouble();
                String operacja = wejscie.next();
                double arg2 = wejscie.nextDouble();
                double wynik = oblicz(arg1, arg2, operacja);
                System.out.println("Wynik to: " + wynik);
            } catch (Exception e) {
                System.out.println("Błąd: "+ e);
                System.out.println("Błąd: "+ e.getMessage());
            }
        }
        System.out.println("Dziękujemy!");
    }

    private static double oblicz(double arg1, double arg2, String operacja) {
        switch (operacja) {
            case "+": return arg1 + arg2;
            case "-": return arg1 - arg2;
            case "*": return  arg1 * arg2;
            case "/": return arg1 / arg2;
            default: throw new  IllegalArgumentException("Nieznana operacja: " + operacja);
        }
    }
}
