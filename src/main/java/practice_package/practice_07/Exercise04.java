package practice_package.practice_07;

import java.util.Scanner;

public class Exercise04 {
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
        System.out.println("Tek basamaklı olana kadar basamak değerlerinin toplamını öğrenmek istediğin sayıyı gir.");
        int sayi= input.nextInt();
        System.out.println("Sonuc: "+addDigits(sayi));


  }


    public static int addDigits(int a){
        a=Math.abs(a); //mutlak değer aldık

        //tek basamağa indirene kadar döngü yaptık.
        while (a>=10){
            int toplam=0;
            while (a>0){
                toplam+=a%10;
                a/=10;
            }
            a=toplam; //yeni değeri a ya atadık.
        }
        return a;
    }
}
