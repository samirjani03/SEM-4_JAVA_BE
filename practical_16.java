// WRITE A PROGRAM TO INPUT NUMBER OF
// CALLS AND CALCULATE MONTHLY
// TELEPHONE BILLS AS PER THE FOLLOWING
// RULE:
// MINIMUM RS. 200 FOR UP TO 100 CALLS
// PLUS RS. 0.60 PER CALL FOR NEXT 50 CALL
// PLUS RS. 0.50 PER CALL FOR NEXT 50 CALL
// PLUS RS. 0.40 PER CALL FOR NEXT 50 CALL
// ANY CALL BEYOND 200 CALLS
import java.util.Scanner;

public class practical_16 {
    private static double calculateBill(int numberOfCalls) {
        double bill = 0;
        // Minimum bill for up to 100 calls
        if (numberOfCalls <= 100) {
            bill = 200;
        } else {
            bill = 200; // Minimum bill for up to 100 calls
            numberOfCalls -= 100; // Remaining calls after 100

            // Calculate bill for next 50 calls at Rs. 0.60 per call
            if (numberOfCalls <= 50) {
                bill += numberOfCalls * 0.60;
                return bill;
            } else {
                bill += 50 * 0.60;
                numberOfCalls -= 50;
            }

            // Calculate bill for next 50 calls at Rs. 0.50 per call
            if (numberOfCalls <= 50) {
                bill += numberOfCalls * 0.50;
                return bill;
            } else {
                bill += 50 * 0.50;
                numberOfCalls -= 50;
            }

            // Calculate bill for remaining calls at Rs. 0.40 per call
            bill += numberOfCalls * 0.40;
        }
        return bill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Calls: ");
        int numberOfCalls = sc.nextInt();
        double totalBill = calculateBill(numberOfCalls);
        System.out.println("Monthly telephone bill: Rs. " + totalBill);

    }
}
