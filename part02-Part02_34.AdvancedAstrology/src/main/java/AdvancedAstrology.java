
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int start = 0;
        while (start < number) {
            System.out.print("*");
            start++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i <= (number - 1); i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int tree = 0;
        int space = height;
        while (tree < height) {
            printSpaces(space - 1);
            space--;
            printStars(2 * tree + 1);
            tree++;
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(tree - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
