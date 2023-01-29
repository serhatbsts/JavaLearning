package genelTekrar;

import java.util.Scanner;

public class CGecmeNotuHesaplama {
    public static void main(String[] args) {
        Scanner tara= new Scanner(System.in);
        System.out.println("Vize Notunuzu Giriniz:");
        int vizeNotu= tara.nextInt();
        System.out.println("Final Notunuzu Giriniz");
        int finalNotu= tara.nextInt();
        //Vizenin %40 ı ile Finalin %60 toplamı ortalamayı oluşturur.50 geçme notudur.

        double ortalama= vizeNotu*0.4+finalNotu*0.6;
        System.out.println("Ortalamanız: " +ortalama);

        if(ortalama >= 50){
            System.out.println("Geçtiniz");

        }else{
            System.out.println("Kaldınız");
        }
    }
}
