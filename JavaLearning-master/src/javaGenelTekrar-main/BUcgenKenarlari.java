package genelTekrar;

import java.util.Scanner;

public class BUcgenKenarlari {
    public static void main(String[] args) {
        Scanner tara= new Scanner(System.in);
        //Geometrideki üçgen oluşturma şartları aranmaz.
        System.out.println("Üçgenin Birinci Kenarını Cm Türünden Giriniz:");
        int birinciKenar= tara.nextInt();
        System.out.println("Üçgenin İkinci Kenarını Cm Türünden Giriniz:");
        int ikinciKenar= tara.nextInt();
        System.out.println("Üçgenin Üçüncü Kenarını Cm Türünden Giriniz:");
        int ucuncuKenar= tara.nextInt();


        if(birinciKenar==ikinciKenar&&birinciKenar==ucuncuKenar){
            System.out.println("Eşkenar Üçgen Oluşturdunuz");

        }else if (birinciKenar==ikinciKenar||birinciKenar==ucuncuKenar||ikinciKenar==ucuncuKenar){
            System.out.println("İkizkenar Bir Üçgen Oluşturdunuz");

        }else {
            System.out.println("Çeşitkenar Bir Üçgen Oluşturdunuz");
        }
    }
}

