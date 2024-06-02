package practice_package.practice_04;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

         /*
             Ornek 1:
                  Bir String’in belirli bir karakterinden baslayarak belirli bir karaktere kadar
                 tum karakterleri dynamic olarak aliniz. abc@gmail.com ===> gmail

        */


           while (true) {
               Scanner input = new Scanner(System.in);
               System.out.println("Lütfen e-mail adresinizi giriniz.");
               String mailAddress = input.nextLine();
               String mailControl1 = mailAddress.replaceAll("[^@]", "");

               if (mailControl1.length() > 1) {
                   System.out.println("Geçersiz bir e-mail adresi girdiniz.");
                   continue;
               }
               String mailControl2 = mailAddress.split("@")[1].replaceAll("[^.]", "");

               if (mailControl2.length() > 1) {
                   System.out.println("Geçersiz bir e-mail adresi girdiniz.");
                   continue;
               }
               String mailControl3 = mailAddress.replaceAll("\\S", "");
               if (mailControl3.length() > 0) {
                   System.out.println("Geçersiz bir e-mail adresi girdiniz.");
                   continue;
               }

               String mailCompany = mailAddress.split("@")[1].split("\\.")[0];
               System.out.println("Mail adresinizin şirketi: '" + mailCompany + "' şirketidir.");
               break;


           }
    }

}
