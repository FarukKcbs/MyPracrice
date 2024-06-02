package yapayzeka_sorulari.practice_01;

import java.util.Scanner;

public class Exercise05 {

/*
        TASK:
        1. Kullanıcıdan bir cümle alın ve bu cümledeki her bir harfin kaç kez geçtiğini bulan bir program yazın.
        2. Örneğin: "Hello World" -> H:1, e:1, l:3, o:2, W:1, r:1, d:1
*/

    public void hangiHarfKacDefa (String str){
        str=str.replaceAll("\\s","").toLowerCase();
        int[] harfSayilari=new int[26];  //Türkçe karakterleri içermeyen bir kod.Ascii mantığına göre bir method oldu.
                                        // Yani -->0.indeks 'a' -->1. indeks 'b' şeklinde kodladık.
                                        // int bir array boşken [0 0 0 0....0 0] şeklinde olduğundan
                                        // harfSayilari[indeks]++ kısmında döngüden gelen harfin indeksindeki 0 ı bir artırır ve o harfin kaç kez geçtiğini saklar.
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);

            if (ch>='a'&&ch<='z'){

                int indeks =ch-'a'; // Harfin ASCII değeriyle 'a' harfinin ASCII değerini çıkartarak indeksi bul.
                harfSayilari[indeks]++;
            }

        }

        for (int i = 0; i <26 ; i++) {

            char harf= (char) ('a'+i);// indeks hesaplarken a nın ascii değeri çıkarılarak yaptığımız gibi a nın ascii değerini ekleyerek harfleri char haline getirdik1

            if (harfSayilari[i]>0){//yani en az bir defa geçen harfleri alacağız. 0 olanlar cümlede geçmediği için yazdırmayacağız.

                System.out.println(harf+": "+harfSayilari[i]+" kez geçmektedir.");
            }

        }

    }

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Bir cümle giriniz.");
        String str= input.nextLine();

        Exercise05 exercise =new Exercise05();  //methodu static yapmadığım için methodun bir objesini oluşturmam gerekiyor.
                                                // Eğer static yapsaydım bu instance oluşturmama gerek kalmayacaktı.
                                               // sadece  hangiHarfKacDefa(str); yaparak methodu kullanabilecektik.
        exercise.hangiHarfKacDefa(str);




    }
}
