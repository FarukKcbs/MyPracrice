package practice_06;

import java.util.Random;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        //Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.

        Random random =new Random();
        Scanner input =new Scanner(System.in);

        int sayac=1;
        int rdm = random.nextInt(100);
        System.out.println("Bilgisayar (0-100) arasında bir sayı tuttu.Sayıyı bulma oyunu oynayacağız. ");

        do {
            System.out.println(sayac+". denemenizi yapın.");
           int sayi= input.nextInt();
           sayac++;

           if (sayi==rdm){
               System.out.println("Tebrikler sayıyı \""+(sayac-1)+"\" denemede buldunuz.");
               return;
           } else if (sayi<rdm) {
               System.out.println("Daha büyük bir sayı girmelisiniz");

           }else if (sayi>rdm){
               System.out.println("Daha küçük bir sayı girmelisiniz.");

           }
        }while (true);



    }
}
