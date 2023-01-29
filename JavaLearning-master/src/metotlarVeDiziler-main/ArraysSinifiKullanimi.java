package metotlarVeDiziler;

import java.util.Arrays;

public class ArraysSinifiKullanimi {
    public static void main(String[] args) {
        int numbers[]={1,5,7,-8,7,55,654,485,373};
        int numbers2[]={1,5,7,-8,7,55,654,485,373};
        diziYazdir(numbers);
        System.out.println("\nBelirli bir kısmın sıralanmış hali Sıralanmış dizinin yazdırılması\n");
        Arrays.sort(numbers,2,5);
        diziYazdir(numbers);
        System.out.println("\nSıralanmış dizinin yazdırılması\n");
        Arrays.sort(numbers);//sıralama
        diziYazdir(numbers);
        Arrays.parallelSort(numbers);//işlemci güçlü ve sıralanacak sayi sayısı fazla ise bu kullanılır

        int sonuc=Arrays.binarySearch(numbers,485);
        System.out.println("\nSonuç:"+sonuc);

        System.out.println("Numbers ile Numbers2 birbiri ile aynı mı: "+Arrays.equals(numbers,numbers2));

        int yeniDizi[]=new int[15];
        Arrays.fill(yeniDizi,485);
        diziYazdir(yeniDizi);

    }

    public static void diziYazdir(int dizi[]){
        for (int i : dizi) {
            System.out.print(i + ",");
        }
        System.out.println("\n");
    }
}
