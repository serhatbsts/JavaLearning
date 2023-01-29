package metotlarVeDiziler;

public class MetotlaraDiziGondermekveAlmak {
    public static void main(String[] args) {
        int dizi[]={1,2,485,758};
        diziGoster(dizi);
        diziDegerleriniBirArttir(dizi);
        System.out.println(" dizinin yeni değerleri "+dizi[0]);
        System.out.println(" dizinin yeni değerleri "+dizi[1]);
        System.out.println(" dizinin yeni değerleri "+dizi[2]);

        toplamiBul(1,2,5,485);

    }

    private static void toplamiBul(int...paramatreler) {
        int toplam=0;
        for (int oankiSayi:paramatreler){
            toplam+=oankiSayi;


        }
        System.out.println("Toplam:"+toplam);
    }

    private static void diziDegerleriniBirArttir(int[] dizi) {
        for(int i=0;i< dizi.length;i++)
            dizi[i]++;
    }

    private static void diziGoster(int[] dizi) {
        for (int oankiSayi:dizi)
            System.out.println(" o anki sayi: "+oankiSayi);
    }
}
