package practice_package.practice_02;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {

        /*
            Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme,
             çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
        */

        double bakiye=1000;
        Scanner input= new Scanner(System.in);

        while (true) {

            System.out.println("Bakiye öğrenme kodu (1)\nPara yatırma kodu (2)\nPara çekme kodu (3)\nÇıkış kodu (4)");

            System.out.println("Lütfen yapmak istediğiniz işlemin kodunu giriniz.");
            byte islem = input.nextByte();

            switch (islem) {
                case 1:
                    System.out.println("Bakiyeniz = " + bakiye);
                    break;
                case 2:
                    System.out.println("Yatırmak istediğiniz tutarı giriniz.");
                    double yatirilanMiktar = input.nextDouble();
                    bakiye += yatirilanMiktar;
                    System.out.println("Güncel bakiyeniz: " + bakiye);
                    break;
                case 3:
                    System.out.println("Çekmek istediğiniz miktarı giriniz");
                    double cekilenMiktar = input.nextDouble();
                    if ((bakiye-cekilenMiktar)<0) {
                        System.out.println("Bakiyenizden daha fazla para çekemezsiniz.");
                    }else {
                        bakiye -= cekilenMiktar;
                    }
                    System.out.println("Güncel bakiyeniz: " + bakiye);
                    break;
                case 4:
                    System.out.println("Kartınızı alınız!");
                    return;// programı sonlandırır.
                default:
                    System.out.println("Lütfen geçerli bir kod giriniz.");
            }

        }










    }//main sonu
}
