import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ingredient {
    protected static final String[] arrAllowedContains = new String[]{"1", "2", "3", "4", "r"};
    protected static final Set<String> allowedContains = new HashSet<>(Arrays.asList(arrAllowedContains));
    Scanner scanne = new Scanner(System.in);

    public Ingredient(Integer proteinCount, Integer fatCount, Integer calorieCount) {
    }

    public static void runIngredient() {            //En metod (i C# funktion) som är statisk. Anledningen till detta är
        Ingredient ingredient = new Ingredient(-1, -1, -1);
        ingredient.runMenu();                       //för att den skall kunna hämtas utanför klassen utan att deklareras
    }

    private void runMenu() {
        printMenu();
        String choice = userInput();
        menuInput(choice);
    }

    private void printMenu() {
        System.out.println("\nWhat kind of ingredient do you want to add?");
        System.out.println("1. Meat");
        System.out.println("2. Vegetable");
        System.out.println("3. Side");
        System.out.println("4. Dairy");
        System.out.println("r. Return to previous menu");
    }

    private String userInput() {
        String choice = null;
        while (!allowedContains.contains(choice)) {
            if (!(choice == null)) {
                System.out.println("Not a valid choice");
                printMenu();
                choice = null;
            } else {
                try {
                    System.out.print("\nEnter your choice: ");
                    choice = scanne.nextLine();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return choice;
    }

    private void menuInput(String choice) {
        while (choice == null) {
            choice = scanne.nextLine();
        }
        switch (choice) {
            case "1":
                Meat.runMeat();                                             //Initierar menyn under class Meat
                break;
            case "2":
                //Vegetable.runVegetable();                                 //Initierar menyn under class Vegetable
                break;
            case "3":
                System.out.println("Not implemented yet");
                break;
            case "4":
                System.out.println("Not implemented yet");
                break;
            case "r":
                break;
            default:
                System.out.println("Not a valid choice");

        }
    }
}
