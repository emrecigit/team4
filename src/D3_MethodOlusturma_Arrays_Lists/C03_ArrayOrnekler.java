package D3_MethodOlusturma_Arrays_Lists;

public class C03_ArrayOrnekler {
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5}; // 1-Dizi Elemanlarını yazdırma
        System.out.print("Array Dizi Elemanları : ");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + ",");
        }
        System.out.println("");
        System.out.println("=============================");
        System.out.print("Array Diziyi Tersten Yazdirma : "); // 2-Diziyi Tersten yazdırma
        for (int i = dizi.length - 1; i >= 0; i--) {
            System.out.print(dizi[i] + ",");
        }
        System.out.println("");
        System.out.println("=============================");
        System.out.println("Dizideki En Büyük Sayıyı Bulma");
        System.out.println("*****************************");
        int enBuyuk = dizi[0];// 3-Dizideki En Büyük Sayıyı Bulma
        for (int i = 1; i <= dizi.length - 1; i++) {
            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];
            }
        }
        System.out.println("Dizideki En büyük sayi : " + enBuyuk);
        System.out.println("=============================");
        int eklenenSayi = 6;
        int[] yeniDizi = new int[dizi.length + 1]; // 4-Diziye eleman ekleme
        for (int i = 0; i < dizi.length; i++) {
            yeniDizi[i] = dizi[i];
        }
        yeniDizi[yeniDizi.length - 1] = eklenenSayi;
        System.out.print("Ekleme Yapılmış Yeni Dizi Elemanları : ");   // 4-Yeni diziyi yazdırma
        for (int i = 0; i < yeniDizi.length; i++) {
            System.out.print(yeniDizi[i]);
        }
        System.out.println("");
        System.out.println("=============================");
        int cıkanSayi = 3;
        int[] yeniDizi2 = new int[dizi.length - 1]; // 5-Diziden eleman çıkarma
        int j = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] != cıkanSayi) {
                yeniDizi2[j] = dizi[i];
                j++;
            }
        }
        System.out.print("Çıkarma Yapılmış Yeni Dizi Elemanları:");// 5-Eleman Çıkan Diziyi Yazdirma
        for (int i = 0; i < yeniDizi2.length; i++) {
            System.out.print(yeniDizi2[i]);
        }
    }
}