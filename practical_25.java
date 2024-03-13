// WRITE A PROGRAM TO ACCEPT A NUMBER AND CHECK WETHER THE NUMBER IS PRIME OR NOT.USE METHOD NAME check(int n).THE METHOD RETURNS 1,IF THE NUMBER IS PRIME OTHERWISE,IT RETURNS 0

import java.util.Scanner;

public class practical_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value: ");
        int number = sc.nextInt();
        int result = check(number);
        if (result == 1) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

    }

    private static int check(int n) {
        if (n <= 1) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
