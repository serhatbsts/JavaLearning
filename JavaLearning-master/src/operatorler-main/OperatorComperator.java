package operatorler;

public class OperatorComperator {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 11;

        System.out.println("Sayı1 eşit değil mi Sayı2 : " + (sayi1 != sayi2));
        System.out.println("Sayı1 küçük eşit mü Sayı2 :  " + (sayi1 <= sayi2));
        System.out.println("Sayı1 büyük eşit mi mü Sayı2 : " + (sayi1 >= sayi2));
        System.out.println("Sayı1 eşit mi Sayı2 : " + (sayi1 == sayi2));
        System.out.println("Sayı1 büyük eşit mi Sayı2 : " + (sayi1 >= sayi2));
        System.out.println("Sayı1 eşit  değil mi Sayı2 : " + (sayi1 != sayi2));

        if (sayi1 < sayi2) {
            System.out.println("sayı1 küçüktür sayı2");
        } else {
            System.out.println("sayı1 büyüktür sayı2");
        }


        boolean deger1 = true;
        boolean deger2 = false;

        System.out.println("deger1 ve deger2 and(ve) durumu :" + (deger1 && deger2));
        System.out.println("deger1 ve deger2 or(veya) durumu : " + (deger1 || deger2));

        int benimYasim = 25 ;
        int onunYasi = 30;

        if(benimYasim > 20 && onunYasi< 35){
            System.out.println("birinci blok çalıştı");
        }
        if(benimYasim < 20 || onunYasi > 40){
            System.out.println("ikinci blok çalıştı");
        }else{
            System.out.println("ikinci blogun else kısmı çalıştı");
        }
    }
}
