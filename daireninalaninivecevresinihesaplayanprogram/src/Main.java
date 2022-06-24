import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, r ;
        double pi=3.14, alan;

        Scanner inp = new Scanner(System.in);
        System.out.print("Yari cap giriniz = ");
        r = inp.nextInt();

        System.out.print("Merkez acisinin olcusunu giriniz = ");
        a = inp.nextInt();

        alan = (pi * (r*r) * a) / 360;

        System.out.println("Dairenin alani  = " + alan);
    }
}