package practice_package.practice_06;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercise02 {
    public static void main(String[] args) {

/*
           String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
           icerdigi karakter sayilari toplamini ekrana yazdirin.
*/
        String[] names = new String[5];
        names[0]="Faruk";
        names[1]="Ali=";
        names[2]="Muhammed";
        names[3]="Mustafa";
        names[4]="Ömer";

        int sayac=0;

        for (String w : names){
            sayac+=w.length();
        }
        System.out.println("Array'imizin elemanları toplam \""+sayac+"\" karakterden oluşmaktadır.");


/*
           Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
           Ayrıca enuzun kelimenin kaç harfli olduğunu ve en uzun kelimeyi yaz.
*/
        String sentence="Bir bilgisayar programlama dilini öğrenmek zevkli olduğu kadar zor.";
        sentence= sentence.replaceAll("\\p{Punct}","");



        String []words=sentence.split(" ");
        System.out.println(Arrays.toString(words));
        int enUzunKelime =0;

        for (String w : words){
            enUzunKelime=Math.max(enUzunKelime,w.length());
        }
        System.out.println("En uzun kelime "+enUzunKelime+" harfden oluşuyor.");

        ArrayList<String> enUzunKelimeler= new ArrayList<>();

        for (String w : words){
            if (enUzunKelime==w.length()){
                enUzunKelimeler.add(w);
            }
        }
        System.out.println("En uzun kelimeler: "+enUzunKelimeler);












    }
}
