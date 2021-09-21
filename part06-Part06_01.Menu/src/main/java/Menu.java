
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal) {
        boolean check = meals.contains(meal);
        if (!check) {
            this.meals.add(meal);
        }
      
    }

    public void printMeals() {
        for (String menu : meals) {
            System.out.println(menu);
        }
    }

    public void clearMenu() {
        this.meals.clear();
    }
}
