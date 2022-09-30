public class Sauce extends Ingredient {
    String sauceType;

    public Sauce(Integer proteinCount, Integer fatCount, Integer calorieCount, String sauceType) {
        super(proteinCount, fatCount, calorieCount);
        this.sauceType = sauceType;
    }

    public String getSauceType() {
        return sauceType;
    }
}
