package _typy;

import java.util.Scanner;

public class TypyObiektowe {

    public static void main(String[] args)


    {


        Scanner wejscie = new Scanner(System.in);
        {
            System.out.print("Podaj imię: ");
        }
        String imie = wejscie.nextLine();

        int iloscZnakow = imie.length();

        System.out.println("Słowo: " + imie + " ma " + iloscZnakow + " znaków");

        if (iloscZnakow <= 6) {
            System.out.println("Krótkie słowo");
            //co się ma stać
        } else {
            System.out.println("Długie słowo");

        }

        /*
        boolean czyKonczySieNaA = imie.endsWith ("a") ||
         */

        if ((imie.charAt(imie.length()-1)=='a' || imie.charAt(imie.length()-1)=='A') && !imie.equalsIgnoreCase("Kuba") ) {



            System.out.println("Damskie");
        }   else {
            System.out.println("Męskie");
        }


    }

}
