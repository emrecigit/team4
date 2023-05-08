package D5_Constructor;

public class Recursive_Palindrome {
    public static void main(String[] args) {


    // Ornek2:Girilen metnin palindrome olup olmadigini kontrol et
    String input ="ey edip adanada pide ye";
   boolean sonuc = palindromeKontrolEt(input);
     System.out.println(sonuc);

    }

    public static boolean palindromeKontrolEt(String input) {
        if (input.length() == 0 || input.length() ==1 ) {
            return true;
    }else{
            if (input.substring(0,1).equalsIgnoreCase(input.substring(input.length()-1))) {
                return palindromeKontrolEt(input.substring(1,(input.length()-1)));
            }else{return false;}
        }
    }
}
