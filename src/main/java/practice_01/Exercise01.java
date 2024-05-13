package practice_01;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        /*
        TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.*/

        System.out.println("TechProEd spor salonu kaydına hoşgeldiniz.");
        System.out.println("Lütfen bilgilerinizi eksiksiz ve doğru şekilde doldurunuz.");
        System.out.println();

        Scanner input =new Scanner(System.in);

        System.out.println("LÜtfen adınızı soyadınızı giriniz.");
        String name = input.nextLine();
        System.out.println("Yaşınızı giriniz");
        byte age = input.nextByte();
        System.out.println("Kilonuzu giriniz");
        double weight= input.nextDouble();
        System.out.println("Boyunuzu santimetre cinsinde giriniz");
        int height=input.nextInt();
        System.out.println("Spor salonuna kaç ay üye olacaksanız");
        byte month=input.nextByte();

        short price=20;
        System.out.println("Toplam abonelik ücretiniz:"+"$"+price*month);









    }
}
