package calisma.Notlar;

public class n03_null_pointer {
    public static void main(String[] args) {

    // null bir deger degildir
    // bull bir pointer'dir.
    //yanina yazildigi non-primitive variable'a deger atanmadigini isaret eder.
        String str = null;   // str="null" degil
                    // null olarak isaretlenmis, ancak degeri null degil
        System.out.println(str); //null
        // null pointer ile isaretlenen bir String sadece yazdirilabilir veya + ile kullanilabilir
        // ancak HICBIR MRTHOD ile kullanilamaz
        String str2 = str + "Java";
        System.out.println("str2 :"+str2); // str2 : nullJava
        String str3 ="";
        //  System.out.println(str.isEmpty()); // NullPointerException
        System.out.println(str3.isEmpty()); // true




}
}