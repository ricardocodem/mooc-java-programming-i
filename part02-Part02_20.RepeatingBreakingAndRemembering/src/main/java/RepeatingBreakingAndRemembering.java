
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        
        // ask for input 
        System.out.println("Give numbers:");

        //declarations
        int sum = 0;
        int track = 0;
        float avg = 0;
        int even = 0;
        int odd = 0;

        //loop
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            //verify if negative break the loop
            if (input < 0) {
                System.out.println("Thx! Bye!");
                break;
            }
            //verify the amount of even or odd numbers
            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            //sum of inputted numbers
            sum += input;
            //keeps track of the amount of inputted numbers
            track++;
            //do the average of numbers
            avg = (float) sum / track;
            //even or odd
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + track);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
