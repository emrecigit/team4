package D3_MethodOlusturma_Arrays_Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class HesapMakinesiKapsamli {
    public static void main(String[] args) {

        HesapMakinesiMenusu();
    }
    public static void HesapMakinesiMenusu() {
        Scanner scan = new Scanner(System.in);
        int islemSecim = 0;
        while (islemSecim != 7) {
            System.out.println("********Hesap Makinesi Uygulamasına Hoşgeldiniz********");
            System.out.println("Lutfen Hesap Yapmak İstediginiz İslem Turunu Seciniz : ");
            System.out.println("Toplama İslemi İcin 1 Tusuna Basiniz :");
            System.out.println("Cıkarma İslemi İcin 2 Tusuna Basiniz :");
            System.out.println("Carpma İslemi İcin 3 Tusuna Basiniz  :");
            System.out.println("Bölme İslemi icin 4 Tusuna Basiniz   :");
            System.out.println("Yüzde İslemi icin 5 Tusuna Basiniz   :");
            System.out.println("Karakök İslemi icin 6 Tusuna Basiniz :");
            System.out.print(  "Cıkış İslemi icin 7 Tusuna Basiniz   :");
            islemSecim = scan.nextInt();
            switch (islemSecim) {
                case 1:
                toplama();
                break;
                case 2:
                cikarma();
                break;
                case 3:carpma();
                break;
                case 4:bolme();
                break;
                case 5:yuzde();
                break;
                case 6:karekok();
                break;
                case 7:
                System.out.println("Sistemden Çıkış Yapmayı Seçtiniz !");
                break;
                default:
                System.out.println("Hatalı Bir Giriş Yaptiniz Lutfen Yeniden Deneyiniz !");
                break;
            }
        }
        scan.close();
    }
    public static double toplama() {
        Scanner scan = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("Lutfen Toplamak İçin Sayilar Giriniz!..." +
                "\nGirişi Durdurup Toplama İşlemi Yapmak İçin '+' Tuşuna Basiniz : ");
        System.out.println("====================================");
        double toplamSonuc = 0;
        int girilenSayiAdeti = 0;
        String sayiStr = "";
        while (!sayiStr.equalsIgnoreCase("+")) {
            System.out.print("Lutfen Toplanmak Üzere Sayilari Giriniz :");
            sayiStr = scan.nextLine();
            if (sayiStr.equalsIgnoreCase("+")) {
                break;
            }
            girilenSayiAdeti++;
            toplamSonuc += Double.parseDouble(sayiStr);
        }
        System.out.println("Toplanmak üzere " + girilenSayiAdeti + " Adet Sayi Girilmiştir ve Toplam İşlemi Sonucu : " + toplamSonuc);
        System.out.println("====================================");
        return toplamSonuc;
    }
    public static double cikarma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("Lutfen Çıkarma işlemi Yapmak İçin Sayılar Giriniz!..." +
                "\nÇıkarılacak Sayi Girilen Sayiların En büyüğü seçilecektir!..." +
                "\nSayi Girişini Durdurup İşlem Sonucunu Almak İçin '-' Tuşuna Basınız");
        System.out.println("====================================");
        String sayiStr = "";
        double fark=0;
        int girilenSayiAdeti=0;
        double enBuyukSayi=0;
        double girilenSayilar=0;
        double cikanSayilarToplami=0;
        List<Double> eksilenSayilar =new ArrayList<>();
        while (!sayiStr.equalsIgnoreCase("-")){
            System.out.print("Lutfen Çıkarma İşleminde Kullanilacak Sayiları Giriniz : ");
            sayiStr = scan.nextLine();
            if (sayiStr.equalsIgnoreCase("-")) {
                break;
            }
            girilenSayilar=Double.parseDouble(sayiStr);
            girilenSayiAdeti++;
            eksilenSayilar.add(girilenSayilar);
            for (int i = 0; i < eksilenSayilar.size(); i++) {
                if (enBuyukSayi< eksilenSayilar.get(i)){
                    enBuyukSayi = eksilenSayilar.get(i);
                }
            }
            cikanSayilarToplami += girilenSayilar;
            fark = (enBuyukSayi*2) - cikanSayilarToplami;
        }
        System.out.println("Çıkarmak Üzere " + girilenSayiAdeti + " Adet Sayi Girilmiştir "+"Bu sayilarin En buyuğu : "+enBuyukSayi+" Olup , Çıkarma İşlemi Sonucu : " + fark);
        System.out.println("====================================");
        return fark;
    }
    public static double carpma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("Lutfen Çarpma İşlemi İçin Sayilar Giriniz!..." +
                "\nGirişi Durdurup Çarpma İşlemi Yapmak İçin '*' Tuşuna Basiniz : ");
        System.out.println("====================================");
        double carpim = 1;
        int girilenSayiAdeti = 0;
        String sayiStr = "";
        while (!sayiStr.equalsIgnoreCase("*")) {
            System.out.print("Lutfen Çarpma İşlemi Üzere Sayilari Giriniz :");
            sayiStr = scan.nextLine();
            if (sayiStr.equalsIgnoreCase("*")) {
                break;
            }
            girilenSayiAdeti++;
            carpim *= Double.parseDouble(sayiStr);
        }
        System.out.println("Çarpma İşlemi Yapmak Üzere " + girilenSayiAdeti + " Adet Sayi Girilmiştir ve Çarpma İşlemi Sonucu : " + carpim);
        System.out.println("====================================");
        return carpim;
    }
    public static Double bolme() {
        Scanner scan = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("Lutfen Bölme işlemi Yapmak İçin Sayılar Giriniz!..." +
                "\nBölünen Sayi Girilen Sayiların En büyüğü seçilecektir!..." +
                "\nSayi Girişini Durdurup İşlem Sonucunu Almak İçin '/' veya '0' Tuşuna Basınız");
        System.out.println("====================================");
        String sayiStr = "";
        double bolum=0;
        int girilenSayiAdeti=0;
        double enBuyukSayi=0;
        double girilenSayilar=0;
        List<Double> bolensayilar =new ArrayList<>();
        while (!sayiStr.equalsIgnoreCase("/")){
            System.out.print("Lutfen Bölme İşleminde Kullanilacak Sayiları Giriniz : ");
            sayiStr = scan.nextLine();
            if (sayiStr.equalsIgnoreCase("/")|| Double.parseDouble(sayiStr)==0) {
                break;
            }
            girilenSayilar=Double.parseDouble(sayiStr);
            double bolenSayilarCarpimi =1;
            girilenSayiAdeti++;
            bolensayilar.add(girilenSayilar);
            for (int i = 0; i < bolensayilar.size(); i++) {
                if (enBuyukSayi< bolensayilar.get(i)) {
                    enBuyukSayi = bolensayilar.get(i);
                    bolensayilar.remove(enBuyukSayi);
                }
            }
            for (int j = 0; j < bolensayilar.size(); j++) {
                bolenSayilarCarpimi *= bolensayilar.get(j);
            }
            bolum  = enBuyukSayi / bolenSayilarCarpimi;
            }
        System.out.println("Bölme İşlemi Yapmak Üzere " + girilenSayiAdeti + " Adet Sayi Girilmiştir "+"Bu sayilarin En buyuğu : "+enBuyukSayi+" Olup , Bölme İşlemi Sonucu : " + bolum);
        System.out.println("====================================");
        return bolum;
    }
    public static Double yuzde() {
        Scanner scan = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("Lutfen Yüzde işlemi Yapmak İçin Sayılar Giriniz!..." +
                "\nYüzdesi Alınacak Sayi Girilen Sayiların En büyüğü seçilecektir!..." +
                "\nEn Buyuk Sayinın Yuzdesi ile Sırasıyla girilen Tum Sayiların Yüzdesi Alınacaktır!..." +
                "\nSayi Girişini Durdurup İşlem Sonucunu Almak İçin '%' veya '0' Tuşuna Basınız");
        System.out.println("====================================");
        String sayiStr = "";
        double yuzde=1;
        int girilenSayiAdeti=0;
        double enBuyukSayi=0;
        double girilenSayilar=0;
        List<Double> yuzdeAlinanSayilar =new ArrayList<>();
        while (!sayiStr.equalsIgnoreCase("%")){
            System.out.print("Lutfen Yüzde İşleminde Kullanilacak Sayiları Giriniz : ");
            sayiStr = scan.nextLine();
            if (sayiStr.equalsIgnoreCase("%")|| Double.parseDouble(sayiStr)==0) {
                break;
            }
            girilenSayilar=Double.parseDouble(sayiStr);
            girilenSayiAdeti++;
            yuzdeAlinanSayilar.add(girilenSayilar);
            for (int i = 0; i < yuzdeAlinanSayilar.size(); i++) {
                if (enBuyukSayi< yuzdeAlinanSayilar.get(i)) {
                    enBuyukSayi = yuzdeAlinanSayilar.get(i);
                    yuzdeAlinanSayilar.remove(enBuyukSayi);
                }
            }
            for (int j = 0; j < yuzdeAlinanSayilar.size(); j++) {
            //    yuzdeSayilarCarpimi *= yuzdeAlinanSayilar.get(j);
                yuzde=(enBuyukSayi*yuzdeAlinanSayilar.get(j))/100;
            }
            for (int k = 1; k<yuzdeAlinanSayilar.size() ; k++) {
                yuzde=(yuzde*yuzdeAlinanSayilar.get(k))/100;
            }
           // yuzde  = (enBuyukSayi *yuzdeSayilarCarpimi)/100;
        }
        System.out.println("Yüzde İşlemi Yapmak Üzere " + girilenSayiAdeti + " Adet Sayi Girilmiştir "+"Bu sayilarin En buyuğu : "+enBuyukSayi+" Olup , Yüzde İşlemi Sonucu : " + yuzde);
        System.out.println("====================================");
        return yuzde;
    }
    public static Double karekok() {
            Scanner scan = new Scanner(System.in);
            System.out.println("====================================");
            System.out.print("Lutfen Karekök İşleminde Kullanilacak Sayiyi Giriniz : ");
            Double sayi= scan.nextDouble();
            Double karekok = Math.sqrt(sayi);
            System.out.println("Karekök İşlemi Sonucu : " + karekok);
            System.out.println("====================================");
            return karekok;
    }
}



