package _4_kolekcje;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String, Integer> inwentarz = new HashMap<>();

        inwentarz.put("Mysz", 4);
        inwentarz.put("Głośniki", 10);
        inwentarz.put("Monitor", 2);

        System.out.println(inwentarz);

        inwentarz.put("Mysz", 10);

        System.out.println(inwentarz);

        System.out.println("Stan głośników: " + inwentarz.get("Głośniki"));

        System.out.println (inwentarz.keySet());

        int suma = 0;

        for (String klucz : inwentarz.keySet()) {
            suma = suma + inwentarz.get(klucz);
        }

        System.out.println("suma produktów: " + suma);
    }
}
