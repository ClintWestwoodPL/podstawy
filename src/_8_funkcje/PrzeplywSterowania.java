package _8_funkcje;

public class PrzeplywSterowania {

    static void metoda0() {
        System.out.println("To jest metoda 0");
    }

    static void metoda1() {
        System.out.println("Metoda 1");
    }

    public static void main(String[] args) {
        System.out.println("Początek programu");
        PrzeplywSterowania.metoda1();
        System.out.println("A znowu metoda main");
        metoda1(); //nie trzeba podawac nazwy klasy w ktorej jestesmy
        System.out.println("B znowu jestem main");
        System.out.println();
        metoda2("Ala ma kota");
        System.out.println();
        metoda2("Katowice to fajne miasto.");
        int wynik = powtorz("Lubię javę", 3);
        System.out.println("Wynik powtarzania: " + wynik);
        System.out.println();
        System.out.println("Koniec programu");


    }

    static void metoda2(String napis) {
        System.out.println("metoda2 otrzymała parametr " + napis);
        System.out.println("Ten napis ma liter: " + napis.length());
        System.out.println("A napisany wielkimi literami: " + napis.toUpperCase());
    }

    static int powtorz(String napis, int ileRazy) {
        for(int i = 0; i < ileRazy; i++) {
            System.out.println(napis);
        }
        return napis.length() * ileRazy;
    }
}
