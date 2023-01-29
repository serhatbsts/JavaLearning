package operatorler;

public class OdevCozumleri {
    public static void main(String[] args) {
        //COZUM1

        int saniye= 4566;
        int dakika = saniye/60;
        int kalanSaniye = saniye %60;
        System.out.println("Girdiğiniz " +saniye+ " saniye " +dakika+ " dakika ve " +kalanSaniye+ " saniyeye eşittir");

        //COZUM2

        double fahrenheit = 100.0;
        double celcius = (5/9d) * (fahrenheit-32);
        System.out.println("Girilen " + fahrenheit+ " fahrenheit değeri = " +celcius+ " celcius");

        //COZUM3

        int yil = 4044;
        boolean artikYilMi = (yil%400 == 0) || (yil % 4 ==0 && yil % 100 != 0);
        System.out.println("Girilen  " +yil+ " yılı artık yıldır. " +artikYilMi);


    }



}
