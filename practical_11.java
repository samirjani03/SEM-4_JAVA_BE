// WRITE A PROGRAM TO FIND LARGEST NUMBER FROM GIVEN THREE NUMBERS WITHOUT USING LOGICAL OPERATORS.

import java.util.Scanner;

public class practical_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter Number 3: ");
        int num3 = sc.nextInt();
        sc.close();
        int max = findlargestnum(num1, num2, num3);
        System.out.println("Largest Number is: " + max);
    }

    private static int findlargestnum(int num1, int num2, int num3) {
        int max = num1;
        if ((num2 - max) > 0) {
            max = num2;
        }
        if ((num3 - max) > 0) {
            max = num3;
        }
        return max;
    }
}
