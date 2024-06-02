package practice_package.practice_02;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {

        /* ,
            Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunuz yazdırınız.
            pazartesi hafta başlangıcı
        */
        Scanner input =new Scanner(System.in);
        System.out.println("(1)Pazartesi  (2)Salı  (3)Çarşamba\n(4)Perşembe  (5)Cuma\n(6)Cumartesi  (7)Pazar");
        System.out.println("Hangi günde olduğunuzun kodunu yazınız.");
        int gun=input.nextInt();

        int kalan =100%7;
        int yuzGunSonra= gun+kalan;

            if (yuzGunSonra>7){
                yuzGunSonra=yuzGunSonra%7;
            }

        switch (yuzGunSonra){
            case 1:
                System.out.println("Yüz gün sonra PAZARTESİ dir.");
                break;
            case 2:
                System.out.println("Yüz gün sonra SALI dır.");
                break;
            case 3:
                System.out.println("Yüz gün sonra ÇARŞAMBA dır.");
                break;
            case 4:
                System.out.println("Yüz gün sonra PERŞEMBE dir.");
                break;
            case 5:
                System.out.println("Yüz gün sonra CUMA dır.");
                break;
            case 6:
                System.out.println("Yüz gün sonra CUMARTESİ dir.");
                break;
            case 7:
                System.out.println("Yüz gün sonra PAZAR dır.");
                return;
            default:
                System.out.println("Geçerli bir gün numarası giriniz.");

        }


    }//main sonu
}
