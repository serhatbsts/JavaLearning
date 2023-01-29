package kontrolYapilari;

import java.util.Scanner;

public class SayiBulmaOyunu {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("Lütfen Tahmin Ettiğiniz Sayıyı Giriniz:");
        int kullanicidanAlinanSayi= tara.nextInt();

        int sisteminOlusturduguSayi = (int)(Math.random()*99+1);
        System.out.println("Sistemin Oluşturduğu Sayı:" +sisteminOlusturduguSayi);

        int kullaniciBirinciBasamak=kullanicidanAlinanSayi/10;
        int kullaniciIkinciBasamak=kullanicidanAlinanSayi%10;

        int sistemBirinciBasamak=sisteminOlusturduguSayi/10;
        int sistemIkinciBasamak=sisteminOlusturduguSayi%10;

        if (kullanicidanAlinanSayi==sisteminOlusturduguSayi){
            System.out.println("BÜYÜK ÖDÜLÜ KAZANDINIZ");//SAYILAR TAMAMEN EŞİT İSE BÜYÜK ÖDÜL KAZANILIR.
        }else if (kullaniciBirinciBasamak==sistemIkinciBasamak&&kullaniciIkinciBasamak==sistemBirinciBasamak){
            System.out.println("ORTA ÖDÜLÜ KAZANDINIZ");//SAYILARIN BASAMAK DEĞERİ AYNI YERLERİ FARKLI İSE ORTA ÖDÜL KAZANILIR.
        }else if (kullaniciBirinciBasamak==sistemBirinciBasamak||kullaniciBirinciBasamak==sistemIkinciBasamak||kullaniciIkinciBasamak==sistemBirinciBasamak||kullaniciIkinciBasamak==sistemIkinciBasamak){
            System.out.println("KÜÇÜK ÖDÜLÜ KAZANDINIZ");//SAYILARIN BASAMAKLARINDAN SADECE BİRİ AYNI İSE KÜÇÜK ÖDÜL KAZANILIR.

        }else {
            System.out.println("KAYBETTİNİZ");
        }



    }
}
