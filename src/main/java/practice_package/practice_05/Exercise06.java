package practice_package.practice_05;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {

/*
          Ornek 1:
       Gecerli Username="admin" ve Password="pwd123" dur.
       Kullanicidan username ve password'u alin.
       Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
       Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin.
       Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz.
       Kullaniciya kalan hak sayisini gosterelir
*/

        String username = "admin";
        String password = "pwd123";
        byte sayac = 4;
        Scanner input = new Scanner(System.in);

        do {
            if (sayac == 0) {
                break;
            }

            System.out.println("Kalan hakkınız: " + sayac);
            System.out.println("Lütfen kullanıcı adınızı giriniz.");
            String girilenUsername = input.next();
            System.out.println("Lütfen şifrenizi giriniz.");
            String girilenSifre = input.next();

            if (girilenUsername.equals(username) && girilenSifre.equals(password)) {
                System.out.println("Hesabınıza hoşgeldiniz.");
                return;

            } else {

                sayac--;

                if (sayac==0){
                    System.out.println("Hesabınız bloke olmuştur.");
                }else if (!girilenUsername.equals(username) && !girilenSifre.equals(password)) {
                    System.out.println("Kullanıcı adınızı ve şifrenizi yanlış girdiniz.");
                    continue;

                } else if (!girilenUsername.equals(username)) {
                    System.out.println("Kullanıcı adınızı yanlış girdiniz.");
                    continue;

                } else if (!girilenSifre.equals(password)) {
                    System.out.println("Şifrenizi yanlış girdiniz.");
                    continue;

                }

            }


        } while (true);



    }
}
