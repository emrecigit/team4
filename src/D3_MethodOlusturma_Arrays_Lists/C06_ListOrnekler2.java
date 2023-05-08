package D3_MethodOlusturma_Arrays_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C06_ListOrnekler2 {
    /* Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
     elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun*/
    public static void main(String[] args) {
        List<Integer> yeniListe=benzersizListe(); // Method call yeniListe Listesine assign edidi.
        System.out.println(yeniListe); // [1, 2, 3, 5, 6, 4]
        Collections.sort(yeniListe); // yenisyi listesi sıralandı [1, 2, 3, 4, 5, 6]
        System.out.println(yeniListe); // [1, 2, 3, 4, 5, 6]
        List<Integer> yeni=new ArrayList<>();
        yeni.add(5);
        yeni.add(6);
        yeni.add(3);
        System.out.println(yeniListe.addAll(yeni)); // true
        System.out.println(yeniListe); // [1, 2, 3, 4, 5, 6, 5, 6, 3]
        System.out.println(yeniListe.remove(4)); // 5
        System.out.println(yeniListe); // [1, 2, 3, 4, 6, 5, 6, 3]
        System.out.println(yeniListe.get(5)); // 5
        System.out.println(yeniListe); // [1, 2, 3, 4, 6, 5, 6, 3]
        System.out.println(yeniListe.indexOf(6)); // 4
        System.out.println(yeniListe.lastIndexOf(6)); // 6
        System.out.println(yeniListe.subList(4, 6)); // [6, 5]
        List<String> isimListesi=new ArrayList<>(Arrays.asList("Bülent","Emre","Nur","Süleyman","Lütfi"));
        System.out.println(isimListesi); // [Bülent, Emre, Nur, Süleyman, Lütfi]
        System.out.println(isimListesi.get(4)); // Lütfi
        System.out.println(isimListesi.get(2)); // Nur
        System.out.println(isimListesi.add("Ahmet")); // true
        System.out.println(isimListesi); // [Bülent, Emre, Nur, Süleyman, Lütfi, Ahmet]
        System.out.println(isimListesi.remove(2)); // Nur
        System.out.println(isimListesi); // [Bülent, Emre, Süleyman, Lütfi, Ahmet]
        System.out.println(isimListesi.size()); // 5
    }
    private static List<Integer> benzersizListe() {
        Integer[] sayi = {1, 2, 3, 2, 5, 6, 2, 4, 3, 4, 2};
        List<Integer> yeniSayi = new ArrayList<>();
        for (Integer each : sayi
        ) {
            if (!yeniSayi.contains(each)) {
                yeniSayi.add(each);
            }
        }
        return yeniSayi;
    }
}
