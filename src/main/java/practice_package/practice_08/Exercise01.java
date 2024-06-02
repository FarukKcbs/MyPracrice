package practice_package.practice_08;

import java.sql.Array;
import java.util.Arrays;

public class Exercise01 {
    public static void main(String[] args) {
 /*
                     Ornek 1: Iki boyutlu bir Array’i tek boyutlu bir Array’e ceviriniz.
                               int[][] numbers = {{5, 4}, {2, 3, 2}}; ==> { 5,4,2,3,2 }

*/

        String[][] fenerbahceIlkOnbir={{"Livakovic"},{"Osayi","Becao","Djiku","Ferdi"},{"İsmail","Fred","Szymanski"},{"İrfancan","Dzeko","Tadic"}};
        int kadroLenght=0;

        for (String[] w:fenerbahceIlkOnbir){
            kadroLenght+=w.length;
        }
        System.out.println(kadroLenght);  //11



        String[] mevkiAyrimiOlmadanKadro=new String[kadroLenght];
        int index=0;
        for (String[] w : fenerbahceIlkOnbir){
           for (String k:w){
               mevkiAyrimiOlmadanKadro[index]=k;
               index++;
           }
        }
        System.out.println(Arrays.toString(mevkiAyrimiOlmadanKadro)); //[Livakovic, Osayi, Becao, Djiku, Ferdi, İsmail, Fred, Szymanski, İrfancan, Dzeko, Tadic]

        String[] kaleci=fenerbahceIlkOnbir[0];
        System.out.println(Arrays.toString(kaleci));//[Livakovic]

        String[] defans=fenerbahceIlkOnbir[1];
        System.out.println(Arrays.toString(defans));//[Osayi, Becao, Djiku, Ferdi]

        String[] ortasaha = fenerbahceIlkOnbir[2];
        System.out.println(Arrays.toString(ortasaha));//[İsmail, Fred, Szymanski]

        String[] forvet=fenerbahceIlkOnbir[3];
        System.out.println(Arrays.toString(forvet));//[İrfancan, Dzeko, Tadic]

    }
}
