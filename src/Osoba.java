public class Osoba {
    private int id;
    private String imie;
    public static int licznik = 0;

    public Osoba() {
        this.imie = "";
        this.id = 0;
        licznik++;
    }

    public Osoba(int id, String imie) {
        this.id = id;
        this.imie = imie;
        licznik++;
    }

    public Osoba(Osoba osoba) {
        this.imie = osoba.imie;
        this.id = osoba.id;
        licznik++;
    }

    public void wypiszDane(String argument) {
        if (imie == "") {
            System.out.println("brak danych");
        } else {

            System.out.println("Cześć" + argument + "masz na imie " + imie);
        }
    }
}