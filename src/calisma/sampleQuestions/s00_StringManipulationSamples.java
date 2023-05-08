package calisma.sampleQuestions;

import java.util.Scanner;

public class s00_StringManipulationSamples {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

       // String manipulasyonda atama yapılmazsa deger gecerli olmaz sadece yazdirir.
       // *substring de toplam lenght yazdirma ya da (2,2)  istenirse hiclik verir.normalde index RTE verir
       // *equals da hiclik false verir
       // contains , startswith endswith te "" yani hiclik true verir.
       // lastindex of veya index of da olmayan bir kelime veya hiclik -1 verir.
       // lastindex of veya index of char'x' karakter kabul eder.
       // replace ve replace all tum karakterleri degistirir ancak replaceAll char karakteri degistirmez
       // Bagimsiz if cumleleri ile butun sartların olmadigini if_else ile sadece bir sartin olmadigini yazdirabiliriz
       // if_else de yukardaki şart olmazsa if else ,yoksa yine if kullanilir,tum şartlar bittiyse else ile kapatılabilir
        String str1= "Java degil ama java guzel";
        String str2= "degil";
        System.out.println(str2.equals("Degil"));//false // aynı mı?
        System.out.println(str2.equalsIgnoreCase("Degil"));//true // buyuk kucuk bakma aynı mı?
        System.out.println(str1.concat(" ").concat(str2));// Java degil ama java guzel  // birlestir
        System.out.println(str2.charAt(4)); // l son harf karakter sayisi 5 index 4
        System.out.println(str2.length()); // 5 uzunlugunu verir.
        System.out.println(str2.substring(0, 4)); // degi 0 dan basla 4 haric yazdir // yazdirma islemi
        System.out.println(str2.contains("de"));// true verir // icerir mi
        System.out.println(str2.toUpperCase()); // DEGİL
        System.out.println(str2.startsWith("d"));// true // bunla mı baslar
        System.out.println(str2.endsWith("l"));// true // hiclik ile baslar true.
        System.out.println(str2.endsWith(""));// true // hiclik ile mi biter true.
        System.out.println(str2.indexOf('d', 0)); // 0 0 dan baslayarak d hrfinin indexi
        System.out.println(str2.indexOf('k')); // -1 verir olmayan karakter
        System.out.println(str1.isEmpty()); // false - Bos mu? // "" hiclik isEmpty ve isBlank icin true verir
        System.out.println(str1.isBlank()); // Space lerden mi olusuyor. // "" hiclik isEmpty ve isBlank icin true verir
        System.out.println(str1.replace('a','e')); // Jeve degil eme jeve guzel
        //System.out.println(str1.replaceAll('a','e')); // replaceAll char karakteri degistirmez
        System.out.println(str1.replace("a","e")); // Jeve degil eme jeve guzel string degistirir
        // replace (regex kullanilamaz,sadece replaceAll) ve replace all tum karakterleri degistirir ancak replaceAll char karakteri degistirmez
        String str = ("aA9_-*+/?^#");
        System.out.println(str.replaceAll("\\W", ""));
        System.out.println(str.replaceAll("\\w", ""));
        // null deger degil pointerdir.non-primitive yanında kullanilir.Sadece yazdirilir ve + islemi yapılabilir
        // method ile kullanilamaz (concat veya lenght gibi RTE verir
        String str3 = "Java Candir.";
        System.out.println(str3.repeat(4)); // 4 kere yazdirir
        String str4 = "   Java Candir.   ";
        System.out.println(str4.trim()); // varsa basta ve sondaki space leri kaldirir
    }
}
