import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kilo, boy, kitleIndex;
        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen boyunuzu (metre cinsinde) giriniz = ");
        boy = input.nextDouble();

        System.out.print("Lutfen kilonuzu giriniz = ");
        kilo = input.nextDouble();

        kitleIndex =( kilo /( boy * boy));

        System.out.println("Vucut Kitle Indeksiniz : " + kitleIndex);
    }
}