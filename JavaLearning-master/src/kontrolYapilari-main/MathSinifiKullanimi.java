package kontrolYapilari;

public class MathSinifiKullanimi {
    public static void main(String[] args) {
        System.out.println("pi sayısının değeri : " +Math.PI);
        System.out.println("E sayısının değeri : " +Math.E);

        System.out.println("-5in mutlak değeri : " +Math.abs(-5));
        System.out.println("4.6 nın yuvarlanmış hali: " +Math.ceil(4.6));
        System.out.println("3 ün küpü : "+ Math.pow(3,3));
        System.out.println("81 in karekökü  : "+ Math.sqrt(81));
        System.out.println("2,3 ü karşılaştır  : "+ Math.max(2,3));
        System.out.println("2,3 ü karşılaştır  : "+ Math.min(2,3));

        int rasgeleSayi = (int) (Math.random()*10+1);
        System.out.println("rasgele sayı :" +rasgeleSayi);

        int ikiyeKadarRasgeleSayi = (int) (Math.random()*2+1);
        System.out.println("İkiye Kadar Seçilen Sayı:" +ikiyeKadarRasgeleSayi);

        //eğer üretilecek sayıda 0 olmasını istiyorsak
        // Math.random()*(üst sınır+1)

        //eğer üretilecek sayıda 0 olmamasını istiyosak
        //Math.random()*(üst sınır)+1



    }
}
