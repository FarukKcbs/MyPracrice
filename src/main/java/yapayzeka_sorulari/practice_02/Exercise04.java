package yapayzeka_sorulari.practice_02;

import java.util.Scanner;

public class Exercise04 {

/*
        TASK:
        1. Kullanıcıdan bir dizi boyutu ve dizi elemanlarını alın.
        2. Bu dizideki tek sayıların çarpımını bulan bir program yazın.
*/

         public static int tekSayiCarpimlari(int[] arr){
             int carpim=1;
             for (int w : arr){

                 if (w%2!=0){
                     carpim*=w;
                 }
             }
             return carpim;

         }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Kaç tane sayı girmek istiyorsunuz.");
        int arrBoyut=input.nextInt();
         int[] arr=new int[arrBoyut];


        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1)+". sayıyı giriniz.");
            arr[i]=input.nextInt();

        }
        System.out.println("Girdiğiniz tek sayıların çarpımı: "+tekSayiCarpimlari(arr));
    }




}
