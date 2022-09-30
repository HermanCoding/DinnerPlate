public class Side extends Ingredient {
    String sideType;

    public Side(Integer proteinCount, Integer fatCount, Integer calorieCount, String sideType) {
        super(proteinCount, fatCount, calorieCount);
        this.sideType = sideType;
    }

    public String getSideType() {
        return sideType;
    }
}
