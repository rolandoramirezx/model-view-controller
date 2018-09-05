import java.util.ArrayList;

public class IceCreamShop {

    public static void main (String[] args){

        ArrayList<Dessert> desserts = new ArrayList<>();
        DessertView view = new DessertView();

        Dessert vanillaIceCreamWithHotFuge = new VanillaIceCream();
        vanillaIceCreamWithHotFuge = new HotFudge(vanillaIceCreamWithHotFuge);

        Dessert chocolateIceCreamWithSprinkles = new ChocolateIceCream();
        chocolateIceCreamWithSprinkles = new Sprinkles(chocolateIceCreamWithSprinkles);

        desserts.add(vanillaIceCreamWithHotFuge);
        desserts.add(chocolateIceCreamWithSprinkles);

        DessertController controller = new DessertController(desserts, view);
        controller.updateView();

    }
}
