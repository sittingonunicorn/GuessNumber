package Model;

import java.util.ArrayList;

public class Model {
    private int start;
    private int end;
    private final int RANDOM_NUMBER;
    private int userNumber;
    private ArrayList<Integer> tries;
    private int tryCount;

    public Model(int start, int end) {
        this.start = start;
        this.end = end;
        RANDOM_NUMBER = setRandomNumber();
        tries = new ArrayList<Integer>();
    }

    /**
     * Method setRandomNumber() is tested with ModelTest.testSetRandomNumber() with 10000 calls.
     */
    protected int setRandomNumber() {
        return (int) Math.ceil(Math.random() * ((this.end - this.start) + this.start - 1));
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public int getRANDOM_NUMBER() {
        return RANDOM_NUMBER;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public ArrayList<Integer> getTries() {
        return tries;
    }

    public void addTry(int inputNumber) {
        tries.add(inputNumber);
    }

    public int getTryCount() {
        return tryCount;
    }

    public void increaseTryCount() {
        tryCount++;
    }

    public boolean isGuessed(int number) {
        return RANDOM_NUMBER == number;
    }

    public String biggerSmaller(int number) {
        if (RANDOM_NUMBER > number) {
            start = number;
            return "bigger";
        } else {
            end = number;
            return "smaller";
        }

    }


}
