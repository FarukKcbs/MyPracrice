package practice_package.practice_08;

import java.util.ArrayList;

public class Exercise03 {
    public static void main(String[] args) {
 /*
               Ornek 1:  Bir String ArrayList oluşturun ve “türkçe karakter” içeren elemanlari silin.
               ArrayList<String> r =new ArrayList<>();

*/

        ArrayList<String> citynames=new ArrayList<>();
        citynames.add("Kahramanmaraş");
        citynames.add("Konya");
        citynames.add("Isparta");
        citynames.add("Şırnak");
        citynames.add("Gümüşhane");
        citynames.add("Antalya");
        citynames.add("Mersin");
        citynames.add("İzmir");

        ArrayList<String> newarr=new ArrayList<>();

        //String cityname=citynames.get(i);

        for (int i = 0; i < citynames.size() ; i++) {

            if (citynames.get(i).replaceAll("[^a-zA-Z0-9]","").length()!=citynames.get(i).length()){
                citynames.remove(i);
                i--;
            }


        }
        System.out.println(citynames);//[Konya, Isparta, Antalya, Mersin]








    }
}
