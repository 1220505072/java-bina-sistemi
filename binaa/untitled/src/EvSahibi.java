//HAMZA CAN ALTINTOP-1220505072
import java.util.ArrayList;
import java.util.List;

// EvSahibi sınıfı
public class EvSahibi extends Personel {
    private Bina bina;
    private List<Daire> apartments; // ev sahibinin sahip olduğu daireler

    public EvSahibi(String name, String phoneNumber, Bina bina) {
        super(name, phoneNumber);
        this.bina = bina;
        this.apartments = new ArrayList<>();
    }

    public void displayInfo() {
        System.out.println("Ev Sahibi: " + getName() + " | Telefon Numarası: " + getPhoneNumber());
    }

    // ev sahibine daire ekleme metodu
    public void addApartment(Daire daire) {
        apartments.add(daire);
    }

    // ev sahibinin sahip olduğu daireleri gösterme metodu
    public void displayApartments() {
        System.out.println("Ev Sahibi: " + getName() + " | Telefon Numarası: " + getPhoneNumber());
        System.out.println("Ev Sahibinin Sahip olduğu daireler:");
        for (Daire daire : apartments) {
            daire.displayInfo();
        }
    }

    public String getAd() {
        return getName();
    }
}