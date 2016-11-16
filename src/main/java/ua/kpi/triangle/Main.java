package ua.kpi.triangle;

/**
 * Created by Evgeniy on 17.11.2016.
 * Method for run the program
 */
public class Main {
    public static void main(String[] args) {

        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        // Run
        controller.userMethod();
    }
}
