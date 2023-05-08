package calisma.methodOlusturmaOrnekler;

import java.util.Scanner;

public class m07_rakamlarToplami {
    public static void main(String[] args) {
      rakamlarToplami(0);
    }

        // verilen pozitif bir tamsayinin
        // rakamlar toplamini bize döndüren ve yazdiran method olusturun


    public static int rakamlarToplami(int girilensayi){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfennnn ralamları toplami bulunacak pozitif bir tamsayi giriniz (Method):");
        int sayiGirilen= scan.nextInt();
        int gsayi=sayiGirilen;
        int bb=0;
        int rt=0;
        while (gsayi!=0){
         bb=gsayi%10;
         rt+=bb;
         gsayi=gsayi/10;
        }
        System.out.println("Girilen " + sayiGirilen+ " sayisinin rakamlar toplami : " + rt);
        return rt;
    }
}
