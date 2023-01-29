package metotlarVeDiziler;

import java.util.Scanner;

public class DizidekiSayilarinOrtalamasi {
    public static void main(String[] args) {
        /*
       100 elemanlı bir dizi oluşturun ve bu dizinin tüm elemanlarını rastgele olacak şekilde üretin.
        Bu işlemden sonra dizideki elemanların ortalamasını hesaplayarak bu ortalamanın altında kaç tane eleman olduğunu yazdırın.
 */
        int sayilar[]=new int[100];

        for(int i=0;i< sayilar.length;i++) {
            int a= (int) (Math.random()*(1000));
            sayilar[i]=a;
        }
        diziYazdir(sayilar);
        System.out.println("Toplam: "+  ortalamaHesapla(sayilar));
        int ortalamaninAlti=0;
        for(int i=0;i<sayilar.length;i++){
            if(ortalamaHesapla(sayilar)>sayilar[i]){
                ortalamaninAlti++;
            }
        }
        System.out.println("Ortalmanın altındaki eleman sayısı:"+ortalamaninAlti);


    }
    public static void diziYazdir(int dizi[]){
        for (int i:dizi){
            System.out.print(i+",");
        }
        System.out.println("\n");
    }
    public static float ortalamaHesapla(int dizi[]){

        int toplam=0;
        for (int i=0;i< dizi.length;i++){
            toplam+=dizi[i];
        }
        return (float) toplam/(dizi.length);
    }
}
