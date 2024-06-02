package practice_package.practice_01;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {

        /*  TASK :
	 *  Kullanicidan 3 tane pozitif  tam sayi alniz.
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
	    INFO :
	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		 a+b>c>a-b
		 a+c>b>a-c
	     b+c>a>b-c
		a=b=c ise es kenar ucgen

	 */

        Scanner input = new Scanner(System.in);
        System.out.println("Gireceğiniz 3 pozitif tam sayının üçgen oluşturup oluşturmayacağını kontrol etmek için");
        System.out.println("1.kenar uzunluğunu giriniz");
        int a = input.nextInt();
        System.out.println("2.kenar uzunluğunu giriniz");
        int b = input.nextInt();
        System.out.println("3.kenar uzunluğunu giriniz");
        int c = input.nextInt();

        // Sayıları sırala: a > b > c
        if (a < b) {
            int x = a;
            a = b;
            b = x;
        }
        if (a < c) {
            int x = a;
            a = c;
            c = x;
        }
        if (b < c) {
            int x = b;
            b = c;
            c = x;
        }

        // Üçgen eşitsizliğini kontrol et

        if (a < 1 || b < 1 || c < 1) {
            System.out.println("Lütfen girdiğiniz sayıların pozitif tam sayı olmasına dikkat ediniz .");
        } else if ((a + b > c && c > a - b) && (a + c > b && b > a - c) && (b + c > a && a > b - c)) {
            System.out.println("Girdiğiniz sayılar bir üçgen oluşturur.");

            if (a == b && b == c) {
                System.out.println("Üçgeniniz eşkenar üçgendir.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Üçgeniniz ikizkenar üçgendir.");
            } else {
                System.out.println("Üçgeniniz normal üçgendir.");
            }
        } else {
            System.out.println("Girdiğiniz sayılar bir üçgen oluşturmaz.");
        }

    }
}
