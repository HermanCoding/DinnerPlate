public class Bird extends Meat {
    String birdKind;

    public Bird(Integer proteinCount, Integer fatCount, Integer calorieCount, String meatType, String birdKind) {
        super(proteinCount, fatCount, calorieCount, meatType);
        this.birdKind = birdKind;
    }

    public String getBirdKind() {
        return birdKind;
    }
}
