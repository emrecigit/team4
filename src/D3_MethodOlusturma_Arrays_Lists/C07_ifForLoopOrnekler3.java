package D3_MethodOlusturma_Arrays_Lists;

import java.util.Scanner;

public class C07_ifForLoopOrnekler3 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
        kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir cümle yazdırın ");
        String verilenCumle = scan.nextLine();
        System.out.println("bir harf girin");
        String harf = scan.nextLine();
        int sayiArti = 0;
        String yeniVerilenCumle = verilenCumle.replaceAll(" ", "");
        String[] cumle = yeniVerilenCumle.split("");

        for (int i = 0; i < cumle.length; i++) {
            if (cumle[i].equals(harf)) {
                sayiArti++;
            }
        }
        if (sayiArti==0){
            System.out.println("harf bulunamadı");
        }
        System.out.println(sayiArti);
    }
    }
