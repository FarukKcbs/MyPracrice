package practice_package.practice_04;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args){


        /*
            Kullanıcının girdiği bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
            ==> "Tramvay"==> "Tr"
        */

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen içinde 'a' harfi olan bir kelime yazınız");

        Character harf='a';

        do {
            String kelime = input.next();
            kelime = kelime.toLowerCase();

            for (int i = 0; i < kelime.length() - 1; i++) {
                if (kelime.charAt(i) == harf) {
                    String kelimeIlkAHarfiKadar =kelime.substring(0, i);
                    System.out.println("Yazdığınız kelimenin ilk 'a' harfine kadar olan kısmı: \"" + kelimeIlkAHarfiKadar + "\" şeklindedir.");
                    return;

                }

            }
            System.out.println("Lütfen içinde 'a' harfi olan bir kelime yazınız.");
        }while (true);




    }
}
