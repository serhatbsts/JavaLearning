package kontrolYapilari;

import java.util.Scanner;

public class KullanicilardanVeriAlma {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);

       int kullanicininGirdigiSayi = tara.nextInt();
       System.out.println("Kullanıcının girdiği değer :" +kullanicininGirdigiSayi);

       double kullaniciDouble = tara.nextDouble();
        System.out.println("double değer: " +kullaniciDouble);




        String isim= tara.next();
        System.out.println("girilen isim : "+ isim);
        tara.nextLine();

        String isimSoyisim = tara.nextLine();
        System.out.println("girilen isim soyisim : " +isimSoyisim);

        char harf = tara.next().charAt(0);
        System.out.println("harf: " +harf);
    }
}
