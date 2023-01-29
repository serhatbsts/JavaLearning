package metotlarVeDiziler;
public class DiziKarmaSiralama {
    public static void main(String[] args){
        int sayialar[]={1,4,485,373,-5,7,15,78,65,656,56,65,21,35};
        diziYazdir(sayialar);
        System.out.println("\nYer Değiştirme İşleminden Sonra\n ");
        diziYerDegistirme(sayialar);
        diziYazdir(sayialar);
        System.out.println("\nDizinin Sıralanmış Hali\n");
        selectionSortSiralama(sayialar);
        diziYazdir(sayialar);
        int sonuc=binarySearch(sayialar, 55);
        System.out.println("Sonuç:"+sonuc);


    }
    public static int binarySearch(int dizi[],int aranacakDeger){
        int enDusukIndex=0;
        int enYuksekIndex=(dizi.length-1);

        while(enYuksekIndex>=enDusukIndex){
            int ortaIndex;
            ortaIndex=(enDusukIndex+enYuksekIndex)/2;
            if(aranacakDeger<dizi[ortaIndex]){

                enYuksekIndex=ortaIndex-1;

            }else if (aranacakDeger==dizi[ortaIndex]){
                return ortaIndex;//aranılacak elemanı gönderir
            }else {
                enDusukIndex=ortaIndex+1;

            }

        }
        return enDusukIndex-1;
    }
    public static void selectionSortSiralama(int dizi[]) {

        for (int i = 0; i < dizi.length - 1; i++) {
            //en küçük elemanın ve indexinin bulunması
            int oankiEnKucukSayi = dizi[i];
            int oankiEnKucukElemaninIndex = i;

            for (int j = i + 1; j < dizi.length; j++) {
                if (oankiEnKucukSayi > dizi[j]) {
                    oankiEnKucukSayi = dizi[j];
                    oankiEnKucukElemaninIndex = j;
                }
            }
            //eğer gerekli ise değerler yer değiştirir
            if (oankiEnKucukElemaninIndex != i) {
                dizi[oankiEnKucukElemaninIndex] = dizi[i];
                dizi[i] = oankiEnKucukSayi;
            }


        }
    }
        public static void diziYerDegistirme ( int dizi[]){
            for (int i = (dizi.length - 1); i > 0; i--) {
                int rastgele = (int) (Math.random() * (i + 1));
                int gecici;
                gecici = dizi[i];
                dizi[i] = dizi[rastgele];
                dizi[rastgele] = gecici;

            }
        }
        public static void diziYazdir ( int dizi[]){
            for (int i : dizi) {
                System.out.print(i + ",");
            }
        }
    }

