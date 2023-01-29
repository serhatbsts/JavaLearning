package metotlarVeDiziler;

public class MetotKavrami {
    public static void main(String[] args) {

        menuGoster();
        sayilariTopla(15,25);
        sayilariTopla(2,7);
        sayilariTopla(9,11);

        int sayi=5;
        sayiyiDegistir(sayi);
        System.out.println("sayının değerei :"+sayi);

        sayilarinFarkiniBul(10,6);
        System.out.println("fark:"+sayilarinFarkiniBul(10,6));

        int dondurulenDeger= sayilarinFarkiniBul(10,6);
        System.out.println("dondürülen değer "+dondurulenDeger);

        //parametre almayan ve geriye değer döndüren metot
        double rastgeleSayi= Math.random();
        System.out.println("rastgele sayı 1:"+rastgeleSayi);
        System.out.println("rastgele sayı 2:"+Math.random());//bu şekildede kullanılabilir.b


    }
    //geriye değer döndüren parametre

    public static int sayilarinFarkiniBul(int a, int b) {
       // System.out.println("sayıların farkı: "+(a-b));
        return (a-b);
    }

    //parametre alan metot
    public static void sayiyiDegistir(int x) {
        x=x+10;
        System.out.println("x değeri :"+x);

    }

    //parametre alan metot
    public static void sayilariTopla(int a,int b){
        System.out.println("Sayıların Toplamı: "+ (a+b));

    }

    //paramatre almayan ve geriye değer döndürmeyen metot
    public static void menuGoster(){
        System.out.println("1. iki sayının toplamını bul");
        System.out.println("2. iki sayının farkını bul");
        System.out.println("3. iki sayının çarpımını bul");
        System.out.println("4. iki sayının bölümünü bul");
    }
}
