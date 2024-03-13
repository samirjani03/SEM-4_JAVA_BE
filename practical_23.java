// WRITE A PROGRAM TO FIND FACTORIAL OF THE GIVEN NUMBER

import java.util.Scanner;

public class practical_23 {
    public static void main(String[] args) {
        int i,fact=1;  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value: ");
        int number = sc.nextInt();
        for(i=1;i<=number;i++){    
            fact=fact*i;    
        }    
        System.out.println("Factorial of "+number+" is: "+fact);    
    }
}
