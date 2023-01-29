package kontrolYapilari;

public class SwitchCaseYapilari {
    public static void main(String[] args) {
        int haftaninKacinciGunu = 3 ;

        if(haftaninKacinciGunu==1){
            System.out.println("pazartesi");
        }else if(haftaninKacinciGunu==2){
            System.out.println("salı");
        }else if(haftaninKacinciGunu==3) {
            System.out.println("çarşamba");
        }else if(haftaninKacinciGunu==4) {
            System.out.println("perşembe");
        }else if(haftaninKacinciGunu==5) {
            System.out.println("cuma");
        }

        switch (haftaninKacinciGunu){
            case 1: System.out.println("switch pazartesi");break;
            case 2: System.out.println("switch salı");break;
            case 3: System.out.println("switch çarşamba");break;
            case 4: System.out.println("switch perşembe");break;
            case 5: System.out.println("switch cuma");break;
            default:
                System.out.println("hatalı değer girildi");

        }
        System.out.println("switch'ten çıkıldı");
    }
}
