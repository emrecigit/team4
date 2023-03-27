package D3_MethodOlusturma_Arrays_Lists;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) { // array uzunluk arttırma (new koyword ile yeni arrray)
        int[] arr = {1, 2, 3, 4};
        int[] yeniArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i] += arr[i];
        }
        yeniArr[yeniArr.length - 1] = 5;
        System.out.println("Array Listesini new keyword ile genişletmek");
        arr = yeniArr;
        System.out.println("arr : " + Arrays.toString(arr));
        System.out.println("================================================");
        String str = "Java çok güzel"; //String harflerinden array oluşturmak
        String strNew = new String(str.replace(" ", ""));
        String[] strArr = strNew.split("");
        System.out.println("Stringi Array İfadeye çevirme");
        System.out.println(Arrays.toString(strArr));
    }
}






