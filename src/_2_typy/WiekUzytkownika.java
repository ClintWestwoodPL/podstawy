package _2_typy;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WiekUzytkownika {
    public static void main(String[] args) {
        // klawiatura wejscie
        Scanner wejscie = new Scanner(System.in);
        {//zapytanie tekstowe:
            System.out.println("Podaj datę urodzenia (yyyy-mm-dd): ");
        }
//wejscie danych wpisanych - odpowiedz na zapytanie
        String data = wejscie.nextLine();
//ustalenie zmiennej LocalDate i czasu lokalnego
        LocalDate today = LocalDate.now();
//zamiana stringa wpisanego na datę i ustalenie formatu daty
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(data, formatter);
//period porównuje daty i daje wynik roznica - warunek dodatkowy getYears okresla ze wynik ma byc w latach
        Period roznica = Period.between(date,today);
        //drukuje wiek
        //System.out.println(roznica.getYears());
        //tekstowe zapytanie o teks:
        System.out.println("Podaj płeć K/M:");
        //podanie stringa ze skanera
        String plec = wejscie.nextLine();


        //warunki:
        if (roznica.getYears()<18){
         System.out.println("niepełnoletni");
        }
        else if(plec.equals("K")  && roznica.getYears()<65){
         System.out.println("produkcyjny");
        }
        else if(plec.equals("M") && roznica.getYears()<67) {
            System.out.println("produkcyjny");
        }
        else{
            System.out.println("emeryt");
        }


      /*  if(date1.compareTo(date2)>0){
            System.out.println("Date1 is after Date2");
        }else if(date1.compareTo(date2)<0){
            System.out.println("Date1 is before Date2");
        }else{
            System.out.println("Date1 is equal to Date2");
        }  */
    }
    LocalDate dataUrodzenia;
}
