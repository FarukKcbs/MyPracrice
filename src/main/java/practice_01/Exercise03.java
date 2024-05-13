package practice_01;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {

        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen vize1 notunuzu giriniz.");
        double vize1= input.nextDouble();
        System.out.println("lütfen vize2 notunuzu giriniz.");
        double vize2= input.nextDouble();
        System.out.println("lütfen final notunuzu giriniz.");
        double finalNot=input.nextDouble();
        double gecmeNotu= (vize1+vize2)/2*0.3+finalNot*0.7;
        System.out.printf("Geçme notunuz %.2f",gecmeNotu);

    }

}
