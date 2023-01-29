package metotlarVeDiziler;

import java.util.Arrays;

public class IkiBoyuluDiziToplami {
    public static void main(String[] args) {
        /*Her bir elemanı rastgele oluşturulmuş 3*2lik bir matriste bulunan sayıların toplamını yazdıran program yazınız.
        Ayrıca bu matriste yer alan en küçük ve en büyük sayıyı da mesaj olarak göstersin.*/
        int sayilar[][]=new int[3][2];
        for (int satir=0;satir<sayilar.length;satir++){
            for (int sutun=0;sutun<sayilar[satir].length;sutun++){
                int a= (int) (Math.random()*(100));
                sayilar[satir][sutun]=a;
            }
        }
       diziYazdir(sayilar);
        diziYazdir(sayilar);
    }


    public static void diziYazdir(int dizi[][]){
        for (int i=0;i<dizi.length;i++){
            for (int j=0;j<dizi[i].length;j++){
                System.out.println((i+1)+".satırın "+(j+1)+". sutunun değereri: "+dizi[i][j]);
            }
        }

    }
}
