public class Bird extends Meat {
    public Bird(Integer proteinCount, Integer fatCount, Integer calorieCount, String meatType) {
        super(proteinCount, fatCount, calorieCount, meatType);
    }

    public void setBird() {
        Bird chicken = new Bird(30, 10, 100, "Bird");    //,"whole","Chicken");
        Bird goose = new Bird(20, 20, 5, "Bird");       //,"whole","Goose");
        Bird turkey = new Bird(15, 10, 0, "Bird");      //,"whole","Turkey");
    }
}
