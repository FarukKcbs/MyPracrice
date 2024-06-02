package yapayzeka_sorulari.practice_01;

import java.util.Scanner;

public class Exercise01 {

/*
        TASK:
        1. Kullanıcıdan bir sayı alın ve bu sayıya kadar Fibonacci dizisini ekrana yazdıran bir program yazın.
        2. Fibonacci dizisi: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
        3. Örneğin, kullanıcı 10 girerse: 0, 1, 1, 2, 3, 5, 8
*/
public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.println("Lütfen bir sayı giriniz.");
    double sayi= input.nextDouble();
    int sayi2=(int) sayi;
    sayi2=Math.abs(sayi2);
    fibonacciDizisi(sayi2);


}
public static void fibonacciDizisi(int num){

        int a=0, b=1, sum=0;
    System.out.print(a+","+b);
    for (int i = 2; i <num ; i++) {
        sum=a+b;
        if (sum>=num){
            break;
        }
        System.out.print(","+ sum);
        a=b;
        b=sum;
    }
    System.out.println();



    }
}
