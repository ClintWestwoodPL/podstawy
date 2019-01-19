package _7_pętle;

import java.util.Scanner;

public class Skarbonka {

    public static void main(String[] args) {

       /* while (warunek) {
              instrukcje
       } */
/* Jaś dostał pusta skarbonke i chce zebrac 100zl.
program w petli bedzie prosil o wrzucenie pieniazka do skaarbonki az uzbiera 100zl
 */

       Scanner wejscie = new Scanner(System.in);

       int skarbonka = 0;
       while(skarbonka < 100) {
           System.out.println("Wrzuć monetę: ");
           int wrzutka = wejscie.nextInt();
           skarbonka = skarbonka+wrzutka;
       }
        System.out.println("Udało się zebrać: " + skarbonka);


    }
}
