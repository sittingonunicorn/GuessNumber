package View;

import java.util.ArrayList;

public class View {
    public static final String GAME_STARTS = "Let the game begin! Try to guess the number";
    public static final String INPUT_NUMBER = "Input number between ";
    public static final String WRONG_INPUT = "Wrong input!";
    public static final String WRONG_NUMBER = "Wrong number. Desired number is ";
    public static final String WRIGHT_NUMBER = "Congratulations! You guessed the number!";
    public static final String TRY_COUNT = "The number of tries: ";
    public static final String PREVIOUS_TRIES = "Previously you've input: ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessage(String message, String message2) {
        System.out.println(message + message2);
    }

    public void printMessageAndInt(String message, int number) {
        System.out.println(message + number);
    }

    public void printMessageAndInt(String message, int number, String message2) {
        System.out.println(message + number + message2);
    }

    public void printMessageAndInt(String message, int number1, int number2) {
        System.out.println(message + number1 + " and " + number2);
    }

    public void printMessageAndArrayList(String message, ArrayList arrayList) {
        System.out.println(message + stringArrayList(arrayList));
    }

    public String stringArrayList(ArrayList<Integer> arrayList) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            result.append(arrayList.get(i) + ", ");
        }
        result.append(arrayList.get(arrayList.size() - 1));
        return result.toString();
    }

}
