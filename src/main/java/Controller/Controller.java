package Controller;

import Model.Model;
import View.View;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public int inputIntValueWithScannerAndDiapason(Scanner sc) {
        int inputInt = 0;
        view.printMessageAndInt(View.INPUT_NUMBER, model.getStart(), model.getEnd());
        for (; ; ) {
            while (!sc.hasNextInt() ) {
                view.printMessage(View.WRONG_INPUT);
                view.printMessageAndInt(View.INPUT_NUMBER, model.getStart(), model.getEnd());
                sc.next();
            }
            if((inputInt = sc.nextInt()) < model.getStart() || inputInt > model.getEnd()){
                view.printMessage(View.WRONG_INPUT);
                view.printMessageAndInt(View.INPUT_NUMBER, model.getStart(), model.getEnd());
                continue;
            }
            break;
        }
        return inputInt;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        view.printMessage(View.GAME_STARTS);
        model.setUserNumber(inputIntValueWithScannerAndDiapason(sc));
        for (; !model.isGuessed(model.getUserNumber()); ) {
            model.increaseTryCount();
            model.addTry(model.getUserNumber());
            view.printMessage(View.WRONG_NUMBER + model.biggerSmaller(model.getUserNumber()));
            view.printMessageAndInt(View.TRY_COUNT, model.getTryCount());
            view.printMessageAndArrayList(View.PREVIOUS_TRIES, model.getTries());
            model.setUserNumber(inputIntValueWithScannerAndDiapason(sc));
        }
        view.printMessage(View.WRIGHT_NUMBER);
        view.printMessageAndInt(View.TRY_COUNT, model.getTryCount());
        view.printMessageAndArrayList(View.PREVIOUS_TRIES, model.getTries());

    }


}
