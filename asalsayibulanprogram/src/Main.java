import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi=input.nextInt();
        asal(sayi,2);
    }
    static void asal(int sayi,int i){
        if (i == sayi) {
            System.out.print(sayi + " asal sayidir.");
            return;
        } else if (sayi%i == 0) {
            System.out.print(sayi + " asal sayi degildir.");
            return;
        }

        asal(sayi, i + 1);

    }
}
