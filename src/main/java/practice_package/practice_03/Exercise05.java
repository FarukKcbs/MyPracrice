package practice_package.practice_03;

import com.sun.jdi.Value;

public class Exercise05 {
    public static void main(String[] args) {

        /*
        Ornek 1:

        Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
                String tv = “$456.99”;  String laptop = “$875.99"; ==> 456.99 + 875.99 = 1332.98
        */

        String tv = "$456.99";
        String laptop = "$875.99";

       tv= tv.replace("$", "");
        laptop=laptop.replace("$", "");

        Double tvFiyat = Double.valueOf(tv);
        Double laptopFiyat = Double.valueOf(laptop);

        Double sum = tvFiyat + laptopFiyat;
        System.out.println("Tv ve Laptopun toplam fiyatı: $" + sum+"'dır");


    }//main sonu
}
