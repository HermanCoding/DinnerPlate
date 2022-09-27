import java.util.Scanner;

public class DinnerPlate {
    boolean exit = false;
    Scanner scanne = new Scanner(System.in);

    public static void main(String[] args) {
        DinnerPlate dinnerplate = new DinnerPlate();
        dinnerplate.printHeader();
        dinnerplate.runMenu();
    }

    private void runMenu() {                            //Menyn är void för den skall inte spara någon data.
        while (!exit) {                                 //Kör menyn så länge användaren inte har initierat (q) "exit".
            printMenu();                                //Skriver ut menyn (funktion nedan)
            String choice = userInput();                //Hämtar användarens input (funktion nedan)
            menuInput(choice);                          //Uppdaterar funktionen setUserInput med användarens input
        }
    }

    private void printHeader() {
        System.out.println("+-----------------------------------+");
        System.out.println("|           Dinner plate            |");
        System.out.println("+-----------------------------------+");
    }

    private void printMenu() {
        System.out.println("\nPleas make a selection: ");
        System.out.println("1. Add ingredient to dinner plate");
        System.out.println("2. Add a recipe to dinner plate");
        System.out.println("3. Show dinner plate");
        System.out.println("q. Quit application");
    }

    private String userInput() {
        String choice = null;
        while (choice == null) {
            try {                                                //Kanske inte nödvändigt med try catch här!!
                System.out.print("\nEnter your choice: ");
                choice = scanne.nextLine();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return choice;
    }

    private void menuInput(String choice) {
        switch (choice) {
            case "1":
                Ingredient.runIngredient();                         //Initierar kör menyn under class Ingredient
                break;
            case "2":
                System.out.println("Not implemented yet");
                break;
            case "3":                                               //TODO List array of ingredients
                break;
            case "q":
                exit = true;
                System.out.println("Have a great meal!");
                break;
            default:
                System.out.println("Not a valid choice");
        }
    }
}