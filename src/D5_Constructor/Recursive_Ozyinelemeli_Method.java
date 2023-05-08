package D5_Constructor;

import org.w3c.dom.ls.LSOutput;

public class Recursive_Ozyinelemeli_Method {
    // Method body'si icinde yine kendini cagirir icice sonsuza goturme ihtimali olan bir durum olusturur
    // Dongulerle yaptigimiz isleri daha basit ve daha az kodla yapabilmemizi saglar
    // Recursive method'larin can alici noktasi stop noktasi olup asagidaki ornek soruda stop noktasi 1 dir.
    // Ornek1:Verien bir sayidan 1'e kadar olan sayilari tolayip sonucu bize donduren bir method olusturun

    public static void main(String[] args) {
        int input=5;
        int sonuc1 =topla1(input); // topla methodu
        int sonuc2 =topla2(input); // recursive method
        System.out.println("Topla methodu ile bulunan sonuc : "+sonuc1);
        System.out.println("Recrusive methodu ile bulunan sonuc : "+sonuc2);

    }
    public static int topla1(int input) {
        int sonuc1=0;
        for (int i = 0; i <=input ; i++) {
            sonuc1+=i;
        }
        return sonuc1;
    }
    public static int topla2(int input) {
        if (input==1){ // stop noktasi if ile cozulur
            return 1;
        }else{
            return input+topla2(input-1); // dongu ve yineleme kismini return ile mthodu tekrar cagirarak cozuyoruz
        }
    }
}
