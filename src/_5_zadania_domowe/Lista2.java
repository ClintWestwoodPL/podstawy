package _5_zadania_domowe;

import java.util.Scanner;

public class Lista2 {

    public static void main(String[] args) {

        String[][] zakup = new String[3][3];

        System.out.println("Nazwa produktu: ");

        Scanner lista = new Scanner(System.in);
        String towar = lista.nextLine();

        zakup[0][0] = towar;

        System.out.println("Podaj cenę: ");

        String cena = lista.nextLine();

        zakup[1][0] = cena;

        System.out.println("Podaj ilość: ");

        String ile = lista.nextLine();

        zakup[2][0] = ile;

        System.out.println("Nazwa produktu: ");

        String towar1 = lista.nextLine();

        zakup[0][1] = towar1;

        System.out.println("Podaj cenę: ");

        String cena1 = lista.nextLine();

        zakup[1][1] = cena1;

        System.out.println("Podaj ilość: ");

        String ile1 = lista.nextLine();

        zakup[2][1] = ile1;

        System.out.println("Nazwa produktu: ");

        String towar2 = lista.nextLine();

        zakup[0][2] = towar2;

        System.out.println("Podaj cenę: ");

        String cena2 = lista.nextLine();

        zakup[1][2] = cena2;

        System.out.println("Podaj ilość: ");

        String ile2 = lista.nextLine();

        zakup[2][2] = ile2;

     //    System.out.println(zakup[2][2]);


     /*   for (int i = 0; i < zakup.length; i++) {
            for (int j = 0; j < zakup[i].length; j++) {
                zakup[i][j] = lista.nextLine();
            }
        }*/
       for (int j = 0; j < zakup.length; j++) {
            for (int i = 0; i < zakup[j].length; i++) {
                System.out.print(zakup[i][j] + " ");
            }
            System.out.println();

        }
    }
}