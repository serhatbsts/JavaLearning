package metotlarVeDiziler;

public class DizilerinKopyalanmasi {
    public static void main(String[] args) {
           //manual method
        int anaDizi[]={1,7,485,373};
        int kopyaDizi[]=new int[anaDizi.length];
        for(int index=0;index< anaDizi.length;index++){
            kopyaDizi[index]=anaDizi[index];
        }
        diziYazdir(kopyaDizi);
        System.out.println("***************");

        //arraycopy
        int kopyaDizi2[]=new int[anaDizi.length];
        System.arraycopy(anaDizi,0,kopyaDizi2,0,anaDizi.length);

        diziYazdir(kopyaDizi2);
        System.out.println("***************");

        int denemeDizisi[]=new int[anaDizi.length];
        denemeDizisi=anaDizi;
        diziYazdir(denemeDizisi);
        System.out.println("***************");
        diziYazdir(anaDizi);
        System.out.println("***************");
        anaDizi[0]=100;
        diziYazdir(denemeDizisi);
        System.out.println("***************");
        diziYazdir(anaDizi);
        int tersiOlusturulmusDizi[]=tersiniOlustur(anaDizi);
        System.out.println("***************");
        diziYazdir(tersiOlusturulmusDizi);


    }
    public static int[] tersiniOlustur(int dizi[]){
        int olusanDizi[]=new int[dizi.length];
        for(int i=0,j= (dizi.length-1);i< dizi.length;i++,j--){
            olusanDizi[j]=dizi[i];
        }
        return olusanDizi;
    }
    public static void diziYazdir(int yazdirilacakDizi[]){

        for (int number: yazdirilacakDizi){
            System.out.println("Kopya Dizi Elemanı: "+number);
        }

    }
}
