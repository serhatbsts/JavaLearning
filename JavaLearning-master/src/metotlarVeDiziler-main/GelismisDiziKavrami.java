package metotlarVeDiziler;

public class GelismisDiziKavrami {
    public static void main(String[] args) {
        //for each döngüsü
        int sayi[]={1,2,456,485,373};

        diziYazdir(sayi);
    }

    public static void diziYazdir(int sayi[]) {
        for (int oAnkiSayi:sayi){
            System.out.println("O Anki Sayı="+oAnkiSayi);
        }


    }
}
