HAMZA CAN ALTINTOP-1220505072
**Proje Açıklaması:** <br>

Bu Java projesi, uml sınıf diyagramının yapısına uyularak bina, daire, evSahibi ve kiracıları modelleyen bir yönetim sistemi tasarlamak üzere oluşturulmuştur. <br>
**Proje içerisindeki içerikler ve özellikleri şunlardır:**"<br>

**1. Bina Sınıfı (Bina.java):** <br>
     Adres ve kat sayısı ile binayı temsil eder. <br>
     displayInfo() - Bina bilgilerini yazdırır.<br>

**2. Konut Sınıfı (Konut.java):** <br>
     Bina için üst sınıftır ve adres tutar.<br>
     Metodlar: displayInfo() - Konut bilgilerini yazdırır.<br>

**3. Personel Sınıfı (Personel.java):** <br>
     Ev sahibinde kullanmak için isim ve telefon numarası tutar.<br>

**4. EvSahibi Sınıfı (EvSahibi.java):** <br>
     İsim, telefon numarası, bir binaya ait olma, sahip olduğu daireler ile Ev sahibi bilgilerini ve sahip olduğu daireleri temsil etmek.<br>
     displayInfo() - Ev sahibi bilgilerini ekrana yazdırma, addApartment(Daire daire) - Ev sahibine daire ekleme, displayApartments() - Sahip olduğu daireleri ekrana yazdırma.<br>

**5. Daire Sınıfı (Daire.java):** <br>
     Ad, kat, daire numarası, ait olduğu bina bilgisi.<br>
     displayInfo() - Daire bilgilerini ekrana yazdırma, compareTo(Daire other) - Daireleri karşılaştırma, getDaireNo() - Daire numarasını alma.<br>

**6. Kiraci Sınıfı (Kiraci.java):** <br>
     Personel sınıfından çoğaltılmıştır. İsim, telefon numarası, ev sahibi, kiraladığı daireyi içeren kiracı bilgisini içerir.<br>
     displayInfo() - Kiracı bilgilerini ekrana yazdırma, addApartment(Daire daire) - Kiracıya daire ekleme.<br>

**7. Main Sınıfı (Main.java):** <br>
    Bir bina, bir ev sahibi, bir kiracı ve birkaç daire oluşturularak işlemler gerçekleştiriliyor. Bilgiler ekrana yazdırılıyor ve daireler daire numarasına göre sıralanıyor.<br>

 **Proje Kullanım Açıklaması:** <br>

   
        // Temel nesnelerin oluşturulması<br>
        Bina bina = new Bina("Tanrıverdi Towers", 3);<br>
        EvSahibi evSahibi = new EvSahibi("Murat", "0542 763 2033", bina);<br>
        Kiraci kiraci = new Kiraci("Hamza", "0541 664 3054", evSahibi);<br>

        // Dairelerin oluşturulması<br>
        Daire daire1 = new Daire("Çıtakoğlu", 1, 1, bina);<br>
        Daire daire2 = new Daire("Çıtakoğlu", 2, 2, bina);<br>
        Daire daire3 = new Daire("Çıtakoğlu", 3, 3, bina);<br>

        // Kiracıya dairelerin eklenmesi<br>
        kiraci.addApartment(daire1);<br>
        kiraci.addApartment(daire2);<br>
        kiraci.addApartment(daire3);<br>

        // Bilgilerin ekrana yazdırılması<br>
        evSahibi.displayInfo();<br>
        bina.displayInfo();<br>
        kiraci.displayInfo();<br>

        // Ev sahibine dairelerin eklenmesi<br>
        evSahibi.addApartment(daire1);<br>
        evSahibi.addApartment(daire2);<br>
        evSahibi.addApartment(daire3);<br>

        // Ev sahibinin dairelerinin ekrana yazdırılması<br>
        evSahibi.displayApartments<br>
    }
}
**Soruda da istenildiği gibi kiracı bir ev sahibi olabilir, ev sahibi aynı binada birden fazla daireye sahip olabilir ve daireler daire numarasından sıralanabilir bir şekilde ayarlanmıştır.** <br>
**Burada da ekran çıktısı şöyledir:** <br>
![Ekran görüntüsü 2023-12-24 203947](https://github.com/1220505072/java-bina-sistemi/assets/127992796/5f975a44-6dc0-4de5-8807-5cceb7cab2ea)
![Ekran görüntüsü 2023-12-24 204002](https://github.com/1220505072/java-bina-sistemi/assets/127992796/3e4d1295-dbb8-4eff-bef8-504dbdd5567c)



