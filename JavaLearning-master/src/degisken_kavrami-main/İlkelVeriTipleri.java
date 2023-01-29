package degisken_kavrami;

public class İlkelVeriTipleri {

    public static void main(String[] args) {
        int integerDegiskeniminDegeri = 10 ;
        double doubleDegiskeniminDegeri = 10.50 ;
        short shortVeriTipi = 32767 ;

          //Aşağıdaki ifadeler tamsayı veri türlerinin özelliklerini belirtir.

        System.out.println("BYTE EN KUCUK DEĞERİ : " + Byte.MIN_VALUE + "  EN BUYUK DEĞERİ " + Byte.MAX_VALUE + "  KAÇ BİT " + Byte.SIZE);
        System.out.println("SHORT EN KUCUK DEĞERİ : " + Short.MIN_VALUE + "  EN BUYUK DEĞERİ " + Short.MAX_VALUE + "  KAÇ BİT " + Short.SIZE);
        System.out.println("İNTEGER EN KUCUK DEĞERİ : " + Integer.MIN_VALUE + "  EN BUYUK DEĞERİ " + Integer.MAX_VALUE + "  KAÇ BİT " + Integer.SIZE);
        System.out.println("LONG EN KUCUK DEĞERİ : " + Long.MIN_VALUE + "  EN BUYUK DEĞERİ " + Long.MAX_VALUE + "  KAÇ BİT " + Long.SIZE);

        //Aşağıdaki ifadeler ondalıklı veri türlerinin özelliklerini belirtir.

        System.out.println("FLOAT EN KUCUK DEĞERİ : " + Float.MIN_VALUE + "  EN BUYUK DEĞERİ " + Float.MAX_VALUE + "  KAÇ BİT " + Float.SIZE);
        System.out.println("DOUBLE EN KUCUK DEĞERİ : " + Double.MIN_VALUE + "  EN BUYUK DEĞERİ " + Double.MAX_VALUE + "  KAÇ BİT " + Double.SIZE);


        //char

        char harf = 'a' ;

        System.out.println("HARF :" +harf );

        int integerSayi = 'S' ;

        System.out.println("İNT SAYI :" + integerSayi);

        //BOOLEN

        boolean sonuc = true ;
        System.out.println("BOOLEN SONUÇ DEĞERİ :" + sonuc);

        sonuc=false;

        System.out.println("BOOLEN SONUÇ DEĞERİ : " +sonuc);


    }
}
