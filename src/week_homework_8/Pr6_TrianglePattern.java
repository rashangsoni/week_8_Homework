package week_homework_8;
import java.util.Scanner;

/**
 *6. Write a program in Java to display the pattern like a triangle with a number.
 *  For eg.
 *  Input number of rows: 10
 *  Expected Output:
 *  1
 *  12
 *  123
 *  1234
 *  12345
 *  123456
 *  1234567
 *  12345678
 *  123456789
 *  12345678910
 */
public class Pr6_TrianglePattern {
    //instance method
    public void trianglePattern(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = input.nextInt();

        // Loop through each row
        for (int i = 1; i <= numRows; i++) {
            // Loop through each number to print
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

            input.close();
        }
    }

    public static void main(String[] args) {
        //calling instance method by creating object
        Pr6_TrianglePattern obj = new Pr6_TrianglePattern();
        obj.trianglePattern();
    }
}