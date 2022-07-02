import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month;
        int day;

        System.out.print("Dogdugunuz gunu giriniz: ");
        day = input.nextInt();

        System.out.print("Dogdunuz ayi giriniz (Sayi olacak sekilde): ");
        month = input.nextInt();

        if (month == 1) {
            if (day <= 21) System.out.println("Oglak");
            else System.out.println("Kova");
        } else if (month == 2) {
            if (day <= 19) System.out.println("Kova");
            else System.out.println("Balik");
        } else if (month == 3) {
            if (day <= 20) System.out.println("Balik");
            else System.out.println("Koc");
        } else if (month == 4) {
            if (day <= 20) System.out.println("Koc");
            else System.out.println("Boga");
        } else if (month == 5) {
            if (day <= 21) System.out.println("Boga");
            else System.out.println("Ikizler");
        } else if (month == 6) {
            if (day <= 22) System.out.println("Ikizler");
            else System.out.println("Yengec");
        } else if (month == 7) {
            if (day <= 22) System.out.println("Yengec");
            else System.out.println("Aslan");
        } else if (month == 8) {
            if (day <= 23) System.out.println("Aslan");
            else System.out.println("Basak");
        } else if (month == 9) {
            if (day <= 22) System.out.println("Basak");
            else System.out.println("Terazi");
        } else if (month == 10) {
            if (day <= 22) System.out.println("Terazi");
            else System.out.println("Akrep");
        } else if (month == 11) {
            if (day <= 21) System.out.println("Akrep");
            else System.out.println("Yay");
        } else if (month == 12) {
            if (day <= 21) System.out.println("Yay");
            else System.out.println("Oglak");
        }
    }
}