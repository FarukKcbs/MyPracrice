package practice_01;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        /*  Problem Tanımı
        Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
        hesaplayan kodu yazınız.
        Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
        Buna göre 2 işçi aynı işi kaç günde yapar?
        Örnek Ekran Çıktısı
         Bir işçi işi kaç günde bitirmektedir? 10
         Toplam kaç işçi çalışacak? 2
        İşin bitme süresi 5 gündür.
*/

        Scanner input= new Scanner(System.in);

        System.out.println("Lütfen kaç işçiniz olduğunu giriniz.");
        short isciSayisi= input.nextShort();
        System.out.println("Yapılacak işi bir işçi kaç günde yapabiliyor.");
        double isSuresi=input.nextDouble();

        double isBitimSuresi= isciSayisi/isSuresi;
        System.out.println("İş" +isBitimSuresi +"günde bitecek");
        System.out.printf("İş %.2f gün sonra bitecek.%n", isBitimSuresi);



    }
}
