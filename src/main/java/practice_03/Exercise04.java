package practice_03;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {

        //Ornek : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz. (Math.abs methodu mutlak değer alır.)

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int sayi = input.nextInt();

        if ((Math.abs(sayi) < 1000 && Math.abs(sayi) > 99)) {
            System.out.println("Girdiğiniz sayı üç basamaklıdır.");
        } else {
            System.out.println("Girdiğiniz sayı üç basamklı değildir.");
        }

        /*
            Ornek 1:

             Verilen yilin "Leap Year" olup olmadigini kontrol eden kodu yaziniz.
            Example 1: Write the code to check if the given year is a "Leap Year".

            1) Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
            2) Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
        */

        System.out.println("Lütfen artık yıl olup olmadığını öğrenmek için bir yıl giriniz.");
        int year = input.nextInt();

        if ((year / 100 == 0 && year / 400 == 0) || (year / 100 != 0 && year / 4 == 0)) {
            System.out.println("Girdiğiniz yıl artık yıldır.");

        }else {
            System.out.println("Girdiğiniz yıl artık yıl değildir.");
        }


    }
}
