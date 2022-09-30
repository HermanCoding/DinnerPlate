import java.util.Scanner;

public class Meat extends Ingredient {
    protected static final String[] arrAllowedContains = new String[]{"1", "2", "3", "4", "r"};
    Scanner scanne = new Scanner(System.in);
    String meatType;

    public Meat(Integer proteinCount, Integer fatCount, Integer calorieCount, String meatType) {
        super(proteinCount, fatCount, calorieCount);
        this.meatType = meatType;
    }

    public Meat() {
    }

    public void runMenu() {
        printMenu();
        String choice = userInput();
        menuInput(choice);
    }

    private void printMenu() {
        System.out.println("\nSpecify which meat you want?");
        System.out.println("1. Bird");
        System.out.println("2. Fish");
        System.out.println("3. Livestock");
        System.out.println("4. Venison");
        System.out.println("r. Return to previous menu");
    }

    private String userInput() {
        String choice = null;

        while (!arrAllowedContains(choice)) {
            if (choice != null) {
                System.out.println("Not a valid choice");
                printMenu();
                choice = null;
            } else {
                System.out.print("\nEnter your choice: ");
                choice = scanne.nextLine();
            }
        }

        return choice;
    }

    private boolean arrAllowedContains(String choice) {
        for (String str : arrAllowedContains) {
            if (str.equals(choice)) {
                return true;
            }
        }
        return false;
    }

    private void menuInput(String choice) {
        while (choice == null) {
            choice = scanne.nextLine();
        }
        Ingredient ingredient = new Ingredient();
        switch (choice) {
            case "1" -> {
                System.out.println("There is suppose to be choices here but everything taste like chicken so I'll just give you a chicken");
                Bird chicken = new Bird(30, 10, 2, "Bird", "Chicken");
                arrIngredients[0] = chicken;
            }
            case "2" -> System.out.println("Not implemented yet");
            case "3" -> System.out.println("Not implemented yet");
            case "4" -> System.out.println("Not implemented yet");
            case "r" -> ingredient.runMenu();
            default -> System.out.println("Not a valid choice");
        }

    }
}
