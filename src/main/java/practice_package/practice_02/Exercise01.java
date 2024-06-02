package practice_package.practice_02;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        /*
		TASK :
		Kullanıcıdan notunu alın ve aşağıdaki kurallara göre console'a A, B, C veya D yazdırın.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin

		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.
		 */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ders notunuzu giriniz.");
        int dersNotu = input.nextInt();
        String harfNotu = "";

        int not=dersNotu/10;

        switch (not) {
            case 10, 9, 8:
                harfNotu="A";
                break;
            case 7, 6:
                harfNotu="B";
                break;
            case 5:
                harfNotu="C";
                break;
            case 4:
                harfNotu="D";
                break;

            default:
                System.out.println("Lütfen geçerli bir not giriniz.");
                return;  // bu kısmı yazmayınca geçersiz bir not girince bile  //
                        // System.out.println("Harf Notuz = " + harfNotu); kısmını çalıştırıyor ama harfnotu hiçlikte kaldığı için boş kalıyor.
        }
        System.out.println("Harf Notuz = " + harfNotu);


    }//main sonu
}
