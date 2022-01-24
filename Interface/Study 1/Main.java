import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Tutar giriniz: ");
        double price=input.nextDouble();
        
        System.out.print("Kart No giriniz: ");
        double cardNumber=input.nextDouble();

        System.out.print("Son kullanım tarihi giriniz: ");
        double expiryDate=input.nextDouble();

        System.out.print("Güvenlik kodu giriniz: ");
        double cvc=input.nextDouble();

        System.out.println("1. A Bankası");
        System.out.println("2. B Bankası");
        System.out.println("3. C Bankası");
        System.out.print("Banka seçiniz: ");
        int selectBank=input.nextInt();

        switch (selectBank){
            case 1:
                ABankasi aPos=new ABankasi("A Bankası", "7898644787684", "12311212");
                aPos.connect("127.1.1.1");
                aPos.payment(price, cardNumber, expiryDate, cvc);
                break;
            case 2:
                BBankasi bPos=new BBankasi("B Bankası", "7898644787684", "12311212");
                bPos.connect("127.1.1.1");
                bPos.payment(price, cardNumber, expiryDate, cvc);
                break;
            default:
                System.out.println("Geçerli banka giriniz !");
        }
    }
}
