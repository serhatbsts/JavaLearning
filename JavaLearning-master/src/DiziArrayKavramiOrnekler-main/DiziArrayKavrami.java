package metotlarVeDiziler;

import java.util.Scanner;

public class DiziArrayKavrami {
    public static void main(String[] args) {
        //10 elemanlı bir diziye eleman olarak dizi indeksinin karesini atayan uygulama
       int dizi[] ={1,2,3,4,5,6,7,8,9,485};
            for(int i=0;i< dizi.length;i++){
            int kare;
            kare = (int) Math.pow(dizi[i],2 );
            System.out.println("Dizideki "+(i+1)+". Sayının Karesi = "+kare);

        }
            //Kullanıcıdan hangi ayda olduğunu bilgisini alıp ilgili ay değerini yazdırın. Ay adlarını bir dizide saklayın.
            String aylar[]={"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};
        Scanner tara = new Scanner(System.in);
        System.out.println("Kaçıncı Ayda Olduğumuzu Yazınız :");
        int ay= tara.nextInt();
        System.out.println("Şuanda "+aylar[ay-1]+" Ayındayız");



        /*Kullanıcıdan kaç tane sayının ortalamasını bulmasını istediğini sorun ve buna bağlı olarak aldıgınız değerleri bir dizide saklayın.
         Veri alma işlemi bittikten sonra tüm sayıları ve ortalamasını ekrana yazdırın.*/

        System.out.println("Kaç Tane Sayının Ortalamasını Bulmak İstiyorsunuz ?");
        int sayi= tara.nextInt();
        int kullaniciDizi[]=new int[sayi];
        int toplam = 0;
            for (int i=0;i< kullaniciDizi.length;i++){

                System.out.println("Dizideki "+(i+1)+". Değeri Giriniz");
                int deger= tara.nextInt();
                kullaniciDizi[i]=deger;
                toplam+=kullaniciDizi[i];
        }
            double ort=(double) toplam/ kullaniciDizi.length;
        System.out.println("Dizideki Sayıları Ortalaması "+ort);


        }


    }
