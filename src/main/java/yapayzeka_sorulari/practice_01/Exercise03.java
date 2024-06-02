package yapayzeka_sorulari.practice_01;

import java.util.Scanner;

public class Exercise03 {
/*
        TASK:
        1. Kullanıcıdan bir sayı alın ve bu sayının asal olup olmadığını kontrol eden bir program yazın.
        2. Asal sayı: 1 ve kendisi dışında hiçbir böleni olmayan sayı.
        3. Örneğin: 2, 3, 5, 7, 11, 13, ...
*/

        public static boolean asalMi(int a){
            if (a==2){
                return true;

            } else if (a<2) {
                return false;

            }else {
                for (int i = 2; i <Math.sqrt(a) ; i++) {
                    if (a%i==0){
                        return false;
                    }

                }
                return true;
            }
        }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Asal sayı olup olmadığını öğrenmek için bir sayı giriniz");
        int sayi= input.nextInt();

        if (asalMi(sayi)){
            System.out.println("Girdiğiniz sayı asal bir sayı.");
        }else{
            System.out.println("Girdiğiniz sayı asal bir sayı değil.");
        }
    }
}
