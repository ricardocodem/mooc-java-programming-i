
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        Statistics statistics = new Statistics();
        Statistics sumOfEven = new Statistics();
        Statistics sumOfOdd = new Statistics();
        System.out.println("Enter numbers:");
        while (true) {
            int inputNumber = Integer.valueOf(scanner.nextLine());
            if (inputNumber == -1) {
                break;
            }
            statistics.addNumber(inputNumber);
            if (inputNumber % 2 == 0) {
                sumOfEven.addNumber(inputNumber);
            } else {
                sumOfOdd.addNumber(inputNumber);
            }

        }

        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + sumOfEven.sum());
        System.out.println("Sum of odd numbers: " + sumOfOdd.sum());

    }
}
