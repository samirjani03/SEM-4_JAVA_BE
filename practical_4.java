// WRITE A PROGRAM TO CALCULATE AREA OF CIRCLE.
import java.util.Scanner;

public class practical_4 {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Value of Radius: ");
   int radius = sc.nextInt();
   double area=.14*radius*radius;
   System.out.printf("Area of  Circle is : %.2f",area); 
    }
}
