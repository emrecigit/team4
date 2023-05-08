package D4_Ornekler;

import java.util.Scanner;

public class D02_OrneklerLogin {
            static boolean aktif = true;
            static int haksayisi = 3;
            static Scanner scan = new Scanner(System.in);
            public static void main(String[] args) {
            /*
            Kullanicinin uygulamaya giris yapmasini saglayalim 3 hakki olsun.
            3 hakkini doldurdugu zaman hesabini devre disi birakalim ( disable).
            Dogru girer ise sisteme giris yapsin.
            */
                if (aktif) {
                    if (haksayisi > 0) ;
                    {
                        while (aktif) {
                            System.out.println("Lütfen kullanici adini giriniz : ");
                            String kullanicAdi = scan.nextLine();
                            System.out.println("Lütfen sifrenizi giriniz :");
                            String sifre = scan.nextLine();
                            boolean sonuc = login(kullanicAdi, sifre);
                            System.out.println("Girilis basarili");
                            if (sonuc) {
                                //  System.out.println("basarili");
                                break;
                            } else {
                                if (haksayisi == 0) {
                                    System.out.println("hak bitti");
                                    break;
                                }
                            }
                        }
                    }
                /*      if(aktif==false){
                System.out.println("Hakkiniz bitti");
                 }
                */
                } else {
                    System.out.println("Hesabiniz aktif degildir. Yönetici ile iletisime geciniz");
                }
            }
            public static boolean login(String kullaniciAdi, String sifre) {
                if (kullaniciAdi.equals("java") && sifre.equals("1234")) {
                    return aktif;
                } else {
                    haksayisi--;
                }
                return false;
            }
        }
