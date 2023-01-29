package kontrolYapilari;

public class IfElseKullanimi {
    public static void main(String[] args) {

        int benimYasim = 30;
        int onunYasi = 30;

        if(benimYasim>onunYasi){
            System.out.println("benim yaşım onun yaşından büyüktür.");
        }else if(benimYasim<onunYasi){
            System.out.println("benim yaşım onun yaşından küçüktür");
        }else {
            System.out.println("benim yaşım onun yaşına eşittir");
        }
        System.out.println("program sonlandı");




        int a= 10, b=6, c=0;

        if(a>b){
            c= a-b ;

        }else {

            c=a+b;

        }
        System.out.println("c'nin son değeri : " + c);

        c= (a>b) ? (a-b) : (a+b);
        System.out.println("c'nin son değeri : " + c);

    }
}
