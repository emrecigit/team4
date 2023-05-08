package calisma.Notlar;

import java.util.Scanner;

public class n09_gitHub {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
   /*
   Bilgisayrda cmd komut işlemleri
   Bilgisayarda git varsa versionu kontrol etme :git --verison
   Terminalde kullanılan konutları renklendirir :git config --global color.ui true
   Yapılan islemlerde görünen ismi degistirir:git config --global user.name"emre.cigit"
   Yapılan islemlerde görünen emaili degistirir:git config --global user.mail"emre.cigit@gmail.com"
   global :kullanıcının tum repoları için
   system :tum kullanıcılar ve tum repolar icin
   local  :sadecd o an kullanılan repo icin tanımlar.
    */
        //======================================================================
    /*
    1-Terminal ekranını temizlemek için:clear veya cls
    İlk Kurulum sırası
    2-Bilgisayarda git i initalize edip tanıştırma yapılır bir git dosyası olusturur 1 kez yapılır:git init
    3-Repository e oluşan dosyayı ve yeni değişiklikleri eklemek icin (. hersey anlamına gelir ):git add .
    4-Eklenen dosyaı local repository'e version olarak yüklemek icin:git commit -m"2303272357"
    5-commit ten sonra yapılacak islem:git branch -M main
    6-:git remote add origin https://github.com/emrecigit/GitHubTeam113.git (hata olursa) add yerine set-url
    7-:git push -u origin main
    Sonraki işlemler de 3-4-7 diye ilerler
    */
        //=================================================================================
    /*
    git status:durumu görür.
    error : failed to push some refs to hatası alınırsa:git push -f origin master
    git pull https://github.com/emrecigit/GitHubTeam113.git terminalden çekmek
    git log : git te yapılan değişiklikleri gösterir git log --oneline(tek satırda) sonuna gelmek için q ye bas
    git checkout 012458585 log daki herahngi bir degere döner (onceki commit)
    git revert 012458585 yazarsak bu son durum kalıcı olur sonrasında da wq yazlıp enter a basılır
     */
        //======================================================================
     /*
      branch listesi görmek icin:git branch
      yeni branch olustyrmak icin:git branch branch ismi
      istenen brancha geçmek icin:git checkout branch ismi
      branch gecip remote yayınlamak icin:git push --set-upstream origin emre veya git push -u
      baska bir branch'i kullandıgımız branch ile birleştirme:git merge branchismi
      Aynı kod satırınıda farklı kodlar varsa CONFLICT olusur manuel düzeltilebilir düzeltip add commit push yapılır
      branch ile işimiz bitince local için:git branch -d branch ismi (d yerine delete de olur,-D zorlar)
      branch ile işimiz bitince local'in remote'u için:git branch -dr origin/branch ismi veya branch ismi
      branch ile işimiz bitince remote için:git push origin :branch ismi
      */
        //======================================================================
       /*
       Coolaborators icin mail atıp onaylandıktan sonra
       yapılan değisiklikler push edildikten sonra,
       Colloborator terminal sayfasında bulunan
       https://github.com/emrecigit/Team4_Hastane_Projesi/pull/new/emre
       linki tıklanir ve onaylanir (merge pull request onayını sadece proje yöneticisi yapar)
        */

