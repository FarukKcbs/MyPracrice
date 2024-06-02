package practice_package.practice_07;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {

/*
        TASK :
        addDigits isminde bir method create ediniz.
        Parametresi int
        Return tipi de int
        Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.
        Tek basamaklı çıktığında, return etsin
        Örnek1:
        Girdi 38
        Çıktı: 2
        Açıklama: İşlemler şöyle olacak: 3 + 8 = 11, 1 + 1 = 2.
                     2 , tek basamaklı olduğundan, bunu döndürün.
 */
        Scanner input =new Scanner(System.in);
        System.out.println("Tek basamaklı olana kadar basamak sayıları toplamını öğrenmek istediğiniz sayıyı giriniz.");
        int sayi=input.nextInt();
        int sonuc=addDigits(sayi);
        System.out.println("Sonuc: "+sonuc);





    }

    //önce basamak sayısı kontrolü yapan bir method yazdım.
    public static int basamakSayisi (int a){

        a=Math.abs(a);//mutlak değer aldım
        int basamakSayisi=0;


            if (a == 0) {
                return  1;

            }
            int sayac = 0;
            while (a > 0) {
                a /= 10;
                sayac++;
            }
             return sayac;



    }
    //basamakları toplayan method.
    public  static int addDigits(int a){
        int basamakSayisi=basamakSayisi(a);
        a=Math.abs(a);


        while (basamakSayisi(a)>1){

            int toplam = 0;


            while (a>0){
                toplam+=a%10;
                a/=10;
            }

            // Yeni değeri a'ya atar
            a = toplam;

        }

       return a; //tek basamaklı sayıyı döndürür.

    }


    }



