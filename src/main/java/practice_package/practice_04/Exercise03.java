package practice_package.practice_04;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {

        /*
       Ornek 1: Bir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin.

        1- Parolanın minimum 8 karakter uzunluğunda olması gerekmektedir.
        2- Karakterler sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir.
        3- Başında ve sonunda boşluk olmamalıdır.
        4-Özel Karakter İçermeli: Parolada en az bir özel karakter (!, @, #, $, %, ^, &, *, vs.) bulunmalıdır.
        5-Ad, Soyad veya Kullanıcı Adı İçermemeli: Parolada kullanıcı adı, ad veya soyad gibi kişisel bilgiler yer almamalıdır.
        6- Parolada ardışık olarak yinelenen karakterlerden (örneğin, "aaa" veya "111") kaçınılmalıdır.
        7-Parolada en az bir büyük harf (A-Z) bulunmalıdır.
        8-Parolada en az bir küçük harf (a-z) bulunmalıdır.
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kullanıcı adınızı giriniz.");
        String username = input.next();

        input.nextLine(); //Yeni satır hatsına düşmemek için.

        System.out.println("Lütfen adınızı soyadınızı giriniz.");
        String nameSurname = input.nextLine();

        do {
            System.out.println("1- Parolanın minimum 8 karakter uzunluğunda olması gerekmektedir.\n" +
                    "        2- Karakterler sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir.\n" +
                    "        3- Başında ve sonunda boşluk olmamalıdır.\n" +
                    "        4-Özel Karakter İçermeli: Parolada en az bir özel karakter (!, @, #, $, %, ^, &, *, vs.) bulunmalıdır.\n" +
                    "        5-Ad, Soyad veya Kullanıcı Adı İçermemeli: Parolada kullanıcı adı, ad veya soyad gibi kişisel bilgiler yer almamalıdır.\n" +
                    "        6- Parolada ardışık olarak yinelenen karakterlerden (örneğin, \"aaa\" veya \"111\" ve \"abc\" veya \"123\") kaçınılmalıdır.\n" +
                    "        7-Parolada en az bir büyük harf (A-Z) bulunmalıdır.\n" +
                    "        8-Parolada en az bir küçük harf (a-z) bulunmalıdır.\n\n" +
                    "Yukarıda belirtmiş olduğumuz kriterlere uygun şekilde şifrenizi oluşturunuz.");
            String password = input.nextLine();



            if (password.length() < 8) {
                System.out.println("Şifreniz 8 karakterden az olamaz.");
                continue;
            } else if (password.replaceAll("\\S", "").length() == password.length()) {
                System.out.println("Şifre sadece boşluk karakterinden oluşamaz.");
                continue;

            } else if (password.length() != password.trim().length()) {
                System.out.println("Şifrenizin başında ve sonunda boşluk olamaz.");
                continue;

            } else if (0 == password.replaceAll("[^\\p{Punct}]", "").length()) {
                System.out.println("Şifreniz en az bir noktalama işareti içermelidir.");
                continue;

            } else if (password.contains(username)) {
                System.out.println("Şifreniz kullanıcı adınızı içeremez.");
                continue;

            } else if (password.contains(nameSurname)) {
                System.out.println("Şifreniz adınızı veya soyadınızı içeremez.");
                continue;

            } else if (ardisikKarakterKontrol(password)||yinelenenKarakterKontrol(password)) {
                System.out.println("Şifreniz ardışık veya yinelenen üç karakterten oluşamaz.");
                continue;

            } else if (password.replaceAll("[^A-Z]","").length()==0) {
                System.out.println("Şifreniz en az bir büyük harf içermelidir.");
                continue;
            } else if (password.replaceAll("[^a-z]","").length()==0) {
                System.out.println("Şifreniz en az bir küçük harf içermelidir.");
                continue;

            }else {
                System.out.println("Hesabınızı başarılı şekilde oluşturdunuz.");
                break;
            }



        } while (true);


    }

    //Ardışık karakter kontrolü için bir method oluşturacağız.(abc veya 123 gibi)
    //indeks sayısını i+2 kısmında aşmamak için i < pwd.length() - 3 yaptım.

    public static boolean ardisikKarakterKontrol(String pwd) {

        for (int i = 0; i < pwd.length() - 3; i++) {

            if (pwd.charAt(i) + 1 == pwd.charAt(i + 1) ||
                    pwd.charAt(i+1) + 1 == pwd.charAt(i + 2)) {
                return true;
            }
        }
        return false;
    }

    //Yinelenen karakter kontrolü için method.(aaa veya 111 gibi)
    //indeks sayısını i+2 kısmında aşmamak için i < a.length() - 3 yaptım.

    public  static boolean yinelenenKarakterKontrol(String a){

        for (int i = 0; i <a.length()-3 ; i++) {
            if (a.charAt(i)==a.charAt(i+1)&&a.charAt(i+1)==a.charAt(i+2)){
                return true;
            }

        }
        return false;
    }

}
