import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double
                armutKilo = 2.14,
                elmaKilo =3.67,
                domatesKilo = 1.11 ,
                muzKilo = 0.95,
                patlıcanKilo = 5.00,
                armutMiktar, elmaMiktar,domatesMiktar,muzMiktar,patlicanMiktar;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kac Kilo = ");
        armutMiktar= input.nextDouble();

        Scanner input1 = new Scanner(System.in);
        System.out.print("Elma Kac Kilo = ");
        elmaMiktar= input.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Domates Kac Kilo = ");
        domatesMiktar= input.nextDouble();

        Scanner input3 = new Scanner(System.in);
        System.out.print("Muz Kac Kilo = ");
        muzMiktar= input.nextDouble();

        Scanner input4 = new Scanner(System.in);
        System.out.print("Patlican Kac Kilo = ");
        patlicanMiktar= input.nextDouble();

        double toplamTutar;
        toplamTutar=((armutMiktar*armutKilo)+(elmaMiktar*elmaKilo)+(domatesMiktar*domatesKilo)+(muzMiktar*muzKilo)+(patlicanMiktar*patlıcanKilo)) ;
        System.out.print("Toplam Tutar = "  +toplamTutar);
    }
}