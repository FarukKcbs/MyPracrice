package practice_package.practice_03;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        /*
            Ornek 1:
              Ay numarasini soyleyince, numarasi verilen ay'dan baslayip
            12.aya kadar tum aylarin isimlerini yazdiran kodu yaziniz.
            8 ==> Agustos - Eylul - Ekim - Kasim - Aralik

      */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir ay numarası giriniz.");
        byte month=input.nextByte();

        switch (month){
            case 1:
                System.out.print("Ocak-");
            case 2:
                System.out.print("Şubat-");
            case 3:
                System.out.print("Mart-");
            case 4:
                System.out.print("Nisan-");
            case 5:
                System.out.print("Mayıs-");
            case 6:
                System.out.print("Haziran-");
            case 7:
                System.out.print("Temmuz-");
            case 8:
                System.out.print("Ağustos-");
            case 9:
                System.out.print("Eylül-");
            case 10:
                System.out.print("Ekim-");
            case 11:
                System.out.print("Kasım-");
            case 12:
                System.out.print("Aralık-");
                break;
            default:
                System.out.println("Geçerli bir ay numarası giriniz.");
        }
        System.out.println();

    }
}
