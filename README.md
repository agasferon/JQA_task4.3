# Задача №3 - "Кредитный Калькулятор"

## Исходный код CreditPaymentService.class
```java
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
```
## Исходный код Exponentiation.class
```java
public class Exponentiation {
    public static double xDegree(double base, double exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
```
## Исходный код Main.class
```java
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
```
Работа написана в следующем окружении:
* Windows 10 1903 18362.778
* openjdk version "11.0.7" 2020-04-14
* OpenJDK Runtime Environment AdoptOpenJDK (build 11.0.7+10)
* OpenJDK 64-Bit Server VM AdoptOpenJDK (build 11.0.7+10, mixed mode)