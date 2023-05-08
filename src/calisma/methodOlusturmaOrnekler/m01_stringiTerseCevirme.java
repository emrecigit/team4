package calisma.methodOlusturmaOrnekler;

import java.util.Scanner;

public class m01_stringiTerseCevirme {
    public static void main(String[] args) {
        //Iki tip method vardir;
        //1- Bir islem yapan veya yazdıran method ise method call = void olur
        //2- Bir sonuc donduren bir method isr method call = return olur
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen terse cevrilecek metni giriniz : ");
        String metin = scan.nextLine();
        System.out.print("Girmis oldugunuz metin : "+"\""+metin+"\""+" olup , "+"\nGirilen metnin tersi : "+stringTersineCevir(metin));
    }
    public static String stringTersineCevir(String metin){ // Java
        String tersMetin=""; // avaJ
        for (int i = metin.length()-1 ; i >=0 ; i--) {
            tersMetin += metin.charAt(i);
        }
        return tersMetin;
    }
}
