
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> bookInfo = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            bookInfo.add(new Book(title, pages, year));
        }
        System.out.println("");
        System.out.print("What information will be printed? ");
        String printInformation = scanner.nextLine();

        for (Book info : bookInfo) {
            if (printInformation.equals("everything")) {
                System.out.println(info);
            }
            if (printInformation.equals("name")) {
                System.out.println(info.getTitle());
            }
        }
    }
}
