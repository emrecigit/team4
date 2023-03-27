package D1_if_Else_OrnekVeCozumler;

import java.util.Scanner;

public class C01_if_Else {
    public static void main(String[] args) {

        // 1- Kullanıcıdan alınan bir sayının pozitif, negatif veya sıfır olduğunu kontrol eden bir program yazın.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz :");
        int number = scan.nextInt();

        if (number > 0) {
            System.out.println(number + " pozitif bit tamsayıdır");

        } else if (number < 0) {
            System.out.println(number + " negatif bir tamsayidir");

        } else {
            System.out.println(number + " Girilen sayi sıfırdır");
        }

        //2- Kullanıcıdan alınan bir karakterin harf, sayı veya özel karakter olduğunu kontrol eden bir program yazın.

        System.out.println("Lütfen bir karakter giriniz");
        char ch = scan.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " karakter bir harftir");

        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " karakter bir sayidir");
        } else {
            System.out.println(ch + " bir özel karakterdir");
        }


        //3- Kullanıcıdan alınan 3 sayının en büyük olanını bulan bir program yazın.

        System.out.println("Lutfen ilk sayiyi girin :");
        int num1 = scan.nextInt();
        System.out.println("Lurfen ikinci sayiyi girin :");
        int num2 = scan.nextInt();
        System.out.println("Lurfen üçüncü sayiyi girin :");
        int num3 = scan.nextInt();

        int max = num1;

        if (num2 > max) {
            max = num2;

        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println(max + " en buyuk sayidir");

        //4- Kullanıcıdan alınan bir yılın artık yıl olup olmadığını kontrol eden bir program yazın.
        System.out.print("Lütfen bir yıl girin: ");
        int year = scan.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " bir artık yıldır.");
                } else {
                    System.out.println(year + " bir artık yıl değildir.");
                }
            } else {
                System.out.println(year + " bir artık yıldır.");
            }
        } else {
            System.out.println(year + " bir artık yıl değildir.");
        }
    }
}