package homework.homework5.runners;

import homework.homework5.calcs.additional.CalculatorWithMemory;
import homework.homework5.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {

        double a = 4.1;
        double b = 15;
        int c = 7;
        double d = 28;
        int e = 5;
        int p = 2;

        String str1 = "%s%.2f%n";
        String str2 = "Значение в памяти: ";

        CalculatorWithMemory calculator = new CalculatorWithMemory(new CalculatorWithOperator());

        calculator.sum(a, (calculator.mult(b, c) + calculator.degreeOfDoubleNumber(calculator.div(d, e), p)));
        calculator.writeToMemory();

        System.out.printf(str1, WithoutCalculatorMain.MATH_EXPRESSION, calculator.getResult());
        System.out.println(str2 + calculator.getMemory());

        calculator.div(15,3);
        System.out.println(calculator.getResult());
        System.out.println(str2 + calculator.getMemory());
    }
}
