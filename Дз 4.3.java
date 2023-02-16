import java.util.Scanner;

public class Credit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть загальну суму кредиту: ");
        double loanAmount = input.nextDouble();

        System.out.print("Введіть місячний відсоток на залишок по кредиту (у відсотках): ");
        double monthlyInterestRate = input.nextDouble() / 100;

        System.out.print("Виберіть режим розрахунку: \n1 - Розрахувати кількість щомісячних платежів\n2 - Розрахувати суму щомісячного платежу\n");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Введіть суму щомісячного внеску: ");
            double monthlyPayment = input.nextDouble();
            int numPayments = calculateNumPayments(loanAmount, monthlyPayment, monthlyInterestRate);
            System.out.printf("Кількість щомісячних платежів: %d\n", numPayments);
        } else if (choice == 2) {
            System.out.print("Введіть кількість платежів: ");
            int numPayments = input.nextInt();
            double monthlyPayment = calculateMonthlyPayment(loanAmount, numPayments, monthlyInterestRate);
            System.out.printf("Сума щомісячного платежу: %.2f\n", monthlyPayment);
        } else {
            System.out.println("Невірний режим розрахунку");
        }
    }

    public static int calculateNumPayments(double loanAmount, double monthlyPayment, double monthlyInterestRate) {
        int numPayments = 0;
        while (loanAmount > 0) {
            loanAmount = loanAmount * (1 + monthlyInterestRate) - monthlyPayment;
            numPayments++;
        }
        return numPayments;
    }

    public static double calculateMonthlyPayment(double loanAmount, int numPayments, double monthlyInterestRate) {
        double monthlyPayment = (monthlyInterestRate * loanAmount * Math.pow(1 + monthlyInterestRate, numPayments)) / (Math.pow(1 + monthlyInterestRate, numPayments) - 1);
        return monthlyPayment;
    }
}














