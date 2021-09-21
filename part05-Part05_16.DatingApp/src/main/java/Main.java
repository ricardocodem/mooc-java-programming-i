
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date = new SimpleDate(29, 12, 2015);
        System.out.println("Friday of the examined week is " +date);
        date.advance();
        System.out.println(date);
        date.advance(5);
        System.out.println(date);
        
    }
}
