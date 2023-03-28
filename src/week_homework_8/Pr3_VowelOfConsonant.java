package week_homework_8;
import java.util.Scanner;

/**
 *3.Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Pr3_VowelOfConsonant {
    //instance method
    public void vowelOfConsonant() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an alphabet: ");
        String input = scanner.nextLine();

        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Invalid input. Please enter a single letter.");
        } else {
            char letter = input.toLowerCase().charAt(0);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
                scanner.close();
            }
        }
        //main method
    }  public static void main (String [] args){
        //calling instance method by creating object
        Pr3_VowelOfConsonant obj = new Pr3_VowelOfConsonant();
        obj.vowelOfConsonant();
    }
}