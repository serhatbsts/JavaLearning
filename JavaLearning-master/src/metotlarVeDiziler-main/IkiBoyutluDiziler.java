package metotlarVeDiziler;

public class IkiBoyutluDiziler {
    public static void main(String[] args) {
        //2*3 lük bir matris oluşturalım
        int sayilar[][]=new int[2][3];
        sayilar[0][0]=1;
        sayilar[0][1]=3;
        sayilar[0][2]=5;
        sayilar[1][0]=7;
        sayilar[1][1]=9;
        sayilar[1][2]=11;
        //3*3lük matris
        int[][]sayilar2={{1,3,5},{7,9,11},{13,15,17}};

        for (int satir=0;satir<sayilar.length;satir++){
            for (int sutun=0;sutun<sayilar[satir].length;sutun++){
                System.out.println((satir+1)+ ". satırının "+(sutun+1)+" . sutunundaki sayı "+sayilar[satir][sutun]);
            }
        }

        System.out.println("\n*****************************************\n");
        int borclar[][]={{0,100,200},{350,0,250},{150,500,0}};
        String isimler[]={"Emre","Hasan","Ali"};
        for (int satir=0;satir<borclar.length;satir++){
            for (int sutun=0;sutun<borclar[satir].length;sutun++){

                if(borclar[satir][sutun]!=0){
                    int alacak=borclar[satir][sutun]-borclar[sutun][satir];
                    if(alacak<0){
                        System.out.println(isimler[satir]+ "'nin  "+isimler[sutun]+" dan "+(-alacak)+" alacağı");

                    }
                }

            }
        }

    }
}
