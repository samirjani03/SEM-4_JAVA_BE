
// WRITE A PROGRAM TO PRINT ADDITION OF 2 NUMBER (WITH SCANNER)
import java.util.Scanner;

public class practical_3 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of Number 1:");
            int num1 = sc.nextInt();
            System.out.println("Enter the value of Number 2:");
            int num2 = sc.nextInt();
            int ans = num1 + num2;
            System.out.println(num1 + " + " + num2 + " : " + ans);
        }

    }
}
