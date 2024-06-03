package yapayzeka_sorulari.practice_02;

import java.util.Scanner;

public class Exercise03 {

/*
        TASK:
        1. Kullanıcıdan bir cümle alın ve bu cümlede en çok geçen harfi ve kaç kez geçtiğini bulan bir program yazın.
*/

       public static void enCokGecenHarf(String str){
            str=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
            int[] harfSayisi=new int[26];
            int enCokGecenHarfSayisi=0;
           char harf=0;

           for (int i = 0; i <str.length() ; i++) {
               char ch=str.charAt(i);
               if (ch>='a'&&ch<='z'){
                   int indeks= ch-'a';
                   harfSayisi[indeks]++;
               }


           }
           for (int i = 0; i < 26; i++) {

               enCokGecenHarfSayisi=harfSayisi[i];
               for (int w : harfSayisi){
                   if (enCokGecenHarfSayisi<harfSayisi[w]){
                       enCokGecenHarfSayisi=harfSayisi[w];
                       harf=(char) ('a'+w);
                   }
               }


           }
           System.out.println("En çok geçen '"+harf+"' harfi "+enCokGecenHarfSayisi+" defa geçmektedir");
       }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz.");
        String str= input.nextLine();

                                //Dünyadaki zulüm ve haksızlıklar artık bitsin kaliteli insanlar yönetimlere geçsin.
        enCokGecenHarf(str);  //En çok geçen 'i' harfi 8 defa geçmektedir
    }


}
