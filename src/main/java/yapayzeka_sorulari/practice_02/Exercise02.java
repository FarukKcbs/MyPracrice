package yapayzeka_sorulari.practice_02;

import java.util.Scanner;

public class Exercise02 {

/*
        TASK:
        1. Kullanıcıdan bir ikilik (binary) sayı alın ve bu sayıyı onluk (decimal) sayıya çeviren bir program yazın.
*/

        public static double binaryToDecimal(String binary){
            int decimal=0; int a=0; int b=-1;
            double ondalikDecimal=0.0;
            String tamKisim="";
            String ondalikKisim="";

            if (binary.contains(",")){
                tamKisim=binary.split(",")[0];
                ondalikKisim=binary.split(",")[1];


            } else if (binary.contains(".")) {
                tamKisim=binary.split("\\.")[0];
                ondalikKisim=binary.split("\\.")[1];

            } else {
                tamKisim=binary;
            }

            //tam kısım
            for (int i = tamKisim.length()-1; i >=0 ; i--) {
                double carpan=Math.pow(2,a);
                decimal+=(tamKisim.charAt(i)-'0')*carpan;//'0' ın Ascii değeri 48 charAt(i) den gelen Ascii değerinden çıkarılarak int sayı değeri elde edilir.
                a++;
            }

            //ondalık kısım
            for (int i = 0; i < ondalikKisim.length() ; i++) {
                double carpan=Math.pow(2,b);
                ondalikDecimal+=(ondalikKisim.charAt(i)-'0')*carpan;
                b--;
            }
            double sonuc= decimal+ondalikDecimal;
            return sonuc;

        }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        while (true){
            System.out.println("Lütfen 2 lik tabanda bir sayı giriniz.(örn1=101,01 veya örn2=10101 şeklinde sayı girmelisin)");
            String binarySayi= input.next();
            String strControl=binarySayi.replaceAll("[^01,]","");
            if (!binarySayi.equals(strControl)){
                System.out.println("Lütfen sayıyı doğru şekilde giriniz.");

            }else {
                System.out.println("Girdiğiniz sayının ondalık tabanda karşılığı:"+binaryToDecimal(binarySayi));
                break;
            }
        }

    }
}
