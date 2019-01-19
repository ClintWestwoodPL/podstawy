package _zadania_wyjasnionie;


import static _zadania_wyjasnionie.KonwersjaJednostek.*;

public class TestyJednostek {
    public static void main(String[] args) {
        System.out.println("100 mil= " + MileNaKilometry(100)+ " km");
        System.out.println("100 km= " + KilometryNaMile(100)+ " mil");
        System.out.println("100 Far= " + FarNaCel(100)+ " Cel");
        System.out.println("100 Cel= " + CelNaFar(100)+ " Far");



    }
}
