public class Sprinkles extends Dessert {

    Dessert dessert;

    public Sprinkles(Dessert dessert){
        this.dessert = dessert;

    }
    public String getDescription() {
        return dessert.getDescription() + ", Sprinkles";
    }

    public double cost() {
        return dessert.cost() + 0.50;
    }
}
