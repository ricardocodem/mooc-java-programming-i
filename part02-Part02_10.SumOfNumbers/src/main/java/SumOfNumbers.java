
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        //task is to read an input from the user
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            //task to exit the loop if the user has inputted o 
            if (number == 0) {
                break;
            }
            total += number;
        }
        System.out.println("Sum of the numbers: " + total);
    }
}
