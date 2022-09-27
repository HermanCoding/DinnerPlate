import java.util.Scanner;

public class Meat extends Ingredient {
    public Meat(Integer proteinCount, Integer fatCount, Integer calorieCount, String meatType) {
        super(proteinCount, fatCount, calorieCount);
        this.scanne = new Scanner(System.in);
    }

    public static void runMeat() {
        Meat meat = new Meat(-1, -1, -1, null);
        meat.runMenu();
    }

    private void runMenu() {
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

        while (!allowedContains.contains(choice)) {
            if (choice != null) {
                System.out.println("Not a valid choice");
                printMenu();
                choice = null;
            } else {
                try {
                    System.out.print("\nEnter your choice: ");
                    choice = scanne.nextLine();
                } catch (Exception var3) {
                    throw new RuntimeException(var3);
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
                break;                              //TODO skapa bird objektet och sen hämta data = getters och setters
            case "2":
                System.out.println("Not implemented yet");
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
