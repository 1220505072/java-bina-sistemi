//HAMZA CAN ALTINTOP-1220505072
//Personel Sınıfını EvSahibi sınıfını karmaşık hale getirmemesi ve miras alarak extends kullanması için oluşturdum.
public class Personel {
    private String name;
    private String phoneNumber;

    public Personel(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}