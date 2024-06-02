package yapayzeka_sorulari.practice_02;

import java.util.Scanner;

public class Exercise01 {

/*
        TASK:
        1. Kullanıcıdan bir dizi boyutu ve dizi elemanlarını alın.
        2. Bu dizideki çift sayıların toplamını bulan bir program yazın.
*/
        public static int ciftSayiToplami(int[] a){
            int toplam=0;
            for (int w : a){
                if (w%2==0){
                    toplam+=w;
                }
            }
            return toplam;
        }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Kaç tane sayı girmek istiyorsunuz.");
        int sayiAdeti=input.nextInt();
        int[] sayiArr =new int[sayiAdeti];
        System.out.println("Sayıları girmeye başlayabilirsiniz.");
        for (int i = 0; i <sayiAdeti ; i++) {
            sayiArr[i]=input.nextInt();

        }
        System.out.println("Girdiğiniz sayılardan çift olanların toplamı: "+ciftSayiToplami(sayiArr));
    }


}
