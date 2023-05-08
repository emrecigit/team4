package D4_Ornekler;

import java.util.Arrays;
import java.util.Scanner;

public class D01_ArrayOrnekler {



    public static void main(String[] args) {
        //Verilen bir dizideki tek veya çift sayıların toplamını bulan bir program yazın
        Scanner scan=new Scanner(System.in);

      //  String str= scan.next();
        int toplam=0;
        int sayiadeti=0;
      //  while (!str.equalsIgnoreCase("+")){
       //     System.out.println("Lutfen dizinin elemanlarıni giriniz "+" tusuyla girişi durdurunuz");
        //    str=scan.next();
        //    if (str.equalsIgnoreCase("+"){
          //      break;
         //   }
          //  Integer sayistr=Integer.parseInt(str);
          //  sayiadeti++;
            //int[] dizi= new int[];

        toplam= dizitoplamibulma(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println(toplam);
    }
    public static int dizitoplamibulma(int [] dizi ) {
        Scanner scan =new Scanner(System.in);
        int toplam =0;
        int toplamc=0;
        int toplamt=0;
        System.out.print("Toplamini Almak üzere sectiginiz dizi : "+Arrays.toString(dizi)+" olup ; \nLutfen dizideki cift sayiların toplamını istiyorsanız 2 , " +
                "tek sayiların toplamını istiyorsanız 1 sayilarını tuslayiniz : ");
        int secim= scan.nextInt();

        for (int i = 0; i < dizi.length ; i++) {

            if (dizi[i] % 2 == 0) {//2 4 6
                toplamc += dizi[i];
            } else{
                toplamt +=dizi[i]; //1 3 5
            }
        }if (secim==2){
            System.out.print("Cift sayiların toplamini sectiniz ve dizideki cift sayiların toplamı : ");toplam=toplamc;}
        else {System.out.print("Tek sayilarin toplamini sectiniz ve dizideki tek sayiların toplamı : ");toplam=toplamt;}
        return toplam;
        }
    }

    //Hesap Makinesi


