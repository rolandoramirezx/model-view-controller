import java.util.ArrayList;

public class DessertController {

    private ArrayList<Dessert> model;
    private DessertView view;

    public DessertController(ArrayList<Dessert> model, DessertView view){
        this.model = model;
        this.view = view;
    }

    public void updateView(){
        view.printStudentDetails(model);
    }

}
