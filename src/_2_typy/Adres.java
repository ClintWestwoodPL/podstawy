package _2_typy;

public class Adres {

    String ulica;
    String miasto;
    String kodPocztowy;

    public Adres()  {
        System.out.println("Wykonał się konstruktor bezparametryczny");
    }

    public Adres (String ulica, String miasto, String kodPocztowy) {


        this.ulica = ulica;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;

    }
    public void wyswietl() {

        System.out.println("\t Ulica: " + this.ulica);
        System.out.println("\t Miasto: " + this.miasto);
        System.out.println("\t Kod pocztowy: " + this.kodPocztowy);



    }

}
