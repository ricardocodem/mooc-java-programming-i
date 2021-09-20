
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //track the amount of input numbers
        int track = 0;
        //task to sum the total value of inputted numbers
        int total = 0;
        //main loop
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            track += 1;
            total += number;
        }
        System.out.println("Number of numbers: " + track);
        System.out.println("Sum of the numbers: " + total);
    }
}
