public class Zmienne {
    public static void main(String[] args) {

        int liczba1;
        liczba1 = 13;

        double liczba2 = 5.9;

        System.out.println("Moja zmienna: " + liczba1 + "." + liczba2);

        liczba1 = (int)liczba2;

        //liczba2 = liczba1;
        System.out.println(liczba1);

        int hours = 8;
        int days = 5;
        int weeks = 52;

        int workHoursPerYear = hours * days * weeks;

        System.out.println("Wynik: " + workHoursPerYear);

        //Zły kod!!
        //System.out.println("Wynik " + (5 + 8));


        String napis = "Dzisiaj\t jest \"ciepło\"";
        napis += ".";

        System.out.println("Mój napis: " + napis);
        System.out.print("Mój\t napis: " + napis+"\n");
        System.out.print("Mój\n napis: " + napis);

        char znak = '#';

        boolean slonce = true; //false

    }
}
