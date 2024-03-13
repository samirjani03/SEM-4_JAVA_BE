
//WRITE A PROGRAM TO CALCULATE THE SUM OF ALL POSITIVE EVEN NUMBERS AND THE SUM OF ALL NEGATIVE NUMBERS FROM A SET OF NUMBERS. YOU CAN ENTER 0(ZERO) TO QUIT THE PROGRAM AND THE DISPLAY THE RESULT.
import java.util.Scanner;

public class practical_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[100];
        int positiveEvenSum = 0;
        int negativeSum = 0;
        int count = 0;

        System.out.println("Enter numbers (enter 0 to quit):");
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }

            numbers[count++] = num;
        }

        for (int i = 0; i < count; i++) {
            if (numbers[i] > 0 && numbers[i] % 2 == 0) {
                positiveEvenSum += numbers[i];
            } else if (numbers[i] < 0) {
                negativeSum += numbers[i];
            }
        }

        if (count > 0) {
            System.out.println("Sum of positive even numbers: " + positiveEvenSum);
            System.out.println("Sum of negative numbers: " + negativeSum);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close();
    }
}
