package practice_package.practice_04;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args){

          /*
    Interview Question Kullanicidan 100'den kucuk bir tamsayi isteyin.
         1'den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
         - Sayi 3'un kati ise sayi yerine "Java" yazdirin.
         - Sayi 5'in kati ise sayi yerine "Guzeldir" yazdirin.
         - Sayi hem 3'un hem 5'in kati ise sayi yerine "Java Guzeldir"yazdirin.
     */
        Scanner input =new Scanner(System.in);
        String sonuc ="";

        do {
            System.out.println("Lütfen [50,100] arası bir tamsayı giriniz.");
            byte sayi = input.nextByte();

            if(!(sayi>=50&&sayi<=100)){
                System.out.println("Lütfen belirtilen aralıkta bir tam sayı giriniz.");
                continue;
            }

            for (int i = 1; i <sayi+1 ; i++) {
                if (i%5==0&&i%3==0){
                    sonuc=sonuc+"  \"java güzeldir.\"  ";
                    continue;
                } else if (i%3==0) {
                    sonuc+="  \"Java\"  ";
                    continue;

                } else if (i%5==0) {
                    sonuc+="  \"güzeldir\"  ";

                }else {
                    sonuc+="  "+i+"  ";
                    continue;
                }


            }
           break;



        }while (true);

        System.out.println(sonuc);






    }//main sonu




}
