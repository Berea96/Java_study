package java_8.april;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    @Test
    public void calculateAddition() {
        Calculation calculation = new Addition();

        final int actual = calculation.calculate(1, 1);

        Assertions.assertEquals(actual, 2);
    }
    @Test
    public void calculateSubtraction() {
        Calculation calculation = new Subtraction();

        final int actual = calculation.calculate(1, 1);

        Assertions.assertEquals(actual, 0);
    }
    @Test
    public void calculateMultipication() {
        Calculation calculation = new Multiplication();

        final int actual = calculation.calculate(3, 1);

        Assertions.assertEquals(actual, 3);
    }
    @Test
    public void calculateDivision() {
        Calculation calculation = new Division();

        final int actual = calculation.calculate(1, 0);

        Assertions.assertEquals(actual, 1);
    }
}