public class CreditPaymentService {
    public static double calculate(double loanAmount, double YearInterestRate, int numberOfMonth) {
        Exponentiation xDegree = new Exponentiation();
        double monthInterestRate = (YearInterestRate / 12 / 100) ;
        double a = 1 + monthInterestRate;
        double exp = Exponentiation.xDegree(a, numberOfMonth);
        double coefficientAnnuity = monthInterestRate + (monthInterestRate/(exp - 1));
        return coefficientAnnuity * loanAmount;
    }
}