package Model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ModelTest {
    Model model;
    @Before
    public void createModel() {
        model = new Model(0, 100);
    }

    @Ignore
    @Test
    public void testSetRandomNumber() {

        int count = 10000;
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = model.setRandomNumber();
            if (array[i] == 0 || array[i] == 100) {
                Assert.fail();
            }
        }
    }

    @Test
    public void testBiggerSmallerBig() {
        int number = 50;
        int random = model.getRANDOM_NUMBER();
        if (random > number && !model.biggerSmaller(number).equals("bigger")) {
            Assert.fail();
        }
    }

    @Test
    public void testBiggerSmallerSmall() {
        int number = 50;
        int random = model.getRANDOM_NUMBER();
        if (random < number && !model.biggerSmaller(number).equals("smaller")) {
            Assert.fail();
        }
    }

}


