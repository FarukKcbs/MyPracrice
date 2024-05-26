package practice_05;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {


 /*
     Ornek 2: Verilen sayıda ondalık kısımdaki rakamların toplamını bulunuz.
              Example 2: Find the sum of the digits in the decimal part of the given number.
                         28.587 ==> 5+8+7=20
*/


        Scanner input =new Scanner(System.in);
        do{
            System.out.println("Lütfen ondalıklı bir sayı giriniz.");
            double sayi=input.nextDouble();
            String ondalikKisim ="";
            String stringSayi= String.valueOf(sayi);
            ondalikKisim=stringSayi.split("\\.")[1];
            if (ondalikKisim.length()<3){
                System.out.println("Lütfen ondalık kısmında en az 3 hane olan bir sayı giriniz.");
                continue;
            }else {
                int sonucSayi=Integer.valueOf(ondalikKisim);
                int toplam=0;

                do {
                    toplam+=sonucSayi%10;
                    sonucSayi=sonucSayi/10;
                }while (sonucSayi!=0);
                System.out.println("Ondalık kısımdaki rakamların toplamı= "+toplam);
                break;
            }
        }while (true);
        System.out.println();

/*
                Kullanıcıdan sisteme satır sayısını girmesini isteyiniz
                ve ardından aşağıdaki şekli bu sayıya göre yazdırın:

                Örneğin: Satır sayısı 4 için;
                1
                2 3
                4 5 6
                7 8 9 10
 */
        System.out.println("lütfen satır sayısını giriniz.");
        int satir= input.nextInt();
        int sayac=1;

        for (int i = 0; i <satir ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.printf("%3d ",sayac);
                sayac++;
            }
            System.out.println();
        }

            







    }
}
