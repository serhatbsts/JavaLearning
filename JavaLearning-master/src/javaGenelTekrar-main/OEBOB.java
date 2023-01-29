package genelTekrar;

import java.util.Scanner;

public class OEBOB {
    public static void main(String[] args) {
        Scanner tara= new Scanner(System.in);
        System.out.println("Birinci Sayıyı Giriniz :");
        int sayi1=tara.nextInt();
        System.out.println("İkinci Sayıyı Giriniz :");
        int sayi2=tara.nextInt();

        int ebob=1;
        int kontrol =2;

        while (kontrol<=sayi1 && kontrol<=sayi2){

            if(sayi1%kontrol ==0 && sayi2%kontrol==0){
                ebob=kontrol;
            }
            kontrol++;
        }
        if(ebob==1){
            System.out.println(sayi1+" ile "+sayi2+" aralarında asaldır");
        }
        System.out.println(sayi1+" sayısı ile "+sayi2+" sayısının ebob'u "+ebob+"'tur");
    }
}
