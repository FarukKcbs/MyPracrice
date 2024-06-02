package yapayzeka_sorulari.practice_01;

import java.util.Scanner;

public class Exercise02 {

 /*
        TASK:
        1. Kullanıcıdan bir kelime alın ve bu kelimenin palindrom olup olmadığını kontrol eden bir program yazın.
        2. Palindrom: Tersten okunduğunda da aynı olan kelime.
        3. Örneğin: "radar", "level" palindromdur.
*/

    public static void isPalindrome(String str) {
        StringBuilder a = new StringBuilder();
        str=str.toLowerCase();
        for (int i = str.length() - 1; i >= 0; i--) {
            a.append(str.charAt(i));

        }
        if (a.toString().equals(str)){
            System.out.println("Girdiğiniz kelime palindromdur.");
        }else {
            System.out.println("Girdiğiniz kelime palindrom değildir.");
        }
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen palindrom olup olmadığını öğrenmek için bir kelime giriniz");
        String str= input.next();
        isPalindrome(str);
    }
}
