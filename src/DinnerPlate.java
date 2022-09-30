import java.util.Scanner;

public class DinnerPlate {
    boolean exit = false;
    Scanner scanne = new Scanner(System.in);

    public static void main(String[] args) {
        DinnerPlate dinnerplate = new DinnerPlate();
        dinnerplate.printHeader();
        dinnerplate.runMainMenu();
    }

    private void runMainMenu() {                            //Menyn är void för den skall inte spara någon data.
        while (!exit) {                                     //Kör menyn så länge användaren inte har initierat (q) "exit".
            printMainMenu();                                //Skriver ut menyn (funktion nedan)
            String choice = userInput();                    //Hämtar användarens input (funktion nedan)
            mainMenuInput(choice);                          //Uppdaterar funktionen setUserInput med användarens input
        }
    }

    private void printHeader() {
        System.out.println("+-----------------------------------+");
        System.out.println("|           Dinner plate            |");
        System.out.println("+-----------------------------------+");
    }

    private void printMainMenu() {
        System.out.println("\nPleas make a selection: ");
        System.out.println("1. Add ingredient to dinner plate");
        System.out.println("2. Add a recipe to dinner plate");
        System.out.println("3. Show dinner plate");
        System.out.println("q. Quit application");
    }

    /*
    Satt alldeles för länge och försökte få menyerna att jobba med samma kod för att jag skulle slippa upprepa kod.
    Fick tyvärr inte ihop detta så gick tillbaka till att upprepa koden under varje klass.
    Tänker att det måste finnas ett mer elegant sätt att lösa detta. Borde kanske lagt alla menyer under DinnerPlate
    klassen men det blev så grötigt i den så ville inte ha det så.
     */

    public String userInput() {
        String choice = null;
        while (choice == null) {
            System.out.print("\nEnter your choice: ");
            choice = scanne.nextLine();
        }
        return choice;
    }

    public void PrintDP() {
        if (Ingredient.arrIngredients[0] != null && Ingredient.arrIngredients[0] instanceof Bird) {
            System.out.println("Chosen meat " + ((Bird) Ingredient.arrIngredients[0]).getBirdKind() + " contains:\nProtin: " + Ingredient.arrIngredients[0].getProteinCount() + "\nFat: " + Ingredient.arrIngredients[0].getFatCount() + "\nCalorie: " + Ingredient.arrIngredients[0].getCalorieCount());
        } // else if (Ingredient.arrIngredients[0] != null && Ingredient.arrIngredients[0] instanceof Fish) {}

        if (Ingredient.arrIngredients[1] != null && Ingredient.arrIngredients[1] instanceof Vegetable) {
            System.out.println("Chosen vegetable " + ((Vegetable) Ingredient.arrIngredients[1]).getVegetableKind() + " contains:\nProtin: " + Ingredient.arrIngredients[1].getProteinCount() + "\nFat: " + Ingredient.arrIngredients[1].getFatCount() + "\nCalorie: " + Ingredient.arrIngredients[1].getCalorieCount());
        }
        if (Ingredient.arrIngredients[2] != null && Ingredient.arrIngredients[2] instanceof Side) {
            System.out.println("Chosen side " + ((Side)Ingredient.arrIngredients[2]).getSideType() + " contains:\nProtin: " + Ingredient.arrIngredients[2].getProteinCount() + "\nFat: " + Ingredient.arrIngredients[2].getFatCount() + "\nCalorie: " + Ingredient.arrIngredients[2].getCalorieCount());
        }
        if (Ingredient.arrIngredients[3] != null && Ingredient.arrIngredients[3] instanceof Sauce) {
            System.out.println("Chosen sauce " + ((Sauce)Ingredient.arrIngredients[3]).getSauceType() + " contains:\nProtin: " + Ingredient.arrIngredients[3].getProteinCount() + "\nFat: " + Ingredient.arrIngredients[3].getFatCount() + "\nCalorie: " + Ingredient.arrIngredients[3].getCalorieCount());
        }
    }

    private void mainMenuInput(String choice) {
        Ingredient ingredient = new Ingredient();
        switch (choice) {
            case "1" -> ingredient.runMenu();                               //Initierar kör menyn under class Ingredient
            case "2" -> System.out.println("Not implemented yet");
            case "3" -> {
                PrintDP();
                System.out.println("Press Enter to continue");
                scanne.nextLine();
            }
            case "q" -> {
                exit = true;
                System.out.println("Have a great meal!");
            }
            default -> System.out.println("Not a valid choice");
        }
    }
}