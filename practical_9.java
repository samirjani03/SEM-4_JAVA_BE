// WRITE A PROGRAM TO CHECK WHETHER THE GIVEN NUMBER IS POSITIVE OR NEGATIVE.
import java.util.Scanner;

public class practical_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is Negative");
        }
    }
}
