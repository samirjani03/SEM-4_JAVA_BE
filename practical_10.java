// WRITE A PROGRAM TO CHECK THE LETTER IS VOWEL OR CONSTANTS.
import java.util.Scanner;

public class practical_10 {
    private static boolean isVowel(char letter) {
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value: ");
        char letter = sc.next().toLowerCase().charAt(0);
        if (!Character.isLetter(letter)) {
            System.out.println("Invalid Input!!!!!");
        } else {
            if (isVowel(letter)) {
System.out.println(letter+" is Vowel");
            }
            else{
                System.out.println(letter +" is Not Vowel");
            }
        }
    }
}
