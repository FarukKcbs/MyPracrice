package practice_07;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Exercise05 {
    public static void main(String[] args) {

        //Bir Arrayi Önce düz Sonra ters şekilde konsola yazdırmak.

        String[] arr= new String[5];
        arr[0]="java";
        arr[1]="zordur";
        arr[2]="ama";
        arr[3]="calismasi";
        arr[4]="eglencelidir";
        System.out.println(Arrays.toString(arr));//[java, zordur, ama, calismasi, eglencelidir]

        String arr1="";
        String reverseArr1="";

        for (String w : arr){
            arr1+=" "+w;
        }
        System.out.println(arr1);//  java zordur ama calismasi eglencelidir

        for (int i = arr1.length()-1; i >-1 ; i--) {
            reverseArr1+=arr1.charAt(i);

        }
        System.out.println(reverseArr1); //ridilecnelge isamsilac ama rudroz avaj

        ArrayList<String> arr3 =new ArrayList<>();
        for (String w : arr){
            arr3.add(w);
        }
        System.out.println(arr3);//[java, zordur, ama, calismasi, eglencelidir]
        arr3.sort(null);
        System.out.println(arr3);//[ama, calismasi, eglencelidir, java, zordur]
        arr3.sort(Comparator.reverseOrder());
        System.out.println(arr3);//[zordur, java, eglencelidir, calismasi, ama]

        //burda arraylist in elemanlarını ascii değerlerine göre sıraladık.düz sort küçükten büyüğe sıralarken
        // reverseOrder ise tersten sıralama yapar.










    }
}
