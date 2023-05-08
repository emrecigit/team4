package D4_Ornekler;

import java.util.Scanner;

public class D03_OrneklerSifreDoWhileLoop {

    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
        kontrol edin ve sifredeki hatalari yazdirin.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
        sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
        1- Sifre kucuk harf icermelidir // sifre>='a' && sifre<='z'
        2- Sifre buyuk harf icermelidir // sifre>='a' && sifre<='z'
        3- Sifre ozel karakter icermelidir // ASCII 32 - 47 / 58-64 / 91-96 / 123-126
        4- Sifre rakam icermelidir. // sifre>=0 && sifre<=9
        5- Sifre en az 8 karakter olmalidir.
         */
        Scanner scan =new Scanner(System.in);
        String sifre;
        int denemeSayisi=0; // Soruya 3 deneme hakkıda eklemeyi deneyelim.
        int bayrak; //her şart sağlandığında bayrak 1 artacak,while bayrak !=4 olduğu sürece calışacak
        do {
            System.out.print("Lutfen bir sifre giriniz : " +
                    "\nSifreniz içinde kucuk harf , buyuk harf , ozel karakter ve rakam bulundurmalidir : ");
            sifre=scan.nextLine();

            // tum hataları yazdirmak istersek bagimsiz if ve bayrak kullanmaliyiz
            bayrak=0;
            // 1- Sifre kucuk harf icermelidir // sifre>='a' && sifre<='z'
            // kucuk harf kontrolu yapan bir method olusturalım kucuk harf varsa 1 ,yoksa 0 döndursun
            int sonuc = kucukHarfKontroluYap(sifre);
            // method kucuk harf bulduysa bayrak 0 idi sonuc(yani 1) eklendi ve bayrak 1 oldu
            bayrak = bayrak + sonuc;
            //================================================================
            // 2- Sifre buyuk harf icermelidir // sifre>='a' && sifre<='z'
            // buyuk harf kontrolu yapan bir method olusturalım kucuk harf varsa 1 ,yoksa 0 döndursun
            sonuc = buyukHarfKontroluYap(sifre);
            // method buyuk harf bulduysa bayrak 1 idi sonuc(yani 1) eklendi ve bayrak 2 oldu
            bayrak = bayrak + sonuc;
            //================================================================
            // 3- Sifre ozel karakter icermelidir // ASCII 32 - 47 / 58-64 / 91-96 / 123-126
            // ozel karakter kontrolu yapan bir method olusturalım kucuk harf varsa 1 ,yoksa 0 döndursun
            sonuc = ozelKarakterKontroluYap(sifre);
            // method ozel karakter bulduysa bayrak 2 idi sonuc(yani 1) eklendi ve bayrak 3 oldu
            bayrak = bayrak + sonuc;
            //================================================================
            //4- Sifre rakam icermelidir. // sifre>=0 && sifre<=9
            // rakam kontrolu yapan bir method olusturalım rakam varsa 1 ,yoksa 0 döndursun
            sonuc = rakamKontroluYap(sifre);
            // method rakam bulduysa bayrak 1 idi sonuc(yani 1) eklendi ve bayrak 2 oldu
            bayrak = bayrak + sonuc;
            //================================================================
            //5- Sifre en az 8 karakter olmalidir.
            if (sifre.length()<8) {
                System.err.println("Sifre en az 8 karakter olmalidir");
            }else {  // sifre lenght 8 den buyukse bayrak 4 idi ,bayrak arttı ve sonuca eklendi bayrak 5 oldu ve sifre basari ile tamamlandi
                bayrak++;
                System.out.println("Sifre basari ile kaydedilmistir.");
            }
            //================================================================
            // bayrak 5 ise sifre basarili degilse hata vardir
        }while (bayrak!=5);
    }
    public static int rakamKontroluYap(String sifre) {
        // 4- Sifre rakam icermelidir // sifre>=0 && sifre<=9
        //  Bunun için tum harfleri kontrol edecek bir forLoop olusturmaliyiz
        //  Bir tane rakam bulursak yeterli olacak
        int bayrak=0;
        for (int i = 0; i <sifre.length() ; i++) {
            if (sifre.charAt(i)>='0' && sifre.charAt(i)<='9'){
                bayrak++; // bayrak artti ise rakam bulduk bayrak 1 ,yoksa bayrak 0 ve olumsuz mesajı verecegiz
                break; // break if icine yazıldı cunku bir rakam bulmak yeterli ve burdan if ve for döngüsünden çıkıyoruz.
            }
        }
        if (bayrak==0) { // bayrak ==0 ise rakam yoktur, yani bir hata vardır bunu yazdiralim
            System.err.println("Sifre rakam icermelidir");
            return 0; // rakam yok
        }else return 1; // rakam var
    }
    public static int ozelKarakterKontroluYap(String sifre) {
        // 3- Sifre ozel karakter icermelidir // ASCII 32 - 47 / 58-64 / 91-96 / 123-126
        //  Bunun için tum harfleri kontrol edecek bir forLoop olusturmaliyiz
        //  Bir tane ozel karakter bulursak yeterli olacak
        int bayrak=0;
        for (int i = 0; i <sifre.length() ; i++) {
            // Eger ozel karakterler String ozelKarakterler =" !'^+%&/()=?_|\}[{½$#£><|€@ "; seklinde girilirse
            // bu sefer if(ozelKarakterler.contains(sifre.substring(i,i+1))){ seklinde girilir
            if ((int)sifre.charAt(i)>=32 && (int)sifre.charAt(i)<=47 ||
                (int)sifre.charAt(i)>=58 && (int)sifre.charAt(i)<=64 ||
                (int)sifre.charAt(i)>=91 && (int)sifre.charAt(i)<=96 ||
                (int)sifre.charAt(i)>=123 && (int)sifre.charAt(i)<=126 ){
                bayrak++; // bayrak artti ise ozel karakter bulduk bayrak 1 ,yoksa bayrak 0 ve olumsuz mesajı verecegiz
                break; // break if icine yazıldı cunku bir ozel karakter bulmak yeterli ve burdan if ve for döngüsünden çıkıyoruz.
            }
        }
        if (bayrak==0) { // bayrak ==0 ise ozel karakter yoktur, yani bir hata vardır bunu yazdiralim
            System.err.println("Sifre ozel karakter icermelidir");
            return 0; // ozel karakter harf yok
        }else return 1; // ozel karakter var
    }
    public static int buyukHarfKontroluYap(String sifre) {
        // 2- Sifre buyuk harf icermelidir // sifre>='a' && sifre<='z'
        //  Bunun için tum harfleri kontrol edecek bir forLoop olusturmaliyiz
        //  Bir tane buyuk harf bulursak yeterli olacak
        int bayrak=0;
        for (int i = 0; i <sifre.length() ; i++) {
            if (sifre.charAt(i)>='A' && sifre.charAt(i)<='Z'){
                bayrak++; // bayrak artti ise buyuk harf bulduk bayrak 1 ,yoksa bayrak 0 ve olumsuz mesajı verecegiz
                break; // break if icine yazıldı cunku bir buyuk harf bulmak yeterli ve burdan if ve for döngüsünden çıkıyoruz.
            }
        }
        if (bayrak==0) { // bayrak ==0 ise buyuk harf yoktur, yani bir hata vardır bunu yazdiralim
            System.err.println("Sifre buyuk harf icermelidir");
            return 0; // buyuk harf yok
        }else return 1; // buyuk harf var
    }
    public static int kucukHarfKontroluYap(String sifre) { // kucuk harf varsa 1 ,yoksa 0 donduren method
        // 1- Sifre kucuk harf icermelidir // sifre>='a' && sifre<='z'
        //  Bunun için tum harfleri kontrol edecek bir forLoop olusturmaliyiz
        //  Bir tane kucuk harf bulursak yeterli olacak
        int bayrak=0;
        for (int i = 0; i <sifre.length() ; i++) {
            if (sifre.charAt(i)>='a' && sifre.charAt(i)<='z'){
            bayrak++; // bayrak artti ise kucuk harf bulduk bayrak 1 ,yoksa bayrak 0 ve olumsuz mesajı verecegiz
            break; // break if icine yazıldı cunku bir kucuk harf bulmak yeterli ve burdan if ve for döngüsünden çıkıyoruz.
            }
        }
        if (bayrak==0) { // bayrak ==0 ise kucuk harf yoktur, yani bir hata vardır bunu yazdiralim
            System.err.println("Sifre kucuk harf icermelidir");
            return 0; // kucuk harf yok
        }else return 1; // kucuk harf var
    }
}
