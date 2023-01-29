package genelTekrar;

import java.util.Scanner;

public class GFaktoriel {
    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);

        System.out.println("Lütfen Bir Sayı Giriniz");
        int sayi= tara.nextInt();
        int faktoriel= 1;

        for (int i=sayi; i>0;i--){

            faktoriel = faktoriel*i;
        }
        System.out.println("Faktöriel Sonucu: " +faktoriel);
    }
}
