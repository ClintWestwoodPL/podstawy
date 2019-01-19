package _7_pętle;

import java.util.Scanner;

public class Skarbonka1 {

    public static void main(String[] args) {


       Scanner wejscie = new Scanner(System.in);

       int skarbonka = 0;
       while(skarbonka < 100) {
           System.out.println("Wrzuć monetę: ");
           skarbonka += wejscie.nextInt();
       }
        System.out.println("Udało się zebrać: " + skarbonka);


    }
}
