package operatorler;

public class AritmetikAtama {
    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 20;

        int sonuc = 0;
        sonuc += sayi1; // sonuc = sonuc + sayi1; --sonuc=10
        System.out.println("Sonuç :" +sonuc);

        sonuc -= sayi2; // sonuc = sonuc - sayi2; --sonuc= -10
        System.out.println("Sonuc :" + sonuc);

        sonuc *= sayi1; // sonuc = sonuc * sayi1;  --sonuc=-100
        System.out.println("Sonuç :" +sonuc);

        sonuc /= sayi2; // sonuc = sonuc / sayi2; --sonuc= -5
        System.out.println("Sonuc :" + sonuc);

        //odev
        double ondalikliSayi=6.50;
        double odevSonucu = 0;


        odevSonucu++;
        ondalikliSayi *= odevSonucu;

        System.out.println("Sonuç : " + ondalikliSayi);


        //odev

        int s1=10;
        int s2= 6 ;

        s1++;
        --s2;

        s1 *= --s2;

        System.out.println("S1 in son değeri :" + s1);
        System.out.println("S2 nin son değeri :" + s2);


    }
}
