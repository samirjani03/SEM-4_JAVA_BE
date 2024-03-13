// WRITE A PROGRAM TO READ MARKS OF FIVE SUBJECT.CALCULATE PERCENTAGE AND PRINT CLASS ACCORDINGLY.BELOW 35, PASS CLASS BETWEEN 35 TO 45, SECOND CLASS BETWEEN TO 60, FIRST 60 TO 70, DISTINCTION IF MORE THAN 70.
import java.util.Scanner;

public class practical_12 {
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

            String result;
            if (percentage < 35) {
                result = "Fail";
            } else if (percentage >= 35 && percentage < 45) {
                result = "Pass Class";
            } else if (percentage >= 45 && percentage < 60) {
                result = "Second Class";
            } else if (percentage >= 60 && percentage < 70) {
                result = "First Class";
            } else {
                result = "Distinction";
            }
            System.out.println("Class: "+result);
        }
    }
}
