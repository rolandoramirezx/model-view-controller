import java.util.ArrayList;

public class DessertView {

    public void printStudentDetails(ArrayList<Dessert> desserts) {

        for (Dessert dessert: desserts){
            System.out.println(dessert.getDescription() + ": " + dessert.cost());
        }
    }

}
