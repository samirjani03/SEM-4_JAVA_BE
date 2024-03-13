// WRITE A PROGRAM THAT PROMPTS THE USER TO ENTER A WEIGHT IN POUNDS AND HEIGHT IN INCHES, DISPLAY THE BMI.
import java.util.Scanner;

public class practical_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double weightPounds = scanner.nextDouble();

        System.out.print("Enter your height in inches: ");
        double heightInches = scanner.nextDouble();
        // Convert weight from pounds to kilograms (1 pound = 0.45359237 kilograms)
        double weightKilograms = weightPounds * 0.45359237;

        // Convert height from inches to meters (1 inch = 0.0254 meters)
        double heightMeters = heightInches * 0.0254;

        // Calculate BMI using the formula: BMI = weight (kg) / (height (m) * height
        // (m))
        double bmi = weightKilograms / (heightMeters * heightMeters);

        System.out.println("Your BMI is: " + bmi);
    }
}
