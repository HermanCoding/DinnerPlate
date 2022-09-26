import java.util.Scanner;

public class Meat extends Ingredient {
    Scanner scanne = new Scanner(System.in);
    String meatType;

 /*   public Meat() {
        super(userSelection.proteinCount, userSelection.fatCount, userSelection.calorieCount);
        Ingredient userSelection = getUserInput();
        this.meatType = meatType;
    }
  */
    public Meat(Integer proteinCount, Integer fatCount, Integer calorieCount, String meatType) {
        //super(proteinCount, fatCount, calorieCount);
        this.meatType = meatType;
        getUserInput();
    }
    private void getUserInput()
    {
        String choice = null;
        System.out.println("\nSpecify which meat you want?");
        System.out.println("1. Bird");
        System.out.print("2. Fish");
        System.out.print("3. Livestock");
        System.out.print("4. Venison");
        while (choice == null) {
            choice = scanne.nextLine();
        }
        switch (choice) {
            case "1":
                break;  //TODO skapa bird objektet och sen hämta data = getters och setters
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

    public void setMeatType(String meatType) {
    }
}
