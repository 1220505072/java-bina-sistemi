//HAMZA CAN ALTINTOP-1220505072
// Main sınıfı
public class Main {
    public static void main(String[] args) {
        //bir bina nesnesi oluştur
        Bina bina = new Bina("Tanrıverdi Towers" +
                "", 3);

        //bir ev sahibi nesnesi oluştur
        EvSahibi evSahibi = new EvSahibi("Murat", "0542 763 2033", bina);

        //bir kiracı nesnesi oluştur
        Kiraci kiraci = new Kiraci("Hamza", "0541 664 3054", evSahibi);

        //birkaç daire nesnesi oluştur
        Daire daire1 = new Daire("Çıtakoğlu", 1, 1, bina);
        Daire daire2 = new Daire("Çıtakoğlu", 2, 2, bina);
        Daire daire3 = new Daire("Çıtakoğlu", 3, 3, bina);

        //kiracıya daireleri ekle
        kiraci.addApartment(daire1);
        kiraci.addApartment(daire2);
        kiraci.addApartment(daire3);

        //bilgileri göster
        evSahibi.displayInfo();
        bina.displayInfo();
        kiraci.displayInfo();

        //ev sahibine birden fazla daire ekle
        evSahibi.addApartment(daire1);
        evSahibi.addApartment(daire2);
        evSahibi.addApartment(daire3);

        //ev sahibinin bilgilerini ve sahip olduğu daireleri göster
        evSahibi.displayApartments();
    }
}


