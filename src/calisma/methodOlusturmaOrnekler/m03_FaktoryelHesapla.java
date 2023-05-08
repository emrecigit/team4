package calisma.methodOlusturmaOrnekler;

import java.util.Scanner;

public class m03_FaktoryelHesapla {
    public static void main(String[] args) {
        // verdigimiz bir sayinin faktoryelini hesaplayip
        // sonucu bize donduren bir method olusturun
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen faktoryelini hesaplatmak istediginiz tam sayiyi giriniz : ");
        int sayi= scan.nextInt();
        int sonuc = faktoryelHesapla(sayi);
        System.out.println("Faktoryelini Hesaplattiginiz sayi : "+sayi+" , Faktoryel Degeri : "+sonuc);


        /*
                Method olusturma asamalari
                1- public static standart (simdilik)
                2- olusturdugumuz method bize bir sonuc dondurecekse
                   dondurecegi sonucun data turunu yaz
                3- method ismi
                4- method parantezi () icine method'a gondermemiz gereken bilgileri
                   hangi variable ile gonderecegimizi yaz (parametre)
                5- dondurulmesi istenen islemi yap
                6- return keyword kullanarak dondurulmesi istenen degeri dondur
         */
    }

    public static int faktoryelHesapla(int sayi){ // 5

        int faktoryel=1;
        for (int i = sayi; i >=1 ; i--) {

            faktoryel *= i;
        }
        return faktoryel;
    }

}


