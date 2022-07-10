import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, toplam = 0;
        int bolenSayi = 0;

        System.out.print("Sayi Giriniz: ");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                bolenSayi++;
                toplam = toplam + i;
            }
        }

        if (bolenSayi != 0) {
            System.out.println("Toplam: " + toplam);
            System.out.println("Ortalama: " + (toplam / (double) bolenSayi));
        } else {
            System.out.println("Hic sayi bulunamamistir.");
        }
    }
}