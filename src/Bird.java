public class Bird extends Meat {
    public Bird(Integer proteinCount, Integer fatCount, Integer calorieCount, String meatType) {
        super(proteinCount, fatCount, calorieCount, meatType);
    }
/*    public Bird() {
        Integer proteinCount = 20;
        Integer fatCount = 20;
        Integer calorieCount = 20;
        super(proteinCount, fatCount, calorieCount);
        this.proteinCount = proteinCount;
        this.fatCount = fatCount;
        this.calorieCount = calorieCount;
    }
    public void setBird(){
        Bird chiken = new Bird(30,10,100,200,"Bird","whole","Chicken");
        Bird goose = new Bird(20,20,5,75,100,"Bird","whole","Goose");
        Bird turkey = new Bird(15,10,0,50,50,"Bird","whole","Turkey");
    }*/
}
