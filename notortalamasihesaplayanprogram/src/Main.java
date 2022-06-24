import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mat, fizik, kimya, turkce, tarih , muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik: ");
        mat = input.nextDouble();

        System.out.print("Fizik: ");
        fizik = input.nextDouble();

        System.out.print("Kimya: ");
        kimya = input.nextDouble();

        System.out.print("Turkce: ");
        turkce = input.nextDouble();

        System.out.print("Tarih: ");
        tarih = input.nextDouble();

        System.out.print("Muzik:  ");
        muzik = input.nextDouble();

        double total =mat+fizik+kimya+turkce+tarih+muzik;
        double ortalama = total/6;

        boolean gectiMi= ortalama>=60;
        String str= gectiMi ? "Gecti":"Kaldı";
        System.out.println(str);
    }
}