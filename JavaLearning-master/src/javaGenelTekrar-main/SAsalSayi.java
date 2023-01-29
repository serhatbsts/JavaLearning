package genelTekrar;

import java.util.Scanner;

public class SAsalSayi {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        System.out.println("Üst Sınırı Giriniz");
        int sayi= tara.nextInt();

        for (int i=2; i<=sayi;i++){
            boolean asalMi=true;
            for (int j=2;j<i;j++){
                if(i%j==0 ){
                    asalMi=false;
                    break;
                }
            }
            if (asalMi){
                System.out.print(i+",");
            }
        }
    }
}
