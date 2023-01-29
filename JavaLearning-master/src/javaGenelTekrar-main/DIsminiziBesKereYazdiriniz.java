package genelTekrar;

public class DIsminiziBesKereYazdiriniz {
    public static void main(String[] args) {
        //for döngüsü ile
        for(int i=1; i<6;i++){
            System.out.println(i+" Serhat Beştaş For ile");
        }

        //while döngüsü ile
        int sayi =1;
        while (sayi<6){
            System.out.println(sayi+" Serhat Beştaş While ile");
            sayi++;
        }

        //do-while döngüsü ile
        int a=1;
        do {
            System.out.println(a+" Serhat Beştaş Do-While ile");
            a++;

        }while (a<6);
    }
}
