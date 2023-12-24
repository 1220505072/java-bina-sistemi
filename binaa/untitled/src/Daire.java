//HAMZA CAN ALTINTOP-1220505072
//Daire Sınıfı
public class Daire extends Konut implements Comparable<Daire> {
    //sınıf özellikleri
    private String ad; //dairenin adı
    private int kat; //dairenin bulunduğu kat
    private int apartmentNumber; //dairenin numarası
    private Bina bina; //dairenin ait olduğu bina

    //sınıf metodları
    //kurucu metod
    public Daire(String ad, int kat, int apartmentNumber, Bina bina) {
        super(ad);
        this.ad = ad;
        this.kat = kat;
        this.apartmentNumber = apartmentNumber;
        this.bina = bina;
    }

    //get ve set metodları
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getKat() {
        return kat;
    }

    public void setKat(int kat) {
        this.kat = kat;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public Bina getBina() {
        return bina;
    }

    public void setBina(Bina bina) {
        this.bina = bina;
    }

    //bilgi gösterme metodu
    public void displayInfo() {
        System.out.println("Daire Adı: " + ad + " | Kat: " + kat + " | Daire Numarası: " + apartmentNumber + " | Bina: " + bina.getAdres());
    }

    //karşılaştırma metodu
    public int compareTo(Daire other) {
        //önce daire numaralarını karşılaştır
        if (this.apartmentNumber < other.apartmentNumber) {
            return -1;
        } else if (this.apartmentNumber > other.apartmentNumber) {
            return 1;
        } else {
            //daire numaraları eşitse, 0 döndür
            return 0;
        }
    }
    //getDaireNo metodu


        public Integer getDaireNo() {
            return apartmentNumber;
        }
    }
