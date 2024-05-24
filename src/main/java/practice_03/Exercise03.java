package practice_03;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {

        /*
       Ornek 1: yeni switch ile yap.
          Kullanıcıdan bir ay numarası girmesini isteyin (1 ile 12 arasında).
          Girilen ay numarasına göre mevsimi belirleyen ve sonucu konsola yazdıran bir program yazınız.
        */

        Scanner input=new Scanner(System.in);
        System.out.println("Hangi mevsimde olduğunuzu öğrenmek için hangi ayda olduğunuzu yazınız.");
        String month1= input.next();

        String month= month1.toLowerCase();

        String season = switch (month){
            case "aralık","ocak","şubat"-> "Kış mevsimindesiniz.";
            case "mart","nisan","mayıs"-> "İlkbahar mevsimindesiniz.";
            case "haziran","temmuz","ağustos"-> "Yaz mevsimindesiniz.";
            case "eylül","ekim","kasım"-> "Sonbahar mevsimindesiniz.";
            default-> "Ayın ismini doğru giriniz.";
        };
        System.out.println(season);


    }
}
