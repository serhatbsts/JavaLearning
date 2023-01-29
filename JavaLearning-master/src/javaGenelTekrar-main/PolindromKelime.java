package genelTekrar;

import java.util.Scanner;

public class PolindromKelime {
    public static void main(String[] args) {
        Scanner tara =new Scanner(System.in);
        System.out.println("Bir Kelime Gİriniz");
        String kelime= tara.nextLine();

        int altSinir=0;
        int ustSinir=kelime.length()-1;
        boolean polindromMu=true;

        while (altSinir<ustSinir){

            if(kelime.charAt(altSinir)!=kelime.charAt(ustSinir)){
                polindromMu=false;
                break;
            }
            altSinir++;
            ustSinir--;

        }
        if (polindromMu){
            System.out.println(kelime+" kelimesi polindromdur.");
        }else {
            System.out.println(kelime+" kelimesi polindrom değildir.");
        }
    }
}
