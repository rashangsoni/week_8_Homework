package week_homework_8;

import java.util.Scanner;

/**
 *8. Display right angle triangle of @ using nested for loops
 *  @
 *  @@
 *  @@@
 *  @@@@
 *  @@@@@
 */
public class Pr8_RightAngleTriangle {
    //instance method
    public void rightAngleTriangle(){

        //declaring scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        //using nested for loop
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
            scanner.close();
        }
    }
    public static void main(String[] args) {//main method
        //calling instance method by creating object
        Pr8_RightAngleTriangle obj = new Pr8_RightAngleTriangle();
        obj.rightAngleTriangle();
    }
}