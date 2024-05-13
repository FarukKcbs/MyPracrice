package practice_01;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args){

        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */

        Scanner input=new Scanner(System.in);
        System.out.println("1. sayıyı giriniz.");
        double sayi1= input.nextDouble();
        System.out.println("2.sayıyı giriniz.");
        double sayi2=input.nextDouble();

        if (sayi2 > sayi1) {
            double gecici = sayi1;
            sayi1 = sayi2;
            sayi2 = gecici;
        }


        System.out.println("Lütfen yapmak istediğiniz işlemin sembolünü giriniz.");
        System.out.println(" '+' = toplama, '-' = çıkarma, '*' = çarpma, '/' = bölme");
        String islem = input.next();

        if (islem.equals("+")){
            System.out.println("Toplam="+(sayi2+sayi1));

        } else if (islem.equals("-")) {
            System.out.println("Fark=" + (sayi1-sayi2));

        } else if (islem.equals("*")) {
            System.out.println("Çarpım="+ (sayi1*sayi2));

        } else if (islem.equals("/")) {
            System.out.println("Bölüm="+ (sayi1/sayi2));

        }else {
            System.out.println("Geçerli bir işlem sembolü giriniz.");

        }




    }
}
