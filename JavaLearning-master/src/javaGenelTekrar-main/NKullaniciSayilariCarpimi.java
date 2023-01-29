package genelTekrar;

import java.util.Scanner;

public class NKullaniciSayilariCarpimi {
    public static void main(String[] args) {
        Scanner tara= new Scanner(System.in);
        System.out.println("Bir değer giriniz , çıkmak için sıfıra basınız.");
        int kullaniciDegeri= tara.nextInt();
        int carpimSonucu=1;
        boolean kullaniciHemenCiktiMi=true;

        while (kullaniciDegeri !=0 ){

            carpimSonucu= carpimSonucu*kullaniciDegeri;
            System.out.println("Bir değer giriniz , çıkmak için sıfıra basınız.");
            kullaniciDegeri= tara.nextInt();
            kullaniciHemenCiktiMi=false;

        }
        if(kullaniciHemenCiktiMi==true){
            System.out.println("Uygulamadan Hemen Çıktınız.");
        }else {
            System.out.println("Girdiğiniz Sayıların Çarpımı : "+carpimSonucu);
        }


    }
}
