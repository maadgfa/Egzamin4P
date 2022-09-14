import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("liczba zarejestrowanych osób "+Osoba.licznik);
        Osoba osoba1 = new Osoba();
        //wczytywanie z klawy
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj imie");
        String imieWczytane=klawiatura.nextLine();
        System.out.println("Podaj id");
        int idWczytane= klawiatura.nextInt();
        //tworzenie obiektu
        Osoba osoba2 = new Osoba(idWczytane,imieWczytane);
        Osoba osoba3 = new Osoba(osoba2);
        osoba1.wypiszDane("Jan");
        osoba2.wypiszDane("Jan");
        osoba3.wypiszDane("Jan");
        System.out.println("liczba zarejestrowanych osób "+Osoba.licznik);
    }
}