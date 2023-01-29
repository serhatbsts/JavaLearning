package metotlarVeDiziler;

import java.util.Scanner;

public class TestCevapAnahtari {
    public static void main(String[] args) {
        /*Kullanıcının girdiği öğrenci sayısı ve kullanıcının girdiği toplam soru sayısına bağlı olarak,
        öğrencilerin soruya verdiği cevapları tutan bir matris düzenleyin. Bu değerleri rastgele olarak olusturun.
        Değerler A,B,C,D,E  olmalı.
        Bir de doğru cevapları tutan tek boyutlu bir diziniz olsun. Bu da rastgele oluşturulmalı.
        Sonrasında bu değerleri karşılaştırarak her bir öğrencinin kaç doğru ve yanlışı olduğunu gösteren programı yazınız.
        */
        Scanner tara=new Scanner(System.in);
        System.out.println("Soru Sayısını Giriniz");
        int soruSayisi= tara.nextInt();
        System.out.println("Öğrenci Sayısını Giriniz");
        int ogrenciSayisi= tara.nextInt();
        String ogrenciCevaplari[][]=new String[ogrenciSayisi][soruSayisi];
        String cevapAnahtari[]=new String[soruSayisi];
        degerlendirme(OgrenciCevaplarininKaristirilmasi(ogrenciCevaplari),CevapAnahtariOlustur(cevapAnahtari));

    }
    //
    //
    //
    //
    public static void degerlendirme(String[][] ogr,String[] cvp){
        for (int i=0;i<ogr.length;i++){
            int dogru=0;
            int yalnis=0;
            for (int j=0;j< cvp.length;j++){
                if(ogr[i][j]==cvp[j]){
                    dogru++;
                }else {
                    yalnis++;
                }

            }

            System.out.println((i+1)+". öğrencinin doğru cevap sayisi: "+dogru+" yalnis cevap sayısı: "+yalnis);
        }

    }
    public static String[] CevapAnahtariOlustur(String[] dizi){
        String[] cevap ={"A","B","C","D","E"};
        for (int i=0;i<dizi.length;i++){
            int rastgele=(int) (Math.random()*cevap.length);
            dizi[i]=cevap[rastgele];

        }
        return dizi;

    }

    public static String[][] OgrenciCevaplarininKaristirilmasi(String dizi[][]){
        String cevap[]={"A","B","C","D","E"};
        for (int i=0;i<dizi.length;i++){
            for (int j=0;j<dizi[i].length;j++){
                int rastgele=(int) (Math.random()*cevap.length);
                dizi[i][j]=cevap[rastgele];
            }
        }
        return dizi;

    }
    public static String isim(String a){

        return a;
    }
}
