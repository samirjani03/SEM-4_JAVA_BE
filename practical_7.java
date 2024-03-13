// WRITE A PROGRAM TO THAT READS A NUMBER IN METER, CONVERT IT INTO FEET, AND DISPLAYS THE RESULT.
import java.util.Scanner;

public class practical_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length in meters: ");
        double meters = scanner.nextDouble();

        double feet = meters * 3.28084;

        System.out.println(meters + " meters is equal to " + feet + " feet.");
    }
}

