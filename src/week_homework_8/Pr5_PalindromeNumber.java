package week_homework_8;
import java.util.Scanner;

/**
 *5. Palindrome Number
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 * Check the tips below for more info about palindromes.
 * Example Input/Output
 * isPalindrome(-1221); → should return true
 * isPalindrome(707); → should return true
 * isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
 * 11212.
 */
public class Pr5_PalindromeNumber {

    //static method with one parameter
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number = -number; // convert to positive number
        }
        int numCopy = number;
        int reverse = 0;
        while (numCopy > 0) {
            int lastDigit = numCopy % 10;
            reverse = reverse * 10 + lastDigit;
            numCopy /= 10;
        }
        return reverse == number;
    } //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        boolean isPal = isPalindrome(number);
        if (isPal) {
            System.out.println(number + " is a palindrome number: " + true);
        } else {
            System.out.println(number + " is not a palindrome number: " + false);
        }
    }

}