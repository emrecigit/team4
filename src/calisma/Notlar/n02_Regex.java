package calisma.Notlar;

import java.util.Scanner;

public class n02_Regex {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // scan.nextLine(); // println sorunu ve çözümü

        // replace (regex replace ile  kullanilamaz,sadece replaceAll) ve replace all tum karakterleri degistirir ancak replaceAll char karakteri degistirmez
        String str = ("aA9_-*+/?^#");
        System.out.println(str.replaceAll("\\W", ""));
        System.out.println(str.replaceAll("\\w", ""));
        /*
        /*Regex Sadece replaceAll da regex kullanilir ama replaceAll'da  char kullanilmaz
        Regex (Regular Expressions) Only replaceALL
        \\s : space                         \\S : space olmayan hersey
        \\s+ : yanyana birden fazla space
        \\d : digits                        \\D : digit olmayan hersey
        \\w : harf , rakam ve _           \\W : harf rakam ve _ olmayan hersey
       /*

        /*
        \n   :bir alt satirdan yazmaya baslar
        \t   :1 TAB bosluk birakir
        \"   :" yazar
        \'   :' yazar
        \\   : \ yazar
        */

        /*
        Regex (Regular Expressions) Regex Only replaceALL
        \\s : space                         \\S : space olmayan hersey
        \\s+ : yanyana birden fazla space
        \\d : digits                        \\D : digit olmayan hersey
        \\w : harf , rakam ve _           \\W : harf rakam ve _ olmayan hersey
        ===============================================================================
        Karakter İşlevi
        . Wildcard olarak da bilinmektedir. Her şey ile eşleşmektedir.
        ^ String sonu
        $ String sonu
        * Sıfır ya da çoklu tekrar
        + 1 ya da çoklu tekrar
        ? Sıfır ya da 1 tekrar
        {m} İçerisinde yer alan karakterler için tam eşleşmeyi ifade eder
        {1,10} İçerisinde yer alan karakterler için ilk ve ikinci ifade arasında bir eşleşmeyi ifade eder
        | Veya anlamına gelmektedir.
        [x] Karakter seti
        (x) İçerisinde yer alan karakterleri gruplar
        \ Escape karakter olarak bilinir. Tabloda yer alan özel karakterleri (örn. “.”) normal karaktere dönüştürmektedir.
        \w harf , rakam ve _ içine alir  \W harf , rakam ve _ olmayan herşey
        \d Tüm rakamları ifade eder         \\D : digit olmayan hersey
        \n Satır işareti
        \s Boşluk        \s+ : yanyana birden fazla space   \S Boşluk içermeyen
        ======================================================================
        Flag  Açıklama
        /g Global Bu işaret Regular expressions (Düzenli ifade) yazım sonuna eklenir
        ve çalışlan datanın hepsinin kapsama alındığını ve işlemin sadece ilk find’da sonlanmaması gerektiğini ifade eder.
        /m Multiline anlamına gelmektedir. Çoklu satır seçimlerinde kullanılabilir.
        /i Case insensitive anlamına gelmektedir. Eşleşmelerde büyük ya da küçük harf ayrımını ortadan kaldırır.
        /s Dotail anlamına gelmektedir. Tüm yeni satırları da eşleşme içerisine dahil edecektir.
        /U Ungreedy anlamına gelmektedir. Niceleyicileri varsayılan olarak lazy olmayan.
        */
    }
}
