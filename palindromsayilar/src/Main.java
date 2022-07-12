import java.util.Scanner;

public class Main {
    static String isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber) {
            return "Palindrom sayidir.";
        } else {
            return "Palindrom sayi degildir.";
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi girin: ");
        int n = inp.nextInt();
        System.out.println(isPalindrom(n));
    }
}