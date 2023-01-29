package metotlarVeDiziler;

import java.util.Scanner;

public class VerilenIkiSayininEkokunuBulma {
    public static void main(String[] args) {
      /*  Verilen iki sayının en küçük ortak katını bulan uygulamayı yazınız.
        Ekok(s1,s2) * ebob(s1,s2) =  (s1*s2); buna uygun olacak şekilde bulunuz
        */
        Scanner tara=new Scanner(System.in);
        System.out.println("1.Sayıyı giriniz:");
       int sayi1= tara.nextInt();
        System.out.println("2.Sayıyı giriniz:");
       int sayi2= tara.nextInt();
        System.out.println(sayi1+" ile "+sayi2+" nin ekoku: "+ekokBulma(sayi1,sayi2));



    }
    public static int ekokBulma(int sayi1,int sayi2 ){
        int ekok;
        int ebob;
        ebob=ebobBulama(sayi1,sayi2);
        ekok=(sayi1*sayi2)/ebob;
        return ekok;
    }
    public static int ebobBulama(int sayi1,int sayi2){
        int ebob=1;
        int kontrol =2;

        while (kontrol<=sayi1 && kontrol<=sayi2){

            if(sayi1%kontrol ==0 && sayi2%kontrol==0){
                ebob=kontrol;
            }
            kontrol++;
        }
        if(ebob==1){
        }
        return ebob;
    }
}
