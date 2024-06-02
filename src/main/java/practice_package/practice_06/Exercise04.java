package practice_package.practice_06;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise04 {
    public static void main(String[] args) {

    /*
         -->Iki boyutlu bir Array’i tek boyutlu bir Array’e ceviriniz.
           int[][] numbers = {{5, 4}, {2, 3, 2}}; ==> { 5,4,2,3,2 }
           sonrasında da tek boyutlu array in elemanların toplamını yazdır.
   */


        int[][] numbers = {{15,27}, {22, 73, 12}};
        System.out.println(Arrays.deepToString(numbers));//[[15, 27], [22, 73, 12]]
        ArrayList<Integer> num=new ArrayList<>();

        for (int[] w : numbers){
            for (int k : w){
                num.add(k);
            }

        }
        System.out.println(num);//[15, 27, 22, 73, 12]

        //-->int turunde bir Multidimensional Array’deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        System.out.println(Arrays.deepToString(numbers)); //[[15, 27], [22, 73, 12]]
        int smallest=numbers[0][0];
        int biggest=numbers[0][0];

        ArrayList<Integer> num1 =new ArrayList<>();
        for (int[] w : numbers){
            for (int k :w){
                smallest=Math.min(smallest,k);  // 12
                biggest=Math.max(biggest,k);    // 73
            }
        }
        System.out.println("Multidimensional Array deki en küçük eleman: "+smallest+
                            "\nMultidimensional Array deki en büyük eleman: "+biggest);





    }
}
