import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayisi: ");
        int sayi = scanner.nextInt();
        System.out.print("Ciktisi: ");
        pozitifler(negatifler(sayi), sayi);
    }

    public static int negatifler(int sayi) {
        if (sayi <= 0){
            return sayi;
        } else {
            System.out.print(sayi + " ");
            return negatifler(sayi - 5);
        }
    }

    public static int pozitifler(int negatif, int sayi) {
        if (negatif > sayi){
            return negatif;
        } else {
            System.out.print(negatif + " ");
            return pozitifler(negatif + 5, sayi);
        }
    }

    public static void beser(int sayi) {
        if (sayi < 5) {
            System.out.println("5'ten buyuk bir sayi giriniz.");
        } else {
            System.out.println("N sayisi: " + sayi);
            System.out.print("Ciktisi: ");
            int cikanSayi = 0;
            for (int i = sayi; i > -5; i -= 5) {
                System.out.print(i + " ");
                cikanSayi = i;
            }
            for (int i = cikanSayi + 5; i <= sayi; i += 5) {
                System.out.print(i + " ");
            }
        }
    }
    public static String recur(int sayi) {
        String sonuc = "";
        int cikanSayi;
        if (sayi > -5) {
            cikanSayi = sayi;
            System.out.print(cikanSayi + "/");
            sonuc += sayi + " " + recur(sayi - 5);
        }
        return sonuc;
    }
}