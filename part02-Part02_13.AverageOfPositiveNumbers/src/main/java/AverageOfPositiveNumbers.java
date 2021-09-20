
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //track the amount of input numbers
        int track = 0;
        //task to sum the total value of inputted numbers
        int total = 0;
        //calculate the average
        float avg = 0;
        //main loop
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            if (number > 0) {
                track += 1;
                total += number;
            }
        }
        if (total <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            avg = (float) total / track;
            System.out.println(avg);
        }
    }
}
