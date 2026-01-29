import java.util.*;

public class FinancialApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter in the investment amount: ");
        double initialInvestment = sc.nextDouble();
        System.out.print("Enter in the Annual interest rate: ");
        double annualInterestRate = sc.nextDouble();
        System.out.print("Enter the number of years you'd like to have the investment: ");
        int numberOfYears = sc.nextInt();
        System.out.println("Years \tFuture Value");
        for(int i = 1; i <= numberOfYears; i++){
            double investmentIncrease = futureValue(initialInvestment, annualInterestRate, i);
            System.out.printf("%d\t%.2f", i, investmentIncrease);
            System.out.println();

        }
    }

    public static double futureValue(double investment, double annualInterest, int numberOfYears){
        double yearlyIncrease = investment * (Math.pow(1 + annualInterest / 1200, numberOfYears * 12));
        return yearlyIncrease;
    }
}
