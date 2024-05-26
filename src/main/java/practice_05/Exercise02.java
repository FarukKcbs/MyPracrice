package practice_05;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {

        //---> Verilen bir String'i tersden yazan kodu yaziniz.

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz.");
        String cumle= input.nextLine();
        String reverseCumle="";
        int cumleUzunlugu=cumle.length()-1;

        for (int i = cumleUzunlugu; i >-1 ; i--) {
            reverseCumle+=cumle.charAt(i);

        }
        System.out.println("Yazdığınız cümlenin tersten yazılışı aşağıdaki gibidir.\n"+reverseCumle);


       // Bir String’deki tekrarsiz character’leri ekrana yan yana yazdiriniz. örneğin; yusuf ==> ysf






    }
}
