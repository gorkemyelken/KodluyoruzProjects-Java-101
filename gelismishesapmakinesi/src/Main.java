import java.util.Scanner;

public class Main {
    static  void toplama() {
        Scanner sc = new Scanner(System.in);
        int sayi, sonuc = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayi (cikmak icin '0' seciniz) :");
            sayi = sc.nextInt();
            if (sayi == 0) {
                break;
            }
            sonuc += sayi;
        }
        System.out.println("Sonuc : " + sonuc);
    }

    static void cikarma() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz: ");
        int sayac = sc.nextInt();
        int sayi, sonuc = 0;

        for (int i = 1; i <= sayac; i++) {
            System.out.print(i + ". sayi :");
            sayi = sc.nextInt();
            if (i == 1) {
                sonuc += sayi;
                continue;
            }
            sonuc -= sayi;
        }

        System.out.println("Sonuc : " + sonuc);
    }

    static void times() {
        Scanner sc = new Scanner(System.in);
        int sayi, sonuc = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayi : (cikmak icin '1' seciniz) ");
            sayi = sc.nextInt();

            if (sayi == 1)
                break;

            if (sayi == 0) {
                sonuc = 0;
                break;
            }
            sonuc *= sayi;
        }

        System.out.println("Sonuc : " + sonuc);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz: ");
        int sayac = scan.nextInt();
        double sayi, sonuc = 0.0;

        for (int i = 1; i <= sayac; i++) {
            System.out.print(i + ". sayi :");
            sayi = scan.nextDouble();
            if (i != 1 && sayi == 0) {
                System.out.println("Boleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                sonuc = sayi;
                continue;
            }
            sonuc /= sayi;
        }

        System.out.println("Sonuc : " + sonuc);
    }

    static void power() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Taban degeri giriniz: ");
        int taban = sc.nextInt();
        System.out.print("Us degeri giriniz: ");
        int us = sc.nextInt();
        int sonuc = 1;

        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }

        System.out.println("Sonuc : " + sonuc);
    }

    static void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi = sc.nextInt();
        int sonuc = 1;

        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }

        System.out.println("Sonuc: " + sonuc);
    }

    static void mod() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Modu alinacak sayiyi giriniz: ");
        int moduAlinan = sc.nextInt();
        System.out.print("Mod sayisini giriniz: ");
        int modSayisi = sc.nextInt();
        int sonuc = moduAlinan%modSayisi;
        System.out.println("Sonuc: " + sonuc);
    }
    static void dikdortgenAlanCevre() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci kenar uzunlugunu giriniz: ");
        int kenar1 = sc.nextInt();
        System.out.print("Ikinci kenar uzunlugunu giriniz: ");
        int kenar2 = sc.nextInt();
        int alan, cevre;
        cevre=2*(kenar1+kenar2);
        alan=kenar1*kenar2;
        System.out.println("Dikdortgenin cevresi: " + cevre);
        System.out.println("Dikdortgenin alani: " + alan);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama islemi\n"
                + "2- Cikarma islemi\n"
                + "3- Carpma islemi\n"
                + "4- Bolme islemi\n"
                + "5- Uslu Sayi Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdortgen Alan ve Cevre Hesabi\n"
                + "0- Cikis Yap";

        do {
            System.out.println(menu);
            System.out.print("Lutfen bir islem seciniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    toplama();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    dikdortgenAlanCevre();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}