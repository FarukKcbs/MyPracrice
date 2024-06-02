package practice_package.practice_07;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {

/*      TASK:
        reverseString isminde bir method create ediniz.
        Bu method bir String'i parametre olarak alsın.
        Ve bu method, girilen String'i tersten print etsin.
        Örn: String = "Java'yı Seviyorum."
        Print: .muroyiveS ıy'avaJ
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Yaz bir şeyler.");
        String str= input.nextLine(); //Ne olacak bizim halimiz.

        reverseString(str);  //.zimilah mizib kacalo eN

    }

    public static void reverseString (String a){

        String b="";
        for (int i = a.length()-1; i >-1 ; i--) {
            b+=a.charAt(i);

        }
        System.out.println(b);
    }
}
