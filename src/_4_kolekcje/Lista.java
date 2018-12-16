package _4_kolekcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {

    public static void main(String[] args) {

        List<String> imiona = new ArrayList<>();
        //ArrayList to lista oparta na tablicy
        //lista jest typem generycznym
        imiona.add("Tomasz");
        imiona.add("Gosia");
        imiona.add("Gaugan");

        //imiona.addAll() dodaje z innej listy

        System.out.println(imiona);

        System.out.println("Rozmiar: " + imiona.size());

        System.out.println("Pozycja 1: " + imiona.get(1));

        for (String imie : imiona) {
            if (imie.endsWith("a")) {
                System.out.println(imie);
                break;
            }
        }

        imiona.remove("Tomasz");

        System.out.println(imiona);

        if (imiona.contains("Gosia")) {
            System.out.println("tak");
        } else {
            System.out.println("nie");
        }

        Collections.sort(imiona);

        System.out.println(imiona);


    }
}
