package practice_package.practice_05;


public class Exercise03 {
    public static void main(String[] args) {


/*
        ornek 1: Asagidaki ciktiyi verecek kodu yaziniz
        Example 1: Write the code to give the following output
                    Week: 1
                        Day: 1
                        Day: 2
                        Day: 3
                        .....
                    Week: 2
                        Day: 1
                        Day: 2
                        Day: 3
                        ....

 */

        for (int i = 1; i <5 ; i++) {
            System.out.println("Week: "+i);
            for (int k = 1; k <8 ; k++) {
                System.out.println("    Day: "+k);

            }

        }

  /*
      Ornek 2:  Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz.
     Example 2:  Create the code that prints the following figure to the console.

           X X X X X
           X X X X X
           X X X X X
*/

        for (int i = 0; i <3 ; i++) {
            for (int k = 0; k <5 ; k++) {
                System.out.print("X ");

            }
            System.out.println();
        }

  /*
     Odev : Asagidaki sekli for-loop kullanarak çizdiriniz.
             Homework: Draw the following figure using for-loop.

                 *
                 * *
                 * * *
                 * * * *
*/

        for (int i = 1; i <5 ; i++) {
            for (int k = 1; k <i+1 ; k++) {

                System.out.print("* ");
            }
            System.out.println();
        }





    }
}

