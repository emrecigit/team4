package calisma.methodOlusturmaOrnekler;

import java.util.Scanner;

public class m06_AsalSayiYazdir {
    public static void main(String[] args) {
        // Verilen 1'den buyuk pozitif bir tamsayinin
        // asal sayi olup olmadigini yazdiran bir method olusturun

        // asalMiYazdir(20); // Girilen 20 sayisi ASAL bir sayi degildir
        // asalMiYazdir(35); // Girilen 35 sayisi ASAL bir sayi degildir
        // asalMiYazdir(23); // Girilen 23 sayisi ASAL bir sayidir.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen Asal Sayi Olup Olmadigini Kontrol Icin Bir Pozitif TamSayi Giriniz : ");
        int sayi = scan.nextInt();
        asalMiYazdir(sayi);


    }


    public static void asalMiYazdir(int sayi){

        int flag=0;

        for (int i = 2; i <sayi ; i++) {

            if(sayi % i == 0){
                flag++;
                break;
            }
        }if (sayi<2){
            System.out.println("Hatali bir sayi girdiniz,Lutfen yeni bir sayi giriniz!");
        } else if (sayi == 2){
            System.out.println("Girilen 2 sayisi ASAL bir sayidir");
        }else if (flag==0){
            System.out.println("Girilen " + sayi + " sayisi ASAL bir sayidir");
        }else {
            System.out.println("Girilen " + sayi + " sayisi ASAL bir sayi degildir");

        }

    }
}
