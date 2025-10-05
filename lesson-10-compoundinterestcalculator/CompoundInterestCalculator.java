import java.util.Scanner;
public class CompoundInterestCalculator {
    public static void main(String[] args) {

    //compound interest calculator

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the principal amount:");
    double principal = scanner.nextDouble();

    System.out.println("Enter the interest rate (in %):");
    double rate = scanner.nextDouble() / 100;

    System.out.println("Enter the number of times compounded per year:");
    int timesCompounded = scanner.nextInt();

    System.out.println("Enter the number of years:");
    int years = scanner.nextInt();

    //the compound interest formula is:
        //A = P * (1 + r/n)^(n * t)
    double amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

    System.out.println("The amount after " + years + " is: R$ " + amount);
    System.out.printf("The amount after %d years is R$ %.2f", years, amount);

    scanner.close();
    }
}
