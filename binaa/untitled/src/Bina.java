//HAMZA CAN ALTINTOP-1220505072
//Bina Sınıfı
public class Bina extends Konut {
    private String adres;
    private int katSayisi;

    public Bina(String adres, int katSayisi) {
        super(adres);
        this.adres = adres;
        this.katSayisi = katSayisi;
    }

    public void displayInfo() {
        System.out.println("Bina Adresi: " + adres + " | Kat Sayısı: " + katSayisi);
    }

    //get ve set metodları
    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getKatSayisi() {
        return katSayisi;
    }

    public void setKatSayisi(int katSayisi) {
        this.katSayisi = katSayisi;
    }
}


