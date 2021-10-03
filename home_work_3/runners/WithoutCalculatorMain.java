package homework.home_work_3.runners;

/**
 * Посчитать следующие выражения:
 * 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль. Внимание, знак "^" обозначает возведение в степень.
 */

public class WithoutCalculatorMain {

    public static final String MATH_EXPRESSION = "4.1 + 15 * 7 + (28 / 5) ^ 2 = ";

    public static void main(String[] args) {

        double result = 4.1 + 15 * 7 + Math.pow((28.0 / 5), 2);
        System.out.print(MATH_EXPRESSION + result);

    }
}
