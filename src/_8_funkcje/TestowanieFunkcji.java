package _8_funkcje;

public class TestowanieFunkcji {
    public static void main(String[] args) {
        double [] liczby = {0,5,1.5,-7,10};

        for(double liczba : liczby) {
            double kwadrat = FunkcjeGeometryczne.poleKwadratu(liczba);
            double kolo = FunkcjeGeometryczne.poleKoła(liczba);
            System.out.println(" Dla liczby: " + liczba +
            " pole kwadratu wynosi " + kwadrat + " a pole koła "+ kolo);
        }

    }
}
