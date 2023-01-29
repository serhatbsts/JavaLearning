package genelTekrar;

import java.util.Scanner;

public class AGirilenUcSayininOrtalamasi {
    public static void main(String[] args) {
        {
            Scanner tara= new Scanner(System.in);

            System.out.println("Lütfen Birinci Sayıyı Giriniz :");
            int birinciSayi= tara.nextInt();
            System.out.println("Lütfen İkinci Sayıyı Giriniz :");
            int ikinciSayi= tara.nextInt();
            System.out.println("Lütfen Üçüncü Sayıyı Giriniz :");
            int ucuncuSayi = tara.nextInt();

            double ortalama = (birinciSayi+ikinciSayi+ucuncuSayi)/3.0;
            System.out.println("SAYILARI ORTALAMASI :" );
            System.out.printf("%.4f",ortalama);


        }
    }
}
