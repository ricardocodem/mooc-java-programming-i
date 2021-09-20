
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //keep tracks of input numbers
        int track = 0;
        //task is to read an input from the user
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            //task to exit the loop if the user has inputted o 
            if (number == 0) {
                break;
            } else {
                //task to increase the amount of number inputted
                track += 1;
            }
        }
        System.out.println("Number of numbers: " + track);
    }
}
