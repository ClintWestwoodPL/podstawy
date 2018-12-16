package _4_kolekcje;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Zbior {

    public static void main(String[] args) {
        //w zbiorze elementy są unikalne i nieuporządkowane
        Set<String> numeryPesel = new HashSet<>();

        numeryPesel.add("89062404789");
        numeryPesel.add("89062404788");
        numeryPesel.add("89062404782");
        numeryPesel.add("89062404781");
        numeryPesel.add("89062404788");
        numeryPesel.add("89062404783");

        System.out.println(numeryPesel);

        numeryPesel.remove("89062404788");

        System.out.println(numeryPesel);

        if (numeryPesel.contains("89062404781")) {
            System.out.println("tak");
        }

            else {
                System.out.println("nie");
            }

         Set<String> posortowany = new TreeSet<>();
//TreeSet zachowuje kolejnosc dodawania elementow do wzoru

        posortowany.addAll(numeryPesel);

        System.out.println(posortowany);

        Set<String> kolejnosc = new LinkedHashSet<>();

        kolejnosc.add("Brajan");
        kolejnosc.add("Dżesika");
        kolejnosc.add("Sebek");

        System.out.println(kolejnosc);
    }
}
