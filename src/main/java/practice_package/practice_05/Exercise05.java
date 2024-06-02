package practice_package.practice_05;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {

                //  çarpım tablosunu yaz 10x10 'a kadar olan çarpım tablosu.

        for (int i = 1; i <11 ; i++) {
            for (int k = 1; k <11 ; k++) {

                System.out.print(i+"x"+k+"="+(i*k)+"\td");

            }
            System.out.println();
        }

  /*       Ornek 1:
           Belirli bir tamsayının palindrome olup olmadığını kontrol eden kodu yazın.
         Palindrome: 121 <==> 121    123321 <==> 123321
*/

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz.");
        int num = input.nextInt();
        String num1=String.valueOf(num);
        System.out.println(num1);

        String reverseNum ="";
        for (int i = num1.length()-1; i > -1; i--) {
            reverseNum+=num1.charAt(i);

        }
        System.out.println(reverseNum);
        if (reverseNum.equals(num1)){
            System.out.println("Girdiğiniz sayı palindrome bir sayıdır.");
        }else {
            System.out.println("Girdiğiniz sayı palindrome bir sayı değil.");
        }




    }
}
