package metotlarVeDiziler;

import java.util.Collection;
import java.util.Collections;

public class DiziKavramiylaIskambilOyunu {
    public static void main(String[] args) {
        /*Iskambil destesini diziler ile olusturun.
         Sonrasında bu destedeki elemanları karıştırın ve de ilk kullanıcıya hangi 4 kartın geldiğini ekrana yazdırın.*/
        String kartIsim[]={"karo","maça","kupa","sinek"};
        String kartNumara[]={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        int deste[]=new int[52];
        desteyiOlustur(deste);
        desteyiKaristir(deste);
        diziYazdir(deste);
        desteyiOlustur(deste,kartIsim,kartNumara);

    }
    public static void desteyiKaristir(int dizi[]){
        for (int i=0;i< dizi.length;i++){
            int rastgeleIndex=(int) (Math.random()*dizi.length);
            int gecici=dizi[i];
            dizi[i]=dizi[rastgeleIndex];
            dizi[rastgeleIndex]=gecici;
        }
    }
    public static void desteyiOlustur(int deste[],String isim[],String numara[]){
        for (int i=0;i<4;i++){
            String kartTuru = isim[deste[i] / 13];
            String kartNumarasi = numara[deste[i] % 13];

            System.out.println(kartTuru + " " + kartNumarasi);
        }
    }
    public static void diziYazdir ( int dizi[]){
        for (int i : dizi) {
            System.out.print(i + ",");
            System.out.println();
        }
    }
    public static void desteyiOlustur(int dizi[]){
        for (int i=0;i< dizi.length;i++){
            dizi[i]=i;
        }
    }
}
