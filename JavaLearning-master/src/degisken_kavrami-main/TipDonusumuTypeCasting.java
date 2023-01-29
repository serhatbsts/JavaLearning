package degisken_kavrami;

public class TipDonusumuTypeCasting {
    public static void main(String[] args) {


        int sayi = 5 ;
        float noktaliSayi = 130.25F ;


        /*noktaliSayi= sayi;

        System.out.println("Noktalı Sayını Değeri: "+ noktaliSayi);

         */

        sayi= (int) noktaliSayi;

        System.out.println("Sayının Değeri :"+ sayi);

        byte byteSayi= 5;

        byteSayi= (byte) noktaliSayi;
        System.out.println("BYTE SAYI DEĞERİ :" + byteSayi);




    }
}
