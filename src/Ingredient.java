import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ingredient {
    Scanner scanne = new Scanner(System.in);
    public static void runIngredient() {            //En metod (i C# funktion) som är statisk. Anledningen till detta är
        Ingredient ingredient = new Ingredient();   //för att den skall kunna hämtas utanför klassen utan att deklareras
        ingredient.runMenu();
    }
    public static final String[] arrAllowedContains = new String[] { "1", "2" , "3" , "4" , "r"};
    public static final Set<String> allowedContains = new HashSet<>(Arrays.asList(arrAllowedContains));

    Ingredient[] arrIngredient = new Ingredient[2];
    Integer proteinCount;
    Integer fatCount;
    Integer calorieCount;

    private void runMenu(){                     //Menyn är void för den skall inte spara någon data.
            printMenu();                        //Skriver ut menyn (funktion nedan)
            String choice = getUserInput();     //Hämtar användarens input (funktion nedan)
            setUserInput(choice);               //Uppdaterar funktionen setUserInput med användarens input
        }
    private void printMenu() {
        System.out.println("\nWhat kind of ingredient do you want to add?");
        System.out.println("1. Meat");
        System.out.println("2. Vegetable");
        System.out.println("3. Side");
        System.out.println("4. Dairy");
        System.out.println("r. Return to previous menu");
    }
    private String getUserInput(){
        String choice = null;
        while(!allowedContains.contains(choice)){
            try{                                                //Kanske inte nödvändigt med try catch här!!
                System.out.print("\nEnter your choice: ");      //Anledningen till try catch är för att fånga upp ev.
                choice = scanne.nextLine();                     //fel som användaren kan mata in.
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return choice;
    }
    private void setUserInput(String choice) {
        while (choice == null) {
            choice = scanne.nextLine();
        }
        switch (choice) {
            case "1":
                //arrIngredient[0] = new Meat();
                break;
            case "2":
                //arrIngredient[1] = new Vegetable();
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
