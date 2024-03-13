// WRITE A PROGRAM TO CONVERT TEMPERATURE FROM FAHRENHEIT TO CELSIUS.
import java.util.Scanner;

public class practical_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("The temperature " + fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");
    }
}
