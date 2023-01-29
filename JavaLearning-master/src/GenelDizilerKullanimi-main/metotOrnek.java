package metotlarVeDiziler;

import java.util.Scanner;

public class metotOrnek {
    public static void main(String[] args) {
        int kullaniciSecimi=-1;
        while (kullaniciSecimi !=0){
            kullaniciSecimi=menuGoster();

            Scanner tara= new Scanner(System.in);
            System.out.println("Birinci Sayıyı Giriniz:");
            int birinciSayi= tara.nextInt();
            System.out.println("İkinci Sayıyı Giriniz:");
            int ikinciSayi= tara.nextInt();


            switch (kullaniciSecimi){
                case 1:
                    ikiSayiyiCarp(birinciSayi,ikinciSayi);
                    break;
                case 2:
                   int toplam= ikiSayininToplami(birinciSayi,ikinciSayi);
                    System.out.println("İki Sayının Toplamı: "+toplam);
                    break;
                case 3:
                    ikiSayininKuvvetin(birinciSayi,ikinciSayi);
                    break;
                case 4:
                    double toplamDouble= ikiSayininToplami(birinciSayi,ikinciSayi);
                    System.out.println("İki Double Sayının Toplamı : " +toplamDouble);
                    break;
            }

        }

    }
    //metot overloading
    public static double ikiSayininDoubleToplami(double birinciSayi, double ikinciSayi) {
        double toplamDouble=birinciSayi+ikinciSayi;
        return (toplamDouble);
    }

    public static void ikiSayininKuvvetin(int birinciSayi, int ikinciSayi) {
        System.out.println("İki Sayının Kuvveti"+(int)(Math.pow(birinciSayi,ikinciSayi)));
    }

    public static int ikiSayininToplami(int birinciSayi, int ikinciSayi) {
        int toplam=birinciSayi+ikinciSayi;
        return (toplam);
    }

    public static void ikiSayiyiCarp(int birinciSayi, int ikinciSayi) {
        System.out.println("Sayıların Çarpımı: "+birinciSayi*ikinciSayi);
    }

    public static int menuGoster(){
        System.out.println("***********MENU***************");
        System.out.println("1-İki sayının çarpımını bul");
        System.out.println("2-iki sayının toplamını bul");
        System.out.println("3-iki sayının kuvetini bul");
        System.out.println("4-iki double sayının toplamını bul");
        System.out.println("Çıkmak İçin 0'ı tuşlayınız");
        Scanner tara= new Scanner(System.in);
        int secim= tara.nextInt();
        return secim;

    }
}
