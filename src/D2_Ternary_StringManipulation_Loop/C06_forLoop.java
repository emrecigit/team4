package D2_Ternary_StringManipulation_Loop;

import java.util.Scanner;

public class C06_forLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1- Çarpım tablosu oluşturma for döngüsü örneği:

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t" + "\t"); // \t bir sekme karakteri ile metnin hizalamayı sağlar.
            }
            System.out.println();
        }
        System.out.println("==============================\n==============================");

        //2- Faktöriyel hesaplama for döngüsü örneği:
        System.out.print("Lutfen hesaplamak istediğiniz faktoriyel sayisini giriniz : ");
        int number = input.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(number + " sayısının faktöriyeli: " + factorial);
        System.out.println("==============================\n==============================");
        //3- Fibonacci dizisi oluşturma for döngüsü örneği:
        System.out.print("Lutfen kaç adet fibonacci serisi görmek istersiniz : ");
        int n = input.nextInt();
        int t1 = 0, t2 = 1;

        System.out.print("Fibonacci Dizisi: "); // 0 1 1 2 3 5 8 13 21 34 55 89
        for (int i = 1; i <= n; i++) {
            System.out.print(t1 + "  ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }

}