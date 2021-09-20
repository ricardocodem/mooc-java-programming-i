
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//keep tracks of negative numbers
        int track = 0;
        //task is to read an input from the user
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            //task to exit the loop if the user has inputted o 
            if (number == 0) {
                break;
            }
            //task to increase the amount of negative number inputted
            if (number < 0) {
                track += 1;
            }
        }
        System.out.println("Number of negative numbers: " + track);
    }
}
