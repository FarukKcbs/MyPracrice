package practice_package.practice_01;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {

        /* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.

		 */

        Scanner input = new Scanner(System.in);

        System.out.println("lütfen boyunuzu metre cinsinden giriniz.");
        double height = input.nextDouble();

        System.out.println("Lütfen kilonuzu kilogram cinsinden giriniz");
        short weight = input.nextShort();

        double BMI = weight / (height * height);

        if (BMI <= 20) {
            System.out.println("Oldukça zayıfsınız.");
        } else if (20 < BMI && BMI <= 25) {
            System.out.println("Normal sınırdasınız.");

        } else if (25 < BMI && BMI <= 30) {
            System.out.println("Şişman katagorisindesiniz.");

        } else {
            System.out.println("Obez grubundasınız");
        }


    }
}
