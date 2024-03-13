// WRITE A PROGRAM TO PRINT GIVEN NUMBER IN REVERSE ORDER.
import java.util.Scanner;

public class practical_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Number in reverse order: ");
        printReverseNumber(number);

        scanner.close();
    }

    private static void printReverseNumber(int number) {
        while (number != 0) {
            int digit = number % 10;
            System.out.print(digit);
            number /= 10;
        }
        System.out.println();
    }
}
