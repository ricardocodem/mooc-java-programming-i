
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Birds> bird = new ArrayList<>();

        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();
            //user input
            if (command.equalsIgnoreCase("Quit")) {
                break;
            }
            if (command.equalsIgnoreCase("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String nameLatin = scan.nextLine();
                bird.add(new Birds(name, nameLatin));
            }
            if (command.equalsIgnoreCase("Observation")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                for (Birds birds : bird) {
                    if (birds.getName().equals(name)) {
                        birds.increaseObservation();
                    } else {
                        System.out.println("Not a bird!");
                    }
                }
            }
            if (command.equalsIgnoreCase("All")) {
                for (Birds birds : bird) {
                    System.out.println(birds);
                }
            }
            if (command.equalsIgnoreCase("One")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                for (Birds birds : bird) {
                    if (birds.getName().equals(name)) {
                        System.out.println(birds);
                    }
                }

            }

        }
    }
}
