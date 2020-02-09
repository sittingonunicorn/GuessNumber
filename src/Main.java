import Controller.Controller;
import Model.Model;
import View.View;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Model model = new Model(0, 100);
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
