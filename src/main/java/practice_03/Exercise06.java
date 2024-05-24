package practice_03;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {

       /*
        Ornek
       Kullanici isminin ilk harflerini alip buyuk hale getirerek console’a yazdiriniz.
              ”  ali cAN  ” ==> AC
        */

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz.");
        String name=input.nextLine();

        char first=name.toUpperCase().trim().charAt(0);
        char last =name.toUpperCase().trim().split("\\s+")[1].charAt(0);

        System.out.println("İsminizin ilk harfleri "+first+last+" şeklindedir.");











    }
}
