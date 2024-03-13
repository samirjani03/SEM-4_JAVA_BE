// WRITE A PROGRAM TO FIND OUT
// LARGEST NUMBER FROM GIVEN THREE
// NUMBERS USING CONDITIONAL
// OPERATOR.
import java.util.Scanner;

public class practical_13 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Value of Number 1: ");
int num1 = sc.nextInt();
System.out.println("Enter Value of Number 2: ");
int num2 = sc.nextInt();
System.out.println("Enter Value of Number 3: ");
int num3 = sc.nextInt();
int max = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
System.out.println("Largest Number is: "+max);

    }
}
