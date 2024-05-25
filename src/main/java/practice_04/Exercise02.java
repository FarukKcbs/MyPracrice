package practice_04;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {

       /* Bir banka kartının son 4 hanesi hariç tüm hanelerini ‘*’ kullanarak görünmez yapın
                örneğin; 1234 6789 1234 6789 ==> **** **** **** 6789
       */
        Scanner input = new Scanner(System.in);


       while (true){
           System.out.println("Lütfen 16 haneli banka kart numaranızı giriniz.(format **** **** **** **** böyle olmalıdır)");

        String cardNum = input.nextLine();

        if (!cardNum.matches("\\d{4} \\d{4} \\d{4} \\d{4}")){
            System.out.println("Lütfen kart numaranızı doğru şekilde giriniz. \n");
            continue;

        }else {
            String gizliCarNum=cardNum.substring(0,16).replaceAll("[0-9]","*")+cardNum.substring(16);
            System.out.println("Hesap numarası "+gizliCarNum+" olan hesap ile işleminiz deva edecektir.");
            break;
        }

       }


    }//main sonu
}
