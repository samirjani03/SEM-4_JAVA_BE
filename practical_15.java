// WRITE A PROGRAM TO CHECK WHETHER TRIANGLE IS ISOSCELES, EQUILATERAL,SCALENE OR RIGHT ANGLED TRIANGLE.
import java.util.Scanner;

public class practical_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the lengths of the three sides of the triangle
        System.out.println("Enter the lengths of the three sides of the triangle:");
        System.out.print("Side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Side 3: ");
        double side3 = scanner.nextDouble();

        // Check if the triangle is equilateral
        if (side1 == side2 && side2 == side3) {
            System.out.println("It is an equilateral triangle.");
            return;
        }

        // Check if the triangle is isosceles
        if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("It is an isosceles triangle.");
            return;
        }

        // Check if the triangle is right-angled
        if (isRightAngled(side1, side2, side3)) {
            System.out.println("It is a right-angled triangle.");
            return;
        }

        // If none of the above conditions are met, the triangle is scalene
        System.out.println("It is a scalene triangle.");

        scanner.close();
    }

    // Method to check if the triangle is right-angled
    private static boolean isRightAngled(double side1, double side2, double side3) {
        // Find the square of each side
        double side1Square = side1 * side1;
        double side2Square = side2 * side2;
        double side3Square = side3 * side3;

        // Check if the triangle satisfies the Pythagorean theorem
        return (side1Square + side2Square == side3Square) || (side1Square + side3Square == side2Square)
                || (side2Square + side3Square == side1Square);
    }
}
