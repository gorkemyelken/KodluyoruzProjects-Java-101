import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar, kdvOrani, kdvliFiyat, netKdv, kdvSecimi;
        System.out.print("Urun tutari = ");
        tutar = input.nextDouble();

        boolean kosul1 = tutar >= 1000;
        kdvSecimi = kosul1 ? 8 : 18;

        netKdv = (tutar * kdvSecimi) / 100;
        kdvliFiyat = tutar + netKdv;
        kdvOrani = kdvSecimi;

        System.out.println("Kdvsiz fiyat= " + tutar);
        System.out.println("Kdvli fiyat= " + kdvliFiyat);
        System.out.println("Kdv= " + netKdv);
        System.out.println("Kdv orani= " + kdvOrani);
    }
}