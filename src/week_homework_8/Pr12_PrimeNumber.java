package week_homework_8;
import java.util.Scanner;

/**
 *12. Write a programme to input any number and check if it is prime or not.
 *(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 *prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 *17.... are the prime numbers.)
 */
public class Pr12_PrimeNumber {
    //instance method
    public void primeNumber() {
        //declaring scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            //print statement when input prime number
            System.out.println(number + " is a prime number.");
        } else {
            //print statement when input number is not prime
            System.out.println(number + " is not a prime number.");
            scanner.close();
        }
    }

    public static void main(String[] args) {
        //calling instance method by creating object
        Pr12_PrimeNumber obj = new Pr12_PrimeNumber();
        obj.primeNumber();
    }
}
