package D2_Ternary_StringManipulation_Loop;

import java.util.Scanner;

public class C02_String_Manipulation {
    public static void main(String[] args) {
     /*
     S1- Kullanıcıdan bir cümle girdisi alın ve cümledeki tüm boşlukları kaldırarak kalan karakter sayisi ;
     100 ve  100 den büyükse  uzun,
     50 ve 50 den büyükse orta uzunlukta ,
     50 den kucukse kısa bir cumle yazdiralim
      */
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir cümle girin: ");
        String sentence = input.nextLine();

        sentence = sentence.replace(" ", "");
        int sentenceLenght = sentence.length();

        String result = sentenceLenght>=100 ?
                "Boşlukları kaldirilmiş olan metindeki karakter sayisi : "+sentenceLenght+" olup "+" uzun bir cümledir" :
                sentenceLenght >=50 && sentenceLenght<100 ?
                        "Boşlukları kaldirilmiş olan metindeki karakter sayisi : "+sentenceLenght+" olup "+" orta uzunlukta bir cümledir" :
                        "Boşlukları kaldirilmiş olan metindeki karakter sayisi : "+sentenceLenght+" olup "+" kısa uzunlukta bir cümledir";
        System.out.println(result);


     /*
     S2- Kullanıcıdan bir cümle girdisi alın ve
         cümlenin sondan başa doğru yazılmış hali ile aynı olup olmadığını kontrol edin ve sonucu ekrana yazdırın.
      */
        System.out.print("Lutfen Bir cumle girin: ");
        String metin = input.nextLine();

        String tersmetin = "";
        for (int i = metin.length() - 1; i >= 0; i--) {
            tersmetin += metin.charAt(i);
        }

        if (metin.equalsIgnoreCase(tersmetin)) {
            System.out.println("Girilen metin olan : "+metin+" tersi : "+tersmetin+" olup "+"Girilen metin palindromiktir.");
        } else {
            System.out.println("Girilen metin olan : "+metin+" tersi : "+tersmetin+" olup "+"Girilen metin palindromik değildir.");
        }
        }
    }