import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double distance, pricePerKM = 0.10, priceTotal =0, discountRoundTrip, discountedPrice, discountAge=0, price;
        int age, flightType;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Mesafeyi KM olarak giriniz: ");
        distance = keyboard.nextDouble();
        System.out.print("Yasinizi giriniz: ");
        age = keyboard.nextInt();
        System.out.print("1:Tek Yon - 2:Gidis Donus: ");
        flightType  = keyboard.nextInt();

        keyboard.close();

        if((distance >=0 && age >= 0) && (flightType ==1 || flightType == 2)){
            price = distance * pricePerKM;

            if(age < 12){
                discountAge = price * 0.50;
            }else if(age >= 12 && age <= 24){
                discountAge = price * 0.10;
            }else if(age >= 65){
                discountAge = price * 0.30;
            }

            if(flightType == 2){
                discountedPrice = price - discountAge;
                discountRoundTrip = discountedPrice * 0.20;
                priceTotal = (discountedPrice - discountRoundTrip) * 2;
            }else {
                priceTotal = price - discountAge;
            }
            System.out.print("Toplam tutar: " + priceTotal);

        }else{
            System.out.print("Bilgilerinizi tekrar kontrol ediniz.");
        }
    }
}