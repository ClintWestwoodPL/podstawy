package _zadania;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {

        int ileDorosly;
        int ileDzieciak;
        int ileNiemowlak;
        int adult = 180;
        int kid = 120;
        int child = 20;
        int kwotaDorosly = 0;
        int kwotaDzieciak = 0;
        int kwotaNiemowlak = 0;
        double kwota = 0;


        System.out.println("Podaj ilość rezerwacji dla");
        System.out.println("Dorosłych: ");

        Scanner in = new Scanner(System.in);
        ileDorosly = in.nextInt();
        if (ileDorosly != 0)
        {kwotaDorosly = adult * ileDorosly;}

        //  System.out.println(kwotaDorosly);


        System.out.println("Podaj ilość rezerwacji dla");
        System.out.println("Dzieci powyżej 1go roku życia: ");


        ileDzieciak = in.nextInt();
        if (ileDzieciak != 0)
        {kwotaDzieciak = kid * ileDzieciak;}


        System.out.println("Podaj ilość rezerwacji dla");
        System.out.println("Dzieci poniżej 1go roku życia: ");

        ileNiemowlak = in.nextInt();

        if (ileNiemowlak != 0)
        {kwotaNiemowlak = child * ileNiemowlak;}

        System.out.println("Proszę podać datę rozpoczęcia pobytu: ");
        System.out.println(" RRRR-MM-DD ");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String poczatek = in.next();
        LocalDate dataPoczatek = LocalDate.parse(poczatek, formatter);

        System.out.println("Proszę podać datę zakończenia pobytu: ");
        System.out.println(" RRRR-MM-DD ");


        String koniec = in.next();
        LocalDate dataKoniec = LocalDate.parse(koniec, formatter);

        Period czasPobytu = Period.between(dataPoczatek, dataKoniec);

        int dni = czasPobytu.getDays();
        int calosc = kwotaDorosly + kwotaDzieciak + kwotaNiemowlak;
        double rabat = calosc * 0.10;

       if (dni < 10){
        kwota = kwotaDorosly + kwotaDzieciak + kwotaNiemowlak; }

       else {
        kwota = kwotaDorosly + kwotaDzieciak + kwotaNiemowlak - rabat;
       }


      //  System.out.println("Cena za dobę to: ");
      //  System.out.println(kwota + " PLN");
        System.out.println("Cena całego pobytu to: ");
        System.out.println(kwota * dni + " PLN");

    }


}

