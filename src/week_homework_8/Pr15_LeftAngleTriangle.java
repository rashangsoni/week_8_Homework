package week_homework_8;
import java.util.Scanner;

/**
 *15.Display left angle triangle of * using nested for loops
 *           *
 *         * *
 *       * * *
 *     * * * *
 *   * * * * *
 */
public class Pr15_LeftAngleTriangle {
    public static void main(String[] args) {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number :");
        int size = scanner.nextInt();
        Pr15_LeftAngleTriangle pr15_leftAngleTriangle = new Pr15_LeftAngleTriangle();
        pr15_leftAngleTriangle.leftTriangle(size);

        //closing the scanner object
        scanner.close();
    }
    public void leftTriangle(int size){
        //nested for loop
        for(int i =1; i<=size; i++)
        {
            for (int j = 1; j <= size -  i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}