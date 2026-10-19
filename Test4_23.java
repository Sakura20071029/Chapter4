import java.util.Scanner;
public class Test4_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = input.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        double hour = input.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalRate = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateRate = input.nextDouble();

        double grossPay = hour * payRate;
        double federalPay = grossPay * federalRate;
        double federal = federalRate * 100;
        double state = stateRate * 100;
        double statePay = grossPay * stateRate;

        System.out.print("\nEmployee Name: " + name);
        System.out.print("\nHours Worked: " + hour);
        System.out.printf("\nPay rate: $%.2f", payRate);
        System.out.printf("\nGross Pay: $%.2f", grossPay );
        System.out.printf("\nDeductions:\n");
        System.out.printf("   Federal Withholding (%.1f%%): $%.2f\n", federal, federalPay);
        System.out.printf("   State Withholding (%.1f%%): $%.2f\n", state,statePay);
        System.out.printf("   Total Deduction: %.2f\n", (federalPay + statePay));
        System.out.printf("   Net Pay: %.2f", (grossPay - federalPay -statePay) );

    }
}
