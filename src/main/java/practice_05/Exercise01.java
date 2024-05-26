package practice_05;

import java.util.Scanner;

public class Exercise01 {


    //sorunun çözümü için asal sayı kontrolü yapan bir method yapmamız gerekiyor.
    public static boolean asalMi(double number){

        //en küçük asal sayı 2 olduğundan dolayı 2 den küçük asal sayı yoktur.
        if (number<2){
            return false;
        }
        //çift sayı olan tek asal sayı 2 olduğu için.
        if (number==2){
            return true;
        }
        //bu döngünün mantığını daha önce asal sayılara bakarken Chatgptden öğrendim.
        //burada sayının kareköküne kadar olan tek sayı çarpanlarının kontrolü var.
        for (int i = 3; i <Math.sqrt(number) ; i+=2) {
            if (number%i==0){
                return false;
            }


        }
        return true;






    }




    public static void main(String[] args) {

          /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */


        /*
                 Mükemmel sayıları bulmak için kullanılan özel bir formül vardır:

               n = 2^(p-1) * (2^p - 1)

               Bu formül şu koşulda mükemmel sayıları verir:
               --->p bir asal sayı olmalıdır
               --->2^p - 1 de bir asal sayı olmalıdır.

                Bu tür asal sayılara Mersenne asal sayıları denir.
        */
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int sayi = input.nextInt();
        mukemmelSayilar(sayi);







    }

    //mükemmel sayı kontrolü yapan method
    public static void mukemmelSayilar (int p){

        //n = 2^(p-1) * (2^p - 1)
        //p ve 2^p-1 asal olmalı.

        String mukemmelSayilar1="";

        for (int i = 2; i <p ; i++) {
            if (asalMi(i)&&asalMi(Math.pow(i,2)-1)){

                double first=Math.pow(2,i-1);
                double last=Math.pow(i,2)-1;
                int mukemmelSayi=(int) (first*last);


                if (mukemmelSayi>=p){
                    break;
                }
                mukemmelSayilar1+=mukemmelSayi+" - ";

            }

        }
        System.out.println("Mükemmel sayılar: "+mukemmelSayilar1);





    }
}
