//HAMZA CAN ALTINTOP-1220505072
//Konut Sınıfı
public class Konut {
    private String adres;

    public Konut(String adres) {
        this.adres = adres;
    }

    public void displayInfo() {
        System.out.println("Konut Adresi: " + adres);
    }
}