          /*
   Bilgisayrda cmd komut işlemleri
   Bilgisayarda git varsa versionu kontrol etme :git --verison
   Terminalde kullanılan konutları renklendirir :git config --global color.ui true
   Yapılan islemlerde görünen ismi degistirir:git config --global user.name"emre.cigit"
   Yapılan islemlerde görünen emaili degistirir:git config --global user.mail"emre.cigit@gmail.com"
   global :kullanıcının tum repoları için
   system :tum kullanıcılar ve tum repolar icin
   local  :sadecd o an kullanılan repo icin tanımlar.
    */
        //======================================================================
    /*
    1-Terminal ekranını temizlemek için:clear
    İlk Kurulum sırası
    2-Bilgisayarda git i initalize edip tanıştırma yapılır bir git dosyası olusturur 1 kez yapılır:git init
    3-Repository e oluşan dosyayı ve yeni değişiklikleri eklemek icin (. hersey anlamına gelir ):git add .
    4-Eklenen dosyaı local repository'e version olarak yüklemek icin:git commit -m"2303272357"
    5-commit ten sonra yapılacak islem:git branch -M main
    6-:git remote add origin https://github.com/emrecigit/GitHubTeam113.git (hata olursa) add yerine set-url
    7-:git push -u origin main
    Sonraki işlemler de 3-4-7 diye ilerler
    */
        //=================================================================================
    /*
    git status:durumu görür.
    error : failed to push some refs to hatası alınırsa:git push -f origin master
    git pull https://github.com/emrecigit/GitHubTeam113.git terminalden çekmek
    git log : git te yapılan değişiklikleri gösterir git log --oneline(tek satırda) sonuna gelmek için q ye bas
    git checkout 012458585 log daki herahngi bir degere döner (onceki commit)
    git revert 012458585 yazarsak bu son durum kalıcı olur sonrasında da wq yazlıp enter a basılır
     */
        //======================================================================
     /*
      branch listesi görmek icin:git branch
      yeni branch olustyrmak icin:git branch branch ismi
      istenen brancha geçmek icin:git checkout branch ismi
      baska bir branch'i kullandıgımız branch ile birleştirme:git merge branchismi
      Aynı kod satırınıda farklı kodlar varsa CONFLICT olusur manuel düzeltilebilir düzeltip add commit push yapılır
      branch ile işimiz bitince local için:git branch -d branch ismi (d yerine delete de olur,-D zorlar)
      branch ile işimiz bitince local'in remote'u için:git branch -dr branch ismi veya origin/branc ismi
      branch ile işimiz bitince remote için:git push origin :branch ismi
      */
        // Oluşturulan branch main ile birleştirildi ve sonrasında silindi

        /*
   Bilgisayrda cmd komut işlemleri
   Bilgisayarda git varsa versionu kontrol etme :git --verison
   Terminalde kullanılan konutları renklendirir :git config --global color.ui true
   Yapılan islemlerde görünen ismi degistirir:git config --global user.name"emre.cigit"
   Yapılan islemlerde görünen emaili degistirir:git config --global user.mail"emre.cigit@gmail.com"
   global :kullanıcının tum repoları için
   system :tum kullanıcılar ve tum repolar icin
   local  :sadecd o an kullanılan repo icin tanımlar.
    */
        //======================================================================
    /*
    1-Terminal ekranını temizlemek için:clear
    İlk Kurulum sırası
    2-Bilgisayarda git i initalize edip tanıştırma yapılır bir git dosyası olusturur 1 kez yapılır:git init
    3-Repository e oluşan dosyayı ve yeni değişiklikleri eklemek icin (. hersey anlamına gelir ):git add .
    4-Eklenen dosyaı local repository'e version olarak yüklemek icin:git commit -m"2303272357"
    5-commit ten sonra yapılacak islem:git branch -M main
    6-:git remote add origin https://github.com/emrecigit/GitHubTeam113.git (hata olursa) add yerine set-url
    7-:git push -u origin main
    Sonraki işlemler de 3-4-7 diye ilerler
    */
        //=================================================================================
    /*
    git status:durumu görür.
    error : failed to push some refs to hatası alınırsa:git push -f origin master
    git pull https://github.com/emrecigit/GitHubTeam113.git terminalden çekmek
    git log : git te yapılan değişiklikleri gösterir git log --oneline(tek satırda) sonuna gelmek için q ye bas
    git checkout 012458585 log daki herahngi bir degere döner (onceki commit)
    git revert 012458585 yazarsak bu son durum kalıcı olur sonrasında da wq yazlıp enter a basılır
     */
        //======================================================================
     /*
      branch listesi görmek icin:git branch
      yeni branch olustyrmak icin:git branch branch ismi
      istenen brancha geçmek icin:git checkout branch ismi
      baska bir branch'i kullandıgımız branch ile birleştirme:git merge branchismi
      Aynı kod satırınıda farklı kodlar varsa CONFLICT olusur manuel düzeltilebilir düzeltip add commit push yapılır
      branch ile işimiz bitince local için:git branch -d branch ismi (d yerine delete de olur,-D zorlar)
      branch ile işimiz bitince local'in remote'u için:git branch -dr branch ismi veya origin/branc ismi
      branch ile işimiz bitince remote için:git push origin :branch ismi
      */
        // Oluşturulan branch main ile birleştirildi ve sonrasında silindi

    }
}
