package _2_typy;

public class Adres {

    String ulica;
    String miasto;
    String kodPocztowy;

    public Adres()  {
        System.out.println("Wykonał się konstruktor bezparametryczny");
    }

    public Adres (String ulica, String miasto, String kodPocztowy) {

        System.out.println("Wykonał się konstruktor parametryczny");

        this.ulica = ulica;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;

    }
    public void wyswietl() {

        System.out.println("Ulica:" + this.ulica);
        System.out.println("Miasto: " + this.miasto);
        System.out.println("Kod pocztowy: " + this.kodPocztowy);



    }

}
