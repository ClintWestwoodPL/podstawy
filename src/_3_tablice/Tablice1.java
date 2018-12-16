package _3_tablice;

public class Tablice1 {
    public static void main(String[] args) {
        int[] tablica = new int[8];

        System.out.println("Długość tablicy: " + tablica.length);

        System.out.println("Element 3. tablicy: " + tablica[2]);

      //  System.out.println("Element nieistniejący: " + tablica[8]);
        // pojawia sie wtedy wyjatek

        tablica[4] = 177;

        System.out.println("Element 5. tablicy:  " + tablica[4]);

        int[] tablicaWypelniona = {178, 185, 189, 177};

        //i++ == i=i+1 {postinkrementacja)
        //++i (preinkrementacja)
        //i--
        //--i

        for (int i = 0; i < tablicaWypelniona.length; i++) {
            System.out.println(i + ": " + tablicaWypelniona[i]); }
        System.out.println();

            for (int i = tablicaWypelniona.length - 1; i >= 0; i-- ) {
                System.out.println(i + ": " + tablicaWypelniona[i]);
        }
        System.out.println();

            for (int i = 0; i < tablicaWypelniona.length; i = i + 2)

        System.out.println(i + ": " + tablicaWypelniona[i]);

            for (int tmp: tablicaWypelniona) {
                System.out.println(tmp);
            }

    }
}
