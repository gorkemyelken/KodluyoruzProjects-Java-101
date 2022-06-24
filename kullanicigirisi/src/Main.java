import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, passWord,sifirlendirme, newPassword ;
        Scanner input= new Scanner(System.in);
        System.out.print("Kullanici adinizi yaziniz : ");
        userName=input.nextLine( );
        System.out.print("Sifrenizi yaziniz : ");
        passWord=input.nextLine();

        if (userName.equals("patika") && passWord.equals("java") ){
            System.out.println("Giris yaptiniz.");
        }
        else{
            System.out.println("Hatali sifre girdiniz yeni sifre belirtmek isterseniz \"yes\"  istemezseniz \" no\"  secin.");
            sifirlendirme=input.nextLine();

            if( sifirlendirme.equals("no")){
                System.out.println("Giris sonlandirildi.");}
            else if (sifirlendirme.equals("yes")) {
                System.out.println("Yeni sifrenizi yazin : ");
                newPassword=input.nextLine();
                if( newPassword.equals("java")|| newPassword.equals(passWord)){
                    System.out.println("Hatali giris tekrar dene.");
                }
                else{
                    System.out.println("Sifrenizi basariyla yenilendi.");
                }
            }
            else{
                System.out.println("Hatali secim sectiniz.");
            }
        }
    }
}