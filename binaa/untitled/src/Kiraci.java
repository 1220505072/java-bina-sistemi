//HAMZA CAN ALTINTOP-1220505072
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Kiraci Sınıfı
public class Kiraci extends Personel {
    //özellikler
    private String ad;
    private String telefon;
    private EvSahibi evSahibi;
    private ArrayList<Daire> daireler;
    private int daireSayisi; //kiracının kiraladığı daire sayısı

    //yapıcı metod
    public Kiraci(String ad, String telefon, EvSahibi evSahibi) {
        super(ad, telefon);
        this.ad = ad;
        this.telefon = telefon;
        this.evSahibi = evSahibi;
        daireler = new ArrayList<Daire>();
        daireSayisi = 0; //başlangıçta daire sayısı 0
    }

    //get ve set metodları
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public EvSahibi getEvSahibi() {
        return evSahibi;
    }

    public void setEvSahibi(EvSahibi evSahibi) {
        this.evSahibi = evSahibi;
    }

    //bilgileri gösteren metod
    public void displayInfo() {
        System.out.println("Kiracı adı: " + ad);
        System.out.println("Kiracı telefonu: " + telefon);
        System.out.println("Kiracının ev sahibi: " + evSahibi.getAd());
        System.out.println("Kiracının kiraladığı daire:");
        //daireleri daire numarasına göre sırala
        Collections.sort(daireler, new Comparator<Daire>() {
            public int compare(Daire d1, Daire d2) {
                return d1.getDaireNo().compareTo(d2.getDaireNo());
            }
        });
        //daireleri göster
        for (Daire daire : daireler) {
            System.out.println(daire.getDaireNo() + " numaralı daire");
        }
    }

    //bir daire ekleme metodu
    public void addApartment(Daire daire) {
        //daire sayısı 1'den büyük değilse
        if (daireSayisi < 1) {
            //daireyi listeye ekle
            daireler.add(daire);
            //daire sayısını arttır
            daireSayisi++;
        }
    }
}