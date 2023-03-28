package week_homework_8;
import java.util.Scanner;

/**
 *9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Pr9_FibonacciNumber {
    //instance method
    public void fibonacciNumber() {
        //declaring scanner
        Scanner scanner = new Scanner(System.in);
        //printing number of terms to get the numbers in sequence
        System.out.print("Enter the number of terms to print the sequence: ");
        int n = scanner.nextInt();

        int a = 1, b = 1;

        System.out.print(a + " " + b + " ");

        int i = 2;
        while (i < n) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            i++;
            scanner.close();//closing scanner
        }
    }
    //main method
    public static void main(String[] args) {
        //calling instance method by creating object
        Pr9_FibonacciNumber obj = new Pr9_FibonacciNumber();
        obj.fibonacciNumber();
    }
}
