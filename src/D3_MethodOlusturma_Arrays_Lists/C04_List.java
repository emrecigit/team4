package D3_MethodOlusturma_Arrays_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_List {

    public static void main(String[] args) {
        Integer [] arrSayilar ={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Array dizimiz : "+Arrays.toString(arrSayilar));
        System.out.println("============================================");
        List<Integer> sayilar =new ArrayList<>(); // Arrayi Liste Çevirme 1.Method
        for (Integer each:arrSayilar
        ) {sayilar.add(each);
        } sayilar.add(arrSayilar.length,11);
        System.out.println("Array Dizisini Liste Çevirme ve Ekleme Yapma 1.Yöntem (for each) : "+sayilar);
        System.out.println("============================================");

        List<Integer> sayilar2 =  Arrays.asList(arrSayilar);// Arrayi Liste Çevirme 2.Method
        System.out.println("Array Dizisini Liste Çevirme 2.Yöntem Arrays.asList (Bu Yöntem Ekleme Yaptırmaz) : "+sayilar2);// Arrayi Liste Çevirme
        //System.out.println(sayilar2.add(11));//2.Yöntem Ekleme Çıkarma Yapmaz
        System.out.println("============================================");
        arrSayilar[0]=0; // Array Dizisinin 0.indexi 0 ile değiştirelim
        System.out.println("Array Dizisinin 0.indexi 0 ile değiştirelim : "+Arrays.toString(arrSayilar));
        System.out.println("============================================");
        System.out.println("Array Dizisinin 0.indexi 0 ile değişti List Değişti : "+sayilar2);
        System.out.println("============================================");
        List<Integer> sayilar3=new ArrayList<>();
        arrSayilar[0]=1;
        sayilar3.addAll(sayilar2);
        sayilar3.add(11);
        sayilar2=sayilar3;
        System.out.println("Arrays.asList ile Çevrilen Liste Ekleme Yöntemi : "+sayilar2);
    }
}