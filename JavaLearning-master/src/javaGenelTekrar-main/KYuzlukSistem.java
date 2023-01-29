package genelTekrar;

import java.util.Scanner;

public class KYuzlukSistem {




    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);
        int notDegeri = 0, notSinir = 0;

        System.out.println("Notunuzu giriniz");
        notDegeri = tara.nextInt();
        notSinir = notDegeri / 10;

        if (notDegeri == 100) {
            notSinir = 9;
        }
        switch (notSinir) {
            case 9:
                System.out.println("Notunuz AA");
                break;
            case 8:
                System.out.println("Notunuz BA");
                break;
            case 7:
                System.out.println("Notunuz BB");
                break;
            case 6:
                System.out.println("Notunuz CB");
                break;
            case 5:
                System.out.println("Notunuz CC");
                break;
            default:
                System.out.println("Notunuz CC'den düşük");
        }
    }
}