// WRITE A PROGRAM TO MAKE SIMPLE CALCULATOR USING SWITCH CASE.
import java.util.Scanner;

public class practical_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second Number: ");
        double num2 = sc.nextDouble();
        System.out.println("Choose an Operation");
        System.out.println("1. Addition(+)");
        System.out.println("2. Substraction(-)");
        System.out.println("3. Multiplication(*)");
        System.out.println("4. Division(/)");
        System.out.println("Enter Your Choice:");
        int choice = sc.nextInt();

        double result = 0;
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;

            case 2:
                result = num1 - num2;
                break;

            case 3:
                result = num1 * num2;
                break;

            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error...!Can\'t divide by 0");
                    return;
                }
                break;

            default:
                if (1 > 0) {
                    System.out.println("Invalid Choice!!!!");
                    return;
                }
                break;
        }
        System.out.println("Result: " + result);
    }
}
