public class HotFudge extends Toppings {

    Dessert dessert;

    public HotFudge(Dessert dessert){
        this.dessert = dessert;

    }
    public String getDescription() {
        return dessert.getDescription() + ", Hot Fudge";
    }

    public double cost() {
        return dessert.cost() + 0.50;
    }
}
