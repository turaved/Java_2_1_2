public class Main {
    public static void main(String[] args) {
        int customeraccount = 100;
        int paymentvalue = 1500;
        int bonus = 0;
        if (paymentvalue > 1000){
            bonus = paymentvalue/100;
        }
        System.out.print("Total Bonus = ");System.out.println(bonus);
        System.out.print("Total Customer Account = "); System.out.println(customeraccount + paymentvalue + bonus);
    }
}
