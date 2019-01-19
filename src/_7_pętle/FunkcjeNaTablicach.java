package _7_pętle;

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

    //dla wygody maina testujacego umieszczam w tym samym pliku
    public static void main(String[] args) {

        int[] a = {10, 20 ,30, 5, 10, 15};
        int[] b = {-20, 0, 5, 20};

        System.out.println("suma a " + suma(a)); //90
        System.out.println("suma b " + suma(b)); //5

        System.out.println("suma parzystych a: " + sumaParzystych(a));
        System.out.println("suma parzystych b: " + sumaParzystych(b));
    }
}
