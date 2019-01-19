package _5_zadania_domowe;

import java.util.Arrays;

public class Test {
    public static void main(String args[]){
        //Tworzymy listę zakupów
        Lista3 chleb = new Lista3("chleb", "2,40", 20);
        Lista3 ser = new Lista3("ser", "1,80", 30);
        Lista3 szynka = new Lista3("szynka", "2,60", 25);
        Lista3 maslo = new Lista3("maslo", "5,000", 23);

        //umieszczamy naszych pracowników w tablicy
        Lista3[] prac = {chleb, ser, szynka, maslo};
        //tworzymy obiekt komparatora, który wcześniej napisaliśmy
        Komparator komp = new Komparator();
        //sortujemy tablicę przy użyciu komparatora
        Arrays.sort(prac, komp);
        //wyświetlamy posortowaną tablicę
        wyswietl(prac);
    }

    //metoda wyświetlajca tablicę w ładnej formie
    public static void wyswietl(Lista3[] prac){
        for(Lista3 p: prac)
            System.out.println(p);
    }
}