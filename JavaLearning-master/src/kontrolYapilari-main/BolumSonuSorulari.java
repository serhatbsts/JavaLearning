package kontrolYapilari;

import java.util.Scanner;

public class BolumSonuSorulari {
    public static void main(String[] args) {
          //çozüm1
        //Vücut Kitle Endeksi = kilo(kg) / ((boy(cm)/100) karesi)
        int boy= 0;
        double kilo=0.0;
        Scanner tara =new Scanner(System.in);
        System.out.println("Vücüt Kitle İndeks Hesaplamasına Hoş Geldiniz");
        System.out.println("Lütfen Boyunu cm Türünden Giriniz : ");
        boy = tara.nextInt();
        System.out.println("Lütfen Kilonuzu kg Türünden Giriniz : ");
        kilo = tara.nextDouble();

        double endeks= 0.0;
        double cmToMetre = boy/100.0;
        double boyunKaresi = Math.pow(cmToMetre,2);

        endeks= kilo/boyunKaresi;

        System.out.println("Endeks Sonucu: " +endeks);


        if (endeks<15){
            System.out.println("Çok Ciddi Derecede Düşük Kilolu Kişi");
        }else if (16>endeks &&endeks>15){
            System.out.println("Ciddi Derecede Düşük Kilolu Kişi");
        }else if (18.5>endeks&&endeks>16){
            System.out.println("Düşük Kilolu Kişi");
        }else if (25>endeks&&endeks>18.5){
            System.out.println("Normal (sağlıklı) Kişi");
        }else if (30>endeks&&endeks>25){
            System.out.println("Fazla Kilolu Kişi");
        }else if (35>endeks&&endeks>30){
            System.out.println("Hafif Obez Kişi");
        }else if (40>endeks&&endeks>35){
            System.out.println("Ciddi Obez Kişi");
        }else if (40>endeks){
            System.out.println("Çok Ciddi Obez Kişi");
        }



        //ÇÖZÜM2
        {
            Scanner tara1 = new Scanner(System.in);
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
}
