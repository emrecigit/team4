package D2_Ternary_StringManipulation_Loop;

import java.util.Scanner;

public class C04_genelOzetSoru {
    public static void main(String[] args) {
        // Kullanicidan iki sayi alip

        // 1 den baslayıp sayıya kadar olan sayilari ve toplamlarını ekrana yazdıran ;

        // sonrasında iki sayının bulunan toplamlarının önce kendi iclerinde terslerinin bulunması;

        // sonrasında kullanicidan yapacak işlemi isteyip( toplamını, farkını (buyuk-kucuk),çarpımlarını ve
        // bölumlerini ) (buyuk/kucuk sayi dikkate alarak)  sonucu dönduren ;

        // son olarak da ters toplamları buyuk sayı başta sonra kucuk sayi olacak şekilde
        // yanyana birleştirip elde metni yazdırıp;
        
        // metnin palindrome olup olmadigini dondurup yazdiran bir kod yazın

        Scanner input = new Scanner(System.in);
        String islemTipi = ""; // işlem tipi
        int toplam1 = 0; //toplam1
        int toplam2=0; // //toplam2
        String sayidizisi1="";
        String ters1="";
        String ters2="";
        String sayidizisi2="";
        int fark = 0; // fark
        int çarpım = 0; // çarpım
        int bolum = 0; // bölüm
        int buyuksayi = 0; // buyuk sayi
        System.out.println("Lutfen 1.pozitif sayıyı girin :");
        int sayi1= input.nextInt();
        System.out.println("Lutfen 2.pozitif sayıyı girin :");
        int sayi2= input.nextInt();

        for (int i = 1; i <=sayi1 ; i++) {

            toplam1 +=i;
            sayidizisi1+=i+",";
        }
        System.out.println("Sayiların Toplami :"+toplam1);
        System.out.println("Toplamı alınan sayilar"+sayidizisi1.substring(0,sayidizisi1.length()-1));

        for (int i = 1; i <=sayi2 ; i++) {

            toplam2 +=i;
            sayidizisi2+=i+",";
        }
        System.out.println("Sayiların Toplami :"+toplam2);
        System.out.println("Toplamı alınan sayilar"+sayidizisi2.substring(0,sayidizisi2.length()-1));
        String stringToplam1=toplam1+"";
        String stringToplam2=toplam2+"";
        for (int i = stringToplam1.length()-1; i>=0 ; i--) {
            ters1+=stringToplam1.charAt(i);
        }
        System.out.println("Ters1 :" +ters1);
        for (int i = stringToplam2.length()-1; i>=0 ; i--) {
            ters2+=stringToplam2.charAt(i);
        }
        System.out.println("Ters2 :" +ters2);

        System.out.println("Lutfen toplamlarla yapılacak olan işlemi seçiniz : (+ ,- , * , /)");
        char islem=input.next().charAt(0);
        int buyuk = 0;
        int kucuk=0;
        buyuk = toplam1>toplam2 ? toplam1 : toplam2;
        kucuk = toplam1<toplam2 ? toplam1 : toplam2;

        switch (islem) {
            case '+' :
                System.out.println("İki sayının toplamı :"+toplam1+toplam2);
                break;
            case'-'   :
                System.out.println("İki sayinin farkı : "+(buyuk-kucuk));
              break;
            case'*'    :
                System.out.println("İki sayının carpımı "+toplam1*toplam2);
             break;
            case'/':
                System.out.println("İki sayının bölumu : "+buyuk/kucuk);
                break;
        }
    }
}