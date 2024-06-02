package yapayzeka_sorulari.practice_01;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exercise04 {

/*
        TASK:
        1. Kullanıcıdan 10 adet sayı alın ve bu sayıların en büyüğünü ve en küçüğünü bulan bir program yazın.
        2. Aldığınız sayıları bir dizide saklayın.
*/

        public static int findMax(int[] nums){
            int max=nums[0];
            for (int w : nums){
                if (w>max){
                    max=w;
                }
            }
            return max;
        }
        public static int findMin(int[] nums){
            int min=nums[0];
            for (int w : nums){
                if (w<min){
                    min=w;
                }

            }
            return min;
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums=new int[10];
        System.out.println("10 adet sayı girin");

        for (int i = 0; i <10 ; i++) {
            nums[i]=input.nextInt();

        }
        int max=findMax(nums);
        int min=findMin(nums);
        System.out.println("Girdiğiniz en büyük sayı: "+max+"\nGirdiğiniz en küçük sayı: "+min);
    }














}
