package homework.homework5.runners;

import homework.homework5.calcs.additional.CalculatorWithCounterAutoCompositeInterface;
import homework.homework5.calcs.simple.CalculatorWithMathCopy;
import homework.homework5.calcs.simple.CalculatorWithOperator;

/**
 * 9.7 Создать класс CalculatorWithCounterAutoCompositeInterfaceMain в котором будет точка входа (main метод).
 * В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения
 * 4.1 + 15 * 7 + (28 / 5) ^ 2.
 * Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {

        double a = 4.1;
        double b = 15;
        int c = 7;
        double d = 28;
        int e = 5;
        int p = 2;

        String str1 = "%s%.2f%n";
        String str2 = "Количество вызываемых методов: ";

        CalculatorWithCounterAutoCompositeInterface calculator1 = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithOperator());

        double result1 = calculator1.sum(a, (calculator1.mult(b, c) + calculator1.degreeOfDoubleNumber(calculator1.div(d, e), p)));
        System.out.printf(str1, WithoutCalculatorMain.MATH_EXPRESSION, result1);
        System.out.println(str2 + calculator1.getCountOperation());

        CalculatorWithCounterAutoCompositeInterface calculator2 = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithMathCopy());

        double result2 = calculator2.sum(a, (calculator2.mult(b, c) + calculator2.degreeOfDoubleNumber(calculator2.div(d, e), p)));
        System.out.printf(str1, WithoutCalculatorMain.MATH_EXPRESSION, result2);
        System.out.println(str2 + calculator2.getCountOperation());

        CalculatorWithCounterAutoCompositeInterface calculator3 = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithMathCopy());

        double result3 = calculator3.sum(a, (calculator3.mult(b, c) + calculator3.degreeOfDoubleNumber(calculator3.div(d, e), p)));
        System.out.printf(str1, WithoutCalculatorMain.MATH_EXPRESSION, result3);
        System.out.println(str2 + calculator3.getCountOperation());

    }
}
