package _5_zadania_domowe;

import java.util.Scanner;

public class RokPrzestepny {

    public static void main(String[] args) {

        int rok;

        System.out.println("Sprawdźmy czy rok jest przestępny\n");
        System.out.println("Podaj rok: ");

        Scanner rokPrzestepny = new Scanner(System.in);
        rok = rokPrzestepny.nextInt();

        if(rok%4==0 && rok%100!=0 || rok%400==0){
            System.out.println("Rok jest przestępny!");
        }
        else{
            System.out.println("Rok nie jest przestepny!");
        }

    }


    }

