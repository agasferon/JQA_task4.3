public class Main {
    public static void main(String[] args) {
        CreditPaymentService calculate = new CreditPaymentService();

        double monthPaymentA = CreditPaymentService.calculate(1_000_000, 9.99, 12);
        System.out.println("Month payment (1 year) " + (int)monthPaymentA);

        double monthPaymentB = CreditPaymentService.calculate(1_000_000, 9.99, 24);
        System.out.println("Month payment (2 years) " + (int)monthPaymentB);

        double monthPaymentC = CreditPaymentService.calculate(1_000_000, 9.99, 36);
        System.out.println("Month payment (3 years) " + (int)monthPaymentC);
    }
}