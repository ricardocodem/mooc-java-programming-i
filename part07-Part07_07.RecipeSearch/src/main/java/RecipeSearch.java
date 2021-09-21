
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //get file name
        System.out.print("File to read: ");
        String file = scanner.nextLine();

        ArrayList<Recipe> recipes = readRecipesFromFile(file);
        //print the commands ui
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - search recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        //start the command loop ui
        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("stop")) {
                break;
            }
            if (command.equalsIgnoreCase("list")) {
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            }
            if (command.equalsIgnoreCase("find name")) {
                System.out.print("Searched word: ");
                String name = scanner.nextLine();
                for (Recipe recipe : recipes) {
                    if (recipe.getName().contains(name)) {
                        System.out.println(recipe);
                    }
                }
            }
            if (command.equalsIgnoreCase("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());
                for (Recipe recipe : recipes) {
                    if (recipe.getCookingTime() <= maxTime) {
                        System.out.println(recipe);
                    }
                }
            }
            if (command.equalsIgnoreCase("find ingredient")) {
                System.out.print("Ingredient: ");
                String findIngredient = scanner.nextLine();
                for (Recipe recipe : recipes) {
                    for (String ingredient : recipe.getIngredients()) {
                        if(Objects.equals(ingredient, findIngredient)){
                            System.out.println(recipe);
                        }
                    }
                }

            }
            System.out.println("");
        }

    }

    //task to read the recipes
    public static ArrayList<Recipe> readRecipesFromFile(String file) {
        ArrayList<Recipe> recipes = new ArrayList<>();
        ArrayList<String> parts = new ArrayList<>();

        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (!line.isEmpty()) {
                    parts.add(line);
                } else {
                    recipeParts(recipes, parts);
                }
            }
            if (!parts.isEmpty()) {
                recipeParts(recipes, parts);
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return recipes;
    }

    public static void recipeParts(ArrayList<Recipe> recipes, ArrayList<String> parts) {
        String recipeName = parts.get(0);
        int cookingTime = Integer.valueOf(parts.get(1));
        recipes.add(new Recipe(recipeName, cookingTime, new ArrayList<>(parts)));
        parts.clear();
    }
}
