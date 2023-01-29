package operatorler;

public class AritmetikOparatorler {

    public static void main(String[] args) {
        int sayi1= 60;
        int sayi2 = 40;
        System.out.println("Sayi1 : " + sayi1 +"Sayi2 :" + sayi2 + "Toplamları :" + (sayi1+sayi2));
        System.out.println("Sayi1 : " + sayi1+ "Sayi2 : " +sayi2+"Farkları :"+(sayi1-sayi2));
        System.out.println("Sayi1 : " + sayi1+ "Sayi2 : " +sayi2+"Çarpımları :" +(sayi1*sayi2));
        System.out.println("Sayi1 : " + sayi1+ "Sayi2 : " +sayi2+"Bölümleri :" + ((double)sayi1/(double)sayi2));
        System.out.println("Sayi1 : " + sayi1+ "Sayi2 : " +sayi2+"Modları :"+(sayi1%sayi2));

    }
}
