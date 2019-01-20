package _7_pętle;

import java.util.Optional;
import java.util.OptionalInt;

public class FunkcjeNaTablicach {
    static int suma(int[] tablica){
        int suma = 0;
        for(int liczba : tablica) {
            suma += liczba;
        }
        return suma;
    /*    for (int i = 0; i < tablica.length; i++){
          //  suma = suma + tablica[i];
            suma += tablica[i];
        }
        return suma; */
    }
    static  int sumaParzystych(int[]tablica){

        int sumaParzystych = 0;

        for (int i = 0; i < tablica.length; i++){

            if (tablica[i] % 2 == 0) {

                sumaParzystych += tablica[i];
            }
        }
        return sumaParzystych;

    }
    static int max (int[]tablica){
        int wynik = Integer.MIN_VALUE;
        for (int x : tablica) {
            if (x > wynik){
                wynik = x;
            }
            //tutaj widzimy jeden element
        }
        return wynik;
    }

           static Integer maxx (int[]tablica) {
            //Integer
            if (tablica.length == 0){
                return null;
            }
            int wynik = tablica[0];
            for (int x : tablica) {
                if (x > wynik) {
                    wynik = x;
                }
                //tutaj widzimy jeden element
            }
            return wynik;
    }
    static OptionalInt maxxx (int[]tablica) {
        //Integer
        if (tablica.length == 0) {
            return OptionalInt.empty();
        }
        int wynik = tablica[0];
        for (int x : tablica) {
            if (x > wynik) {
                wynik = x;
            }
            //tutaj widzimy jeden element
        }
        return OptionalInt.of(wynik);
    }
    //dla wygody maina testujacego umieszczam w tym samym pliku
    public static void main(String[] args) {

        int[] a = {10, 20 ,30, 5, 10, 15};
        int[] b = {-20, 0, 5, 20};
        int[] c = {-10, -20,-5,-10};
        int[] e = {};

        System.out.println("suma a " + suma(a)); //90
        System.out.println("suma b " + suma(b)); //5

        System.out.println("suma parzystych a: " + sumaParzystych(a));
        System.out.println("suma parzystych b: " + sumaParzystych(b));

        System.out.println("maksymalne a: " + max(a));
        System.out.println("maksymalne b: " + max(b));
        System.out.println("maksymalne c: " + max(c));
        System.out.println("maksymalne e: " + max(e));

        System.out.println();
        System.out.println("maksymalne a: " + maxx(a));
        System.out.println("maksymalne b: " + maxx(b));
        System.out.println("maksymalne c: " + maxx(c));
        System.out.println("maksymalne e: " + maxx(e));

        System.out.println();

        Integer wynik = maxx(e);
        if (wynik!=null){
            System.out.println("Wynik wynosi: "+ wynik);
        }else{
            System.out.println("Wyniku nie ma");
        }
        System.out.println();

        System.out.println("maxxx a : " + maxxx(a));
        System.out.println("maxxx b : " + maxxx(b));
        System.out.println("maxxx c : " + maxxx(c));
        System.out.println("maxxx e : " + maxxx(e));

        OptionalInt opt = maxxx(e);
        if(opt.isPresent()) {
            System.out.println("Wynik wynosi " + opt.getAsInt());
        } else {
            System.out.println("Wyniku nie ma");
        }
        // inny sposób domyślna wartość (jeśli tablica pusta, przyjmij wynik 0)
        System.out.println(opt.orElse(0));
    }
}
