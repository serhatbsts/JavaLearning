package kontrolYapilari;

import java.util.Scanner;

public class BoyKiloEndeksi {
    public static void main(String[] args) {
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


    }

}
