package practice_package.practice_04;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {

        /*
            Ornek 2: Verilen bir String’de kucuk harfleri console’a yazdirmayan kodu yaziniz.
            “Pwd12?Ab” ==> P12?A
        */

        Scanner input =new Scanner(System.in);

        do {
            System.out.println("Lütfen içinde küçük harf harici 5 karakter içeren bir cümle yazınız.");
            String cumle = input.nextLine();
            String sonuc =cumle.replaceAll("[a-z]","");
            int sonuc1= sonuc.length();
            if (sonuc.length()<5){
                System.out.println("Lütfen tanıma uygun bir cümle giriniz.");
                continue;
            }else {
                System.out.println(sonuc1+" tane küçük harf harici karakter girdiniz.");
                System.out.println("Cümlenizden küçük harfleri silince geriye kalan: \""+sonuc+"\" şeklindedir.");
                break;

            }

        }while (true);



    }
}
