import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=1000,toplam=0,q=3;
        System.out.print("Kullanici adi giriniz: ");
        String t=scanner.nextLine();
        System.out.print("Sifre giriniz: ");
        String k=scanner.nextLine();

        if(t.equals("gorkem") && k.equals("12345")) {
            System.out.print("Türkiye bankasina hosgeldiniz.\nYapmak istediginiz islem seciniz\n");
            System.out.println("Para yatirma icin 1, " +
                    "\nPara cekmek icin 2,\nBakiye sorgulama icin 3,\nCikis icin 4 basiniz.");

            int a =scanner.nextInt();
            switch (a){
                case 1:
                    System.out.println("Para miktari: ");
                    int b=scanner.nextInt();
                    i+=b;
                    System.out.print("Bakiyeniz "+i);break;
                case 2:
                    System.out.println("Cekmek istediginiz tutar: ");
                    int h=scanner.nextInt();
                    if(h>i){
                        System.out.println("Yetersiz bakiye");
                        break;}
                    else {
                        i -= h;
                        System.out.println("Bakiyeniz: " + i);
                    }break;

                case 3:
                    System.out.println("Mevcut Bakiyeniz: "+i);break;
                case 4:
                    System.out.println("Iyi gunler. Yine bekleriz...");break;
            }

        }
        else {
            q--;
            System.out.println("Hatali kullanici adi veya sifre girdiniz tekrar deneyiniz.");
            if(q==0)
                System.out.println("Hesabiniz bloke oldu. Bankayla iletisime geciniz.");
        }
    }
}