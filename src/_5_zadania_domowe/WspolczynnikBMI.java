package _5_zadania_domowe;

import java.util.Scanner;

public class WspolczynnikBMI {
    public static void main(String[] args) {

        int waga ;
        double wzrost ;
        double bmi;


        System.out.println("Wyznaczmy Twoje BMI! ");
        System.out.println("Proszę podaj swoją wagę: ");

       Scanner in = new Scanner(System.in);
       waga = in.nextInt();

       System.out.println("A teraz podaj proszę swój wzrost, tylko w metrach i po przecinku! (m,cm)");
       wzrost = in.nextFloat();

        double potega = Math.pow(wzrost, 2);

        bmi = waga/potega;
        System.out.println("Twoje BMI to: ");
        System.out.format("%.2f%n", bmi);

        if ( bmi < 18.5) {

            System.out.println("Proponujemy zwiększyć rozmiar porcji każdego dnia!");
        }
        else if ( bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Tak trzymaj! Jest świetnie! ");
        }
        else if ( bmi >= 25.0 && bmi < 30.0) {
            System.out.println("Nie ma co panikować, ale może tak ograniczmy wizyty w McDonalds?");
        }

        else if ( bmi >= 30.0 && bmi < 35.0) {
            System.out.println("No dobra, zdecydowanie musimy popracować! Od dziś nazywasz się sport i zdrowe jedzenie!");
        }

        else if ( bmi >= 35.0 && bmi < 40.0) {
            System.out.println("Nie jest dobrze, mamy grybaska - do pracy i poradzimy sobie!");
        }
        else
        {
            System.out.println("Lubisz jak przez Ciebie skaczą? Planujesz karierę w japońskim Sporcie?");
            System.out.println("Nie? TO DO ROBOTY BO JEST DRAMAT!");
        }


    }
}