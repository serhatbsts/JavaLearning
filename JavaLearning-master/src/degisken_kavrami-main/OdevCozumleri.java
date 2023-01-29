package degisken_kavrami;

public class OdevCozumleri {
    public static void main(String[] args) {
        //ÇÖZÜM 1

        String stringDegiskeni = "150";

        int integerDegiskeni = Integer.parseInt(stringDegiskeni);
         int integerDegiskeni2 = Integer.valueOf(stringDegiskeni);
        System.out.println("Integer Değişkeni 1 : " +integerDegiskeni);
        System.out.println("Integer Değişkeni 2 : " +integerDegiskeni2);
        stringDegiskeni = String.valueOf(integerDegiskeni);

        System.out.println("String Değişkenin Son Değeri :" + stringDegiskeni);

        System.out.println("***************************************");

        //Çözüm 2

        int sayi1 = 5 / 3 ;
        float sayi2 = 5F/ 3f ; //float virgülden sonra 7 karakter yazar
        double sayi3 = 5D / 3d;

        System.out.println("Sayi 1 :" + sayi1);
        System.out.println("Sayi 2 : " + sayi2);
        System.out.println("Sayi 3 : " + sayi3 );

        System.out.println("***************************************");

        //Çözüm 3

        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);

        System.out.println(1.0 - 0.9);

        System.out.println("***************************************");

        //Çözüm 4

        int s1= 1;
        int s2= 2;

        double ortalama = (s1+s2)/2;
        System.out.println("ortalama 1 : " + ortalama);

        double ortalama2 = (s1+s2)/2.0;
        System.out.println("ortalama 2 : " + ortalama2);
        }











    }

