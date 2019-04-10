package java_8.april;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    @Test
    public void calculateAddition() {
        CalculatorService calculatorService = new CalculatorService();

        final int actual = calculatorService.calculate('+', 1, 1);

        Assertions.assertEquals(actual, 2);
    }
    @Test
    public void calculateSubtraction() {
        CalculatorService calculatorService = new CalculatorService();

        final int actual = calculatorService.calculate('-', 1, 1);

        Assertions.assertEquals(actual, 0);
    }
    @Test
    public void calculateMultipication() {
        CalculatorService calculatorService = new CalculatorService();

        final int actual = calculatorService.calculate('*', 3, 1);

        Assertions.assertEquals(actual, 3);
    }
    @Test
    public void calculateDivision() {
        CalculatorService calculatorService = new CalculatorService();

        final int actual = calculatorService.calculate('/', 1, 0);

        Assertions.assertEquals(actual, 1);
    }
}