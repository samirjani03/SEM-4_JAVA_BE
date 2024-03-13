// WRITE A PROGRAM TO FIND MAXIMUM NUMBER FROM GIVEN TWO NUMBRES USING METHOD

import java.util.Scanner;

public class practical_22 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Value of Number 1: ");
int num1 = sc.nextInt();
System.out.println("Enter Value of Number 2: ");
int num2 = sc.nextInt();
        int max=findMax(num1,num2);
        System.out.println("Maximum Number: "+max);



}

    private static int findMax(int num1, int num2) {
       return (num1>num2)?num1:num2;
    }

}