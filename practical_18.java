// WRITE A PROGRAM TO PRINT THE SUM OF THE SERIES 1+1/2+1/3+1/4+...1/N

import java.util.Scanner;

public class practical_18 {
     // Method to calculate the sum of the series
     private static double calculateSeriesSum(int a) {
        double sum = 0;

        // Iterate over each term of the series and add it to the sum
        for (int i = 1; i <= a; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value: ");
        int a = sc.nextInt();
        double sum = calculateSeriesSum(a);
        
        System.out.println("Sum of the series: " + sum);

    }
}
