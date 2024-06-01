package practice_08;

import java.util.ArrayList;

public class Exercise02 {
    public static void main(String[] args) {
 /*
               Ornek 1: Tekrarli elemanlari olan bir listten, tekrarsiz elemanlari olan bir list elde ediniz.
                           [J, a, v, a, v] ==> [J, a, v]
*/

        char[] clDay={'ş','a','p','i','y','o','n','l','a','r',' ','l','i','g','i',' ','f','i','n','a','l','i',' ',
                      'f','i','n','a','l',' ','g','ü','n','ü'};


        //1.yol

        StringBuilder tekrarsizKarakterler=new StringBuilder();

        for (char w : clDay){
            if (tekrarsizKarakterler.indexOf(String.valueOf(w))==-1){
                tekrarsizKarakterler.append(w);
            }
        }
        System.out.println(tekrarsizKarakterler);//şapiyonlr gfü

        //2.yol
        ArrayList <Character> tekrarsizKarakterler1=new ArrayList<>();


        for (Character w : clDay){
          if (!tekrarsizKarakterler1.contains(w)){
              tekrarsizKarakterler1.add(w);
          }

        }
        String tekrarsizlar="";
        for (Character w : tekrarsizKarakterler1){
            tekrarsizlar+=w;
        }
        System.out.println(tekrarsizlar);  // şapiyonlr gfü


    }
}
