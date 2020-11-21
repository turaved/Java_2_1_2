public class Main {
    public static void main(String[] args) {
        int CustomerAccount = 100;
        int PaymentValue = 1500;
        int Bonus = 0;
        if (PaymentValue > 1000){
            Bonus = PaymentValue/100;
        }
        System.out.print("Total Bonus = ");System.out.println(Bonus);
        System.out.print("Total Customer Account = "); System.out.println(CustomerAccount + PaymentValue + Bonus);
    }
}
