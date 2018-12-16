package _2_typy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TypPieniezny {

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("7.38");
        BigDecimal b = new BigDecimal("3.99");

// BigDecimal, zawsze do podawania kasy, jest

        BigDecimal suma = a.add(b);
        BigDecimal roznica = a.subtract(b);
        BigDecimal iloczyn = a.multiply(b).setScale(2, RoundingMode.HALF_UP);
        //przy dodawaniu, mnozeniu i odejmowaniu uzywamy zakresu przez newScale - dodane jako patametr koncowy
        BigDecimal iloraz = a.divide(b, 2, RoundingMode.HALF_UP);
        // przy dzieleniu w aplkacji zaokrąglenie konieczne, dodawane jako argument w nawiasie
        System.out.println(suma);
        System.out.println(roznica);
        System.out.println(iloczyn);
        System.out.println(iloraz);
    }
}
