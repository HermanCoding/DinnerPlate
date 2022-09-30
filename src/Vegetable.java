public class Vegetable extends Ingredient {
    String vegetableKind;
    public Vegetable(Integer proteinCount, Integer fatCount, Integer calorieCount, String vegetableKind) {
        super(proteinCount, fatCount, calorieCount);
        this.vegetableKind = vegetableKind;
    }
    public String getVegetableKind() {
        return vegetableKind;
    }
}
