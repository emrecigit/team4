package D3_MethodOlusturma_Arrays_Lists;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        mainmenu();
    }
    public static void mainmenu() {
        Scanner input = new Scanner(System.in);
        int secim = 0;
        while (secim != 5) {
            System.out.println("\nLütfen yapmak istediğiniz işlemi seçiniz:");
            System.out.println("1- Toplama");
            System.out.println("2- Çıkarma");
            System.out.println("3- Çarpma");
            System.out.println("4- Bölme");
            System.out.println("5- Çıkış");
            secim = input.nextInt();
            switch (secim) {
                case 1:
                    toplama();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    System.out.println("Hesap makinesinden çıkılıyor.");
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
                    break;
            }
        }
        input.close();
    }

    public static double toplama() {
        Scanner input = new Scanner(System.in);
        System.out.print("Toplama Yapmak İçin Sayiları Giriniz , Sayı Girişini Durdurmak İçin '+'ya  Basiniz : \n");
        int toplamSonuc = 0;
        while (true) {
            System.out.print("Toplama İşlemi İçin Sayıları Giriniz : ");
            String sayiStr = input.nextLine();
            if (sayiStr.equalsIgnoreCase("+")) {
                break;
            }
            double sayi = Integer.valueOf(sayiStr);
            toplamSonuc += sayi;

        }System.out.println("Toplama İslemi sonucu : " + toplamSonuc);
        return toplamSonuc;
    }
    public static void cikarma() {
        Scanner input = new Scanner(System.in);
        System.out.print("Çıkarma işlemi için ilk sayıyı giriniz: ");
        double sayi1 = input.nextDouble();
        System.out.print("Çıkarma işlemi için ikinci sayıyı giriniz: ");
        double sayi2 = input.nextDouble();
        System.out.println("Sonuç: " + (sayi1 - sayi2));
    }

    public static void carpma() {
        Scanner input = new Scanner(System.in);
        System.out.print("Çarpma işlemi için ilk sayıyı giriniz: ");
        double sayi1 = input.nextDouble();
        System.out.print("Çarpma işlemi için ikinci sayıyı giriniz: ");
        double sayi2 = input.nextDouble();
        System.out.println("Sonuç: " + (sayi1 * sayi2));
    }

    public static void bolme() {
        Scanner input = new Scanner(System.in);
        System.out.print("Bölme işlemi için ilk sayıyı giriniz: ");
        double sayi1 = input.nextDouble();
        System.out.print("Bölme işlemi için ikinci sayıyı giriniz: ");
        double sayi2 = input.nextDouble();
        if (sayi2 != 0) {
            System.out.println("Sonuç: " + (sayi1 / sayi2));
        } else {
            System.out.println("Hata! Sıfıra bölme hatası.");
        }
    }
}

