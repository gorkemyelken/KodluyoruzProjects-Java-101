import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float km, total = 10;
        Scanner inp = new Scanner(System.in);

        System.out.print("Gidilen km = ");
        km = inp.nextFloat();
        total = ((total + (km * 2.20)) < 20) ? 20 : (float) (total + (km * 2.20));

        System.out.println("Total ucret =>" + total);
    }
}