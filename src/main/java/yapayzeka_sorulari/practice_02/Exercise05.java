package yapayzeka_sorulari.practice_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise05 {

/*
        TASK:
        1. Kullanıcıdan iki sayı alın ve bu sayıların ortak bölenlerini bulan bir program yazın.
        2. Ortak bölen: Her iki sayıyı da tam bölen sayılar.
*/

        protected static ArrayList<Integer> ortakBolenler(int a,int b){
            int kucukSayi=0;
                ArrayList<Integer> ortakBolenler =new ArrayList<>();

            if (a<b){
                    kucukSayi=a;
            }else {
                    kucukSayi=b;
            }
                for (int i = 1; i <kucukSayi+1 ; i++) {
                        if (a%i==0&&b%i==0){
                                ortakBolenler.add(i);
                        }

                }
                return ortakBolenler;
        }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("İki tane sayı giriniz.\n\n" +
                            "1.sayıyı giriniz.");
        int a= input.nextInt();
        System.out.println("2.sayıyı giriniz.");
        int b= input.nextInt();

        System.out.println(a+" ve "+b+" sayılarının ortak bölenleri: "+ortakBolenler(a,b));
    }



}
