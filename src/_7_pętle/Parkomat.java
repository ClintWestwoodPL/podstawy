package _7_pętle;

import java.util.Scanner;

public class Parkomat {
    public static void main(String[] args) {

        final int STAWKA = 3;
       // int godziny = 0;

        System.out.println("Ile godzin będziesz parkować: ");

        Scanner wejscie = new Scanner(System.in);
        int godziny = wejscie.nextInt();
        int koszt = godziny * STAWKA;

        System.out.println("Koszt parkowania to: " +koszt+"zł");

        int pozostalo = 0;
        int parkomat = 0;
        while(parkomat < koszt) {
            System.out.print("Wrzuć monetę: ");
            int moneta = wejscie.nextInt();
            parkomat += moneta;
            System.out.println("Pozostało: " + (pozostalo = koszt - parkomat) + "zł");
        }
        System.out.println("Zapłaciłeś: " + parkomat + "zł");
        System.out.println("Reszta do wydania: " + (pozostalo*-1) + "zł");

    }
}
