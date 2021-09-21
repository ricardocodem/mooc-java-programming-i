
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();
        
        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            //separa a string input em duas partes (command e amount. Ex: add 5)
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            //tarefa para executar comandos
            if(command.equals("add")){
                firstContainer.add(amount);
            }
            if(command.equals("move")){
                secondContainer.add(Math.min(firstContainer.contains(), amount));
                firstContainer.remove(amount);
            }
            if(command.equals("remove")){
                secondContainer.remove(amount);
            }

        }
    }

}
