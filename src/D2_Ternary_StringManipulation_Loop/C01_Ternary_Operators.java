package D2_Ternary_StringManipulation_Loop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01_Ternary_Operators {
    public static void main(String[] args) {
/*
1-Kullanıcının girdiği iki sayıdan hangisi daha büyükse onu ekrana yazdıran bir program yazın.
 */
Scanner input = new Scanner(System.in);
        System.out.println("Buyuk Sayıyı Bulma");
        System.out.print("Lutfen birinci sayiyi giriniz :");
        int number1 = input.nextInt();
        System.out.print("Lutfen ikinci sayiyi giriniz :");
        int number2 = input.nextInt();

        String result = (number1 > number2) ? "Girilen :"+number1+ " sayisi daha buyuktur" :
                        (number2>number1) ? "Girilen :"+number2+ " sayisi daha buyuktur " : "Girilen sayilar eşittir";
        System.out.println(result);



/*
2-Kullanıcının girdiği bir sayının pozitif, negatif veya sıfır olduğunu ekrana yazdıran bir program yazın.
 */
        System.out.println("Lutfen bir sayi girin : (Pozitif Negatif Sayı Yazdırma)");
        int number =input.nextInt();
        String result1 = (number>0) ?"Girilen sayi pozitif" : (number<0) ? "sayı negatif" : "sayi sıfırdır";
        System.out.println(result1);

/*
3-Kullanıcının girdiği bir sayının tek mi çift mi olduğunu ekrana yazdıran bir program yazın.
 */
        System.out.print("Lutfen bir sayı giriniz :");
        int number3 =input.nextInt();

        String result2 = (number3 %2 ==0) ? " Çifttir" : "  Tektir";
        System.out.println("Girilen: "+number3+" sayisi"+result2);

/*
4-Kullanıcının girdiği bir sayının 10'a bölünüp bölünemediğini ekrana yazdıran bir program yazın.
 */
        System.out.print("Lütfen bir sayı girin: (Tam Bölünebilir mi?) ");
        int number4 = input.nextInt();

        String result3 =( (number4 %10 ==0 && number4 %3 ==0) ? "Girilen : "+number4+" sayisi"+" hem 10 hem de 3'e tam bolunebilir" :
                        ((number4 %10 ==0 && number4 %3 !=0) ? "Girilen : "+number4+" sayisi"+" sadece 10'a tam bolunebilir" :
                         (number4 %10 !=0 && number4 %3 ==0) ? "Girilen : "+number4+" sayisi"+" sadece 3'e tam bolunebilir" :
                                 "Girilen : "+number4+" sayisi"+" ne 10 ne de 3'e tam bolunemez"));
        System.out.println(result3);

    }
}
