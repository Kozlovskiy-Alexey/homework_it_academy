package homework.homework5.runners;

/**
 * Посчитать следующие выражения:
 * 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль. Внимание, знак "^" обозначает возведение в степень.
 */

import homework.homework5.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        double a = 4.1;
        int b = 15;
        int c = 7;
        double d = 28;
        int e = 5;
        int p = 2;

        CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();
        double result = calculator.add(a, (b * c + calculator.degreeOfDoubleNumber(d / e, p)));
        System.out.printf("%s%.2f", WithoutCalculatorMain.MATH_EXPRESSION, result);
    }
}
