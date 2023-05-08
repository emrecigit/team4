package D6_Inheritance;

public class A013_Encapsulation_Rapor {
    public static void main(String[] args) {
        A012_Encapsulatiion rapor = new A012_Encapsulatiion();
        A012_Encapsulatiion ogrenci1 = new A012_Encapsulatiion();
        A012_Encapsulatiion ogrenci2 = new A012_Encapsulatiion();
        rapor.setSatisTutari(100);
        // System.out.println(rapor.setSatisTutari(100)); Setter Goruntuleyemez
        rapor.setSatisMiktari(5);
        // System.out.println(rapor.setSatisMiktari (100)); Setter Goruntuleyemez
        System.out.println("Toplam satis Miktari : "+rapor.getSatisToplami());
        // rapor.getSatisToplami(100); Getter Veri Girilemez
        System.out.println("================================================================");
        System.out.println("================================================================");
        ogrenci1.isim="Kemal"; // isim public oldugu icin yazdirabildi
        System.out.println(ogrenci1.isim); // isim public oldugu icin okunabildi
        System.out.println("****************************************************************");
        ogrenci2.setSoyIsim("Yilmaz");   // setter methodu ile giris yapildi
        System.out.println(ogrenci2.getSoyisim()); // getter methodu ile goruntulendi
    }
}
