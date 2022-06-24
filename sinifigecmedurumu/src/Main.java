import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Matematik, Fizik, Turkce, Kimya, Muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notu : ");
        Matematik = input.nextInt();
        System.out.print("Fizik Notu : ");
        Fizik = input.nextInt();
        System.out.print("Turkce Notu : ");
        Turkce = input.nextInt();
        System.out.print("Kimya Notu : ");
        Kimya = input.nextInt();
        System.out.print("Muzik Notu : ");
        Muzik = input.nextInt();

        double average = ( Matematik+ Fizik+ Turkce+ Kimya+ Muzik)/5;
        if (average < 55) {
            System.out.println("Sinifta kaldiniz.");
        }
        else {
            System.out.println("Sinifi Gectiniz.");

        }
        System.out.println("Ortalamaniz : " + average);
    }
}