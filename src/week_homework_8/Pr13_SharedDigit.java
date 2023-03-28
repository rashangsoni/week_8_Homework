package week_homework_8;
import java.util.Scanner;
/**
 *13.Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */
public class Pr13_SharedDigit {

    //static method with two params
    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false; // numbers not within the range
        }
        // check if the digits of num1 and num2 intersect
        while (num1 > 0) {
            int digit1 = num1 % 10;
            int tempNum2 = num2;
            while (tempNum2 > 0) {
                int digit2 = tempNum2 % 10;
                if (digit1 == digit2) {
                    return true;
                }
                tempNum2 /= 10;
            }
            num1 /= 10;
        }
        return false; // no shared digit

    }
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        boolean result = hasSharedDigit(num1, num2);
        System.out.println("Result: " + result);
        scanner.close();
    }
}