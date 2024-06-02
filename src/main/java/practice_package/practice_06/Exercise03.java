package practice_package.practice_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercise03 {
    public static void main(String[] args) {

/*
           [0, 2, 3, 0, 12, 0] arrayinde tum sifirlari sona yerlestiriniz.
           [0, 2, 3, 0, 12, 0] ==> [2, 3, 12, 0, 0, 0]
*/

        Integer [] arr=new Integer[6];
        arr[0]=0;
        arr[1]=2;
        arr[2]=3;
        arr[3]=0;
        arr[4]=12;
        arr[5]=0;
        System.out.println(Arrays.toString(arr)); //[0, 2, 3, 0, 12, 0]

     /*    1.yol
            Arrays.sort(arr, Collections.reverseOrder());//Collections.reverseOrder methodu büyükten küçüğe sıralama yapar.
            System.out.println(Arrays.toString(arr));//[12, 3, 2, 0, 0, 0]


            ArrayList<Integer> arr1 =new ArrayList<>();

     */

      //  2. yol
        System.out.println(Arrays.toString(arr)); //[0, 2, 3, 0, 12, 0]
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 2, 3, 12]
        int[] arr1 =new int[6];
        int sayac=0;

        for (int w : arr){
            if (w!=0){
                arr1[sayac]=w;
                sayac++;
            }
        }
        System.out.println(Arrays.toString(arr1)); //[2, 3, 12, 0, 0, 0]



    }
}
