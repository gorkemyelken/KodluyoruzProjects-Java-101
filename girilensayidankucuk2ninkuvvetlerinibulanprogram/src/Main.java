import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz: ");
        int sayi=sc.nextInt();

        System.out.println( sayi+ " sayisindan kucuk 4un kuvvetleri: ");
        for (int i=1; i<=sayi; i*=4){
            System.out.print(i + "   ");
        }
        System.out.println("\n");
        System.out.println( sayi+ " sayisindan kucuk 5in kuvvetleri: ");
        for (int i=1; i<=sayi; i*=5){
            System.out.print(i + "   ");
        }

    }
}