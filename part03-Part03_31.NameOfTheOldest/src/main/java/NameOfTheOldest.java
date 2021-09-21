
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        int auxiliar = 0;
        String name = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            auxiliar = Integer.valueOf(parts[1]);

            if (oldest < auxiliar) {
                oldest = auxiliar;
                name = parts[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
