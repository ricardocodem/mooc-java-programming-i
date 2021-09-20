
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ask for input first number
        System.out.println("First number");
        int first = Integer.valueOf(scanner.nextLine());
        //ask for input last number
        System.out.println("Last number?");
        int num = Integer.valueOf(scanner.nextLine());
        //do the math
        int sum = 0;
        //loop to make calculations
        for (int i = first; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
