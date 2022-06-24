import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n , m , h;
        Scanner input= new Scanner(System.in);
        System.out.print( "Ilk sayinizi giriniz = ");
        n= input.nextInt();
        Scanner input1= new Scanner(System.in);
        System.out.print( "Ikinci sayinizi giriniz = ");
        m= input.nextInt();
        Scanner input2= new Scanner(System.in);
        System.out.println( "Toplam 1\nCikarma 2\nCarpma 3\nBolme 4");
        System.out.print( "Seciminiz = ");
        h= input.nextInt();

        switch (h) {
            case 1 :
                System.out.println( "Toplam : " + (n + m));
                break;
            case 2 :
                System.out.println( "Fark : " + (n - m));
                break;
            case 3 :
                System.out.println( "Carpim : " + (n * m));
                break;
            case 4 :
                    System.out.println( "Bolum : " + (n / m));
                break;
            default :
                System.out.println("Yanlis secim sectiniz.");
        }
    }
}