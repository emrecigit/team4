package D3_MethodOlusturma_Arrays_Lists;


import java.util.ArrayList;
public class C05_ListOrnekler1 {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>(); //1-List'e Eleman ekleme ve Elemanları Listeleme
        liste.add("Java");// Eleman ekleme
        liste.add("çok");// Eleman ekleme
        liste.add("güzel");// Eleman ekleme
        System.out.print("List'e Eleman Ekleme ve Elemanları Listeleme : ");// Elemanları listeleme
        for(String each: liste) { //Elemanları Listeleme
            System.out.print(each+","); //Elemanları Listeleme
        }
        System.out.println("");
        System.out.println("====================================");
        System.out.print("List den Eleman Silme ve Elemanları Listeleme : ");//2-List den Eleman Silme ve Elemanları Listeleme
        liste.remove("çok");//2-List den Eleman Silme
        for (String each:liste    //Elemanları Listeleme
        ) {        //Elemanları Listeleme
            System.out.print(each+",");  //Elemanları Listeleme
        }
        System.out.println("");
        System.out.println("====================================");
        System.out.println("List den Eleman,İndex Liste Boyutunu Getirme ve Eleman Değiştirme");
        System.out.println("************************************");
        System.out.println("Listeden O.index Elemanını Getirme : "+liste.get(0));   //3-List den Eleman Getirme
        System.out.println("====================================");
        System.out.println("Listeden \"Java\" indexi Getirme : "+liste.indexOf("Java")); //3-List den İndex Getirme
        System.out.println("====================================");
        System.out.println("Listenin Boyutunu Getirme : "+liste.size()); //3-List den boyut getirme
        System.out.println("====================================");
        System.out.println("Listeden index Elemanını Değiştirme Değişen : "+liste.set(0,"Hava"));//3-List den İndex Elemanı Değiştirme
        System.out.println("====================================");
        System.out.println("Listeden index Elemanını Değiştirme Son Hali : "+liste);//3-List den İndex Elemanı Değiştirme Sonrası Yazdirma
        System.out.println("====================================");
        liste.clear(); // 3-Listeyi Temizleme
        System.out.println(liste);  // 3-Listeyi Temizleme

    }
}