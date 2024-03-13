// WRITE A PROGRAM TO THAT READS A NUMBER IN METER, CONVERT IT INTO FEET, AND DISPLAYS THE RESULT.
import java.util.Scanner;

public class practical_6 {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Marks for Maths:");
            short maths = sc.nextShort();
            System.out.println("Enter Marks for physics:");
            short physics = sc.nextShort();
            System.out.println("Enter Marks for chemistry:");
            short chemistry = sc.nextShort();
            System.out.println("Enter Marks for english:");
            short english = sc.nextShort();
            System.out.println("Enter Marks for comuter:");
            short computer = sc.nextShort();

            float percentage = (maths + physics + chemistry + english + computer) / 5;
            System.out.println("Percentage:" + percentage);

        }
   

    }
}
