
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister();

        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            if (input > 0 && input <= 100) {
                register.addGradeBasedOnPoints(input);
            }
        }
        System.out.println("Point average (all): " + register.averageOfPoints());
        if (register.passingPointAverage() > 0) {
            System.out.println("Point average (passing): " + register.passingPointAverage());
        }else{
            System.out.println("Point average (passing): -");
        }
        System.out.println("Pass percentage: "+register.passPercentage());
        System.out.println("Grade distribution: ");
        register.printGradeDistribution();
    }
}
