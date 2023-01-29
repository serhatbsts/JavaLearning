package genelTekrar;

import java.util.Scanner;

public class HFonksiyon {
    public static void main(String[] args) {

        //x>0, y<0 ise f(x,y) = 4x+2y+4
        //x>0, y=0 ise f(x,y) = 2x-y+3
        //x<0, y>0 ise f(x,y) = 3x+4y+3
        Scanner tara = new Scanner(System.in);
        System.out.println("x için değer giriniz:" );
        int x= tara.nextInt();
        System.out.println("Y için değer giriniz:");
        int y= tara.nextInt();


        if(x>0&&y<0){
           int f= 4*x+2*y+4;
            System.out.println("F fonksyonun sonucu:" +f);

        }else if(x>0&&y==0){
            int f=2*x-y+3;
            System.out.println("F fonksyonun sonucu:" +f);

        }else if(x<0&&y>0) {
            int f=3*x+4*y+3;
            System.out.println("F fonksyonun sonucu:" +f);


        }else {
            System.out.println("Lütfen Geçerli Bir Aralık Seçiniz");
        }
    }
}
