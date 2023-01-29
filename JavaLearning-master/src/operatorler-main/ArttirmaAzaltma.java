package operatorler;

public class ArttirmaAzaltma {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = ++sayi1;
        int sayi3 = sayi1--;

        System.out.println("Sonuc : " + ((sayi1)+(--sayi2)+(sayi3++)));

        System.out.println("Serhat " + "Beştaş");
        System.out.println(sayi1+sayi2);
        System.out.println("Serhat " +(sayi1+sayi2));

        //sayi1++ ==> sayi1= sayi1+ 1;
        //sayi2-- ==> sayi2= sayi2- 1;

    }
}
