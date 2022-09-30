import java.util.Scanner;

public class Ingredient {
    protected static final String[] arrAllowedContains = new String[]{"1", "2", "3", "4", "r"};
    public static Ingredient[] arrIngredients = new Ingredient[4];
    //Ingredient ingredient = new Ingredient();
    Scanner scanne = new Scanner(System.in);
    Integer proteinCount;
    Integer fatCount;
    Integer calorieCount;

    public Ingredient(Integer proteinCount, Integer fatCount, Integer calorieCount) {
        this.proteinCount = proteinCount;
        this.fatCount = fatCount;
        this.calorieCount = calorieCount;
    }

    public Ingredient() {
    }

    public Integer getProteinCount() {
        return proteinCount;
    }

    public Integer getFatCount() {
        return fatCount;
    }

    public Integer getCalorieCount() {
        return calorieCount;
    }

    public void runMenu() {
        printMenu();
        String choice = userInput();
        menuInput(choice);
    }

    private void printMenu() {
        System.out.println("\nWhat kind of ingredient do you want to add?");
        System.out.println("1. Meat");
        System.out.println("2. Vegetable");
        System.out.println("3. Side");
        System.out.println("4. Sauce");
        System.out.println("r. Return to previous menu");
    }

    private String userInput() {
        String choice = null;
        while (!arrAllowedContains(choice)) {
            if (!(choice == null)) {
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

    private Integer trycatch() {
        boolean numImp = false;
        int number = -1;
        while (!numImp) {
            try {
                number = Integer.parseInt(scanne.nextLine());
                numImp = true;
            } catch (NumberFormatException e) {
                System.out.println("Write an integer.");
            }
        }
        return number;
    }

    private void menuInput(String choice) {
        while (choice == null) {
            choice = scanne.nextLine();
        }
        Meat meat = new Meat();
        switch (choice) {
            case "1":
                meat.runMenu();                                         //Initierar menyn under class Meat
                break;
            case "2":
                System.out.println("Carrots are good for almost everything. Here have a carrot!");
                arrIngredients[1] = new Vegetable(1, 1, 20, "Carrot");
                break;
            case "3":
                System.out.println("What kind of side do you want? (Eg. Potatoes)");              //Låter användaren skriva in vad de vill ha till
                String sideType = scanne.nextLine();
                System.out.println("Protein contents of " + sideType + "?");
                Integer spro = trycatch();
                System.out.println("Fat contents of " + sideType + "?");
                Integer sfat = trycatch();
                System.out.println("Calorie contents of " + sideType + "?");
                Integer scal = trycatch();
                Side side = new Side(spro, sfat, scal, sideType);
                arrIngredients[2] = side;
                break;
            case "4":
                System.out.println("What kind of sauce do you want? (Eg. Béarnaise)");              //Låter användaren skriva in vad de vill ha till
                String sauceType = scanne.nextLine();
                System.out.println("Protein contents of " + sauceType + "?");
                Integer sapro = trycatch();
                System.out.println("Fat contents of " + sauceType + "?");
                Integer safat = trycatch();
                System.out.println("Calorie contents of " + sauceType + "?");
                Integer sacal = trycatch();
                Sauce sauce = new Sauce(sapro, safat, sacal, sauceType);
                arrIngredients[3] = sauce;
                break;
            case "r":
                break;
            default:
                System.out.println("Not a valid choice");
                //If sats skall användas istället för
                // switchsatser om vi har flera olika
                //variabler. under varje sats
                //t.ex. och , eller.
        }
    }
}