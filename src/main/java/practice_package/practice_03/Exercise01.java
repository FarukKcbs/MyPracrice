package practice_package.practice_03;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

         /*
     ornek 1:
            Kisi erkek ise;
                  i)16 yasindan kucuk ise calismamali
                  ii)16 - 65(dahil) arasi calismali
                  iii)65 yasindan buyuk ise emekli olmali
            Kisi kadin ise;
                 i)18 yasindan kucuk ise calismamali
                 ii)18 - 60 (dahil) arasi calismali
                 iii)60 yasindan buyuk ise emekli olmali
           Kisinin cinsiyetine ve yasina bakarak uygun mesaji console'a yaziniz

*/

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz(erkek/kadın)");
        String cinsiyet = input.next();
        System.out.println("Yaşınızı giriniz.");
        short yas=input.nextShort();

        if (cinsiyet.equalsIgnoreCase("Erkek")){
            if (yas<0){
                System.out.println("Geçerli bir yaş giriniz");
            } else if (yas<16) {
                System.out.println("Çalışmamalısınız.");

            } else if (yas<=65) {
                System.out.println("Çalışmalısınız.");

            } else {
                System.out.println("Emekli olmalısınız.");

            }


        } else if (cinsiyet.equalsIgnoreCase("Kadın")) {

            if (yas<0){
                System.out.println("Geçerli bir yaş giriniz");
            } else if (yas<18) {
                System.out.println("Çalışmamalısınız.");

            } else if (yas<=60) {
                System.out.println("Çalışmalısınız.");

            }else {
                System.out.println("Emekli olmalısınız.");
            }

        }

    }

}
