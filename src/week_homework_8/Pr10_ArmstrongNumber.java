package week_homework_8;
import java.util.Scanner;

/**
 *10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class Pr10_ArmstrongNumber {
    //instance method
    public void armstrongNumber() {
        //declaring scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int originalNumber = number;
        int sum = 0;
        int digit;

        while (number > 0) {
            digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }
        if (sum == originalNumber) {
            //print statement when input armstrong number
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            //print statement when input non armstrong number
            System.out.println(originalNumber + " is not an Armstrong number.");
            input.close();//closing scanner
        }
    }

    public static void main(String[] args) {
        //calling instance method
        Pr10_ArmstrongNumber obj = new Pr10_ArmstrongNumber();
        obj.armstrongNumber();
    }
}
