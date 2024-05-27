package practice_07;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
/*  TASK :
             * girilen String icinde "xyz" dizimi var ise true degilse false return eden method create ediniz.
             *
             * input      output
             * axyzm  ==   true
             * xyz    ==   true
             * x.yz   ==   false
             * xyaz   ==   false
 */
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz.");
        String sentence = input.nextLine();

        if(xyzKontrol(sentence)){
            System.out.println("Cümlenizde yan yana xyz karakteri vardır. ");
        }else {
            System.out.println("Cümlenizden yan yana xyz karakteri yoktur.");
        }

    }

    public static boolean xyzKontrol (String a){

        if (a.contains("xyz")){
            return true;
        }else {
            return false;
        }

    }
}
