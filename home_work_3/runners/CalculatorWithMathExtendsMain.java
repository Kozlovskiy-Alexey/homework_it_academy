package homework.home_work_3.runners;
import homework.home_work_3.calcs.simple.CalculatorWithMathExtends;

/**
 * Посчитать следующие выражения:
 * 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль. Внимание, знак "^" обозначает возведение в степень.
 */

public class CalculatorWithMathExtendsMain {

    public static final String MATH_EXPRESSION = "4.1 + 15 * 7 + (28 / 5) ^ 2 = ";

    public static void main(String[] args) {

        CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();

        double result1 = calculator.div(28, 5);
        double result2 = calculator.degreeOfDoubleNumber(result1, 2);
        double result3 = calculator.mult(15, 7);
        double result4 = calculator.sum(result2, result3);
        double result5 = calculator.sum(4.1, result4);

        System.out.println(MATH_EXPRESSION + result5);
    }
}
