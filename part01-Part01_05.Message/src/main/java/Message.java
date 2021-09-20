
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        //Le a string escrita pelo usuario e atribui
        //a variavel message
        String message = scanner.nextLine();
        //imprimi a messagem escrita
        System.out.println(message);
    }
}
