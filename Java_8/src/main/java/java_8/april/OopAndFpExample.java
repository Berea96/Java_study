package java_8.april;

public class OopAndFpExample {

    public static void main(String[] args) {
        final CalculatorService calculatorService = new CalculatorService(new Addition());

        final int additionResult = calculatorService.calculate(12, 1);
        System.out.println(additionResult);

        final int subtractionResult = calculatorService.calculate(14, 1);
        System.out.println(subtractionResult);

        final int multipicationResult = calculatorService.calculate(15, 1);
        System.out.println(multipicationResult);

        final int divisionResult = calculatorService.calculate(61, 1);
        System.out.println(divisionResult);


        final FpCalculatorService fpCalculatorService = new FpCalculatorService();
        System.out.println("        addition : " + fpCalculatorService.calculate((i1, i2) -> i1 + i2, 13, 2));
        System.out.println("     subtraction : " + fpCalculatorService.calculate((i1, i2) -> i1 - i2, 34, 2));
        System.out.println("  multiplication : " + fpCalculatorService.calculate((i1, i2) -> i1 * i2, 23, 2));
        System.out.println("        division : " + fpCalculatorService.calculate((i1, i2) -> i1 / i2, 12, 2));
        System.out.println("     custom calc : " + fpCalculatorService.calculate((i1, i2) -> ((i1 + i2) * 2) / i2, 12, 2));
    }

}

interface Calculation {
    int calculate(int num1, int num2);
}

class Addition implements Calculation {
    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}

class Subtraction implements  Calculation {
    @Override
    public int calculate(int num1, int num2) {
        return num1 - num2;
    }
}

class Multiplication implements Calculation {
    @Override
    public int calculate(int num1, int num2) {
        return num1 * num2;
    }
}

class Division implements Calculation {
    @Override
    public int calculate(int num1, int num2) {
        return num1 / num2;
    }
}

class CalculatorService {
    private Calculation calculation;

    public CalculatorService(Calculation calculation) {
        this.calculation = calculation;
    }

    public int calculate(int num1, int num2) {
        if (num1 > 10 && num2 < num1) {
            return calculation.calculate(num1, num2);
        } else {
            throw new IllegalArgumentException("invalid input num1 : " + num1 +
                    " num2 : " + num2);
        }
    }
//    public int calculate(char calculation, int num1, int num2) {
//
//        if(calculation == '+') {
//            return num1 + num2;
//        } else if (calculation == '-') {
//            return num1 - num2;
//        } else if (calculation == '*') {
//            return num1 * num2;
//        } else if (calculation == '/') {
//            return num1 / num2;
//        } else {
//            throw new IllegalArgumentException("Unknown calculation: " + calculation);
//        }
//    }
}

class FpCalculatorService {
    public int calculate(Calculation calculation, int num1, int num2) {
        if (num1 > 10 && num2 < num1) {
            return calculation.calculate(num1, num2);
        } else {
            throw new IllegalArgumentException("invalid input num1 : " + num1 +
                    " num2 : " + num2);
        }
    }
}
