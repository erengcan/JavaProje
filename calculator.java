import java.util.Scanner;

public class calculator {

    public static void main(String[] args){


        Scanner okuyucu = new Scanner(System.in) ;
        System.out.println("hesap makinesine hoş geldiniz");
        System.out.println("hesaplamak istediğiniz 2 sayıyı giriniz.") ;

        int sayıBir= okuyucu.nextInt();
        int sayıİki = okuyucu.nextInt();
        System.out.println("hangi işlemi yapmak istersiniz? (*,/,-,+)");
        char işlem = okuyucu.next().charAt(0);
        int sonuç ;



    switch (işlem) {



        case '+' : sonuç =sayıBir+sayıİki;
        System.out.println(sayıBir + "+" +sayıİki + "="+ sonuç);
        break ;

        case '-' : sonuç =sayıBir - sayıİki;
            System.out.println(sayıBir + "-" +sayıİki + "="+ sonuç);
            break ;
        case '*' : sonuç =sayıBir*sayıİki;
            System.out.println(sayıBir + "*" +sayıİki + "="+ sonuç);
            break ;
        case '/' : sonuç =sayıBir/sayıİki;
            System.out.println(sayıBir + "/" +sayıİki + "="+ sonuç);
            break ;

        default: System.out.println("Çarpma ,bölme ,çıkarma veya toplama seçiniz.");

            }







    }
}
