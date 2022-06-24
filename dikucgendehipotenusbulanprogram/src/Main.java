import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        double alan,cevre,u,alaninkaresi;
        Scanner input=new Scanner(System.in);

        System.out.print("Birinci Kenar uzunlugu: ");
        a=input.nextInt();
        System.out.print("ikinci Kenar uzunlugu: ");
        b=input.nextInt();
        System.out.print("Ucuncu Kenar uzunlugu: ");
        c=input.nextInt();

        cevre=(a+b+c);
        u=(cevre/2);
        alaninkaresi= u*(u-a)*(u-b)*(u-c);
        alan=Math.sqrt(alaninkaresi);
        System.out.println("Ucgenin cevresi:"+cevre);
        System.out.println("Ucgenin alani:"+alan);
    }
}