package homework.homework5.runners;

/**
 * 5. Создать класс CalculatorWithCounterAutoSuperMain в котором будет точка входа (main метод). В main методе
 * требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения
 * из задания 1.
 * Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 * 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль. Внимание, знак "^" обозначает возведение в степень.
 */

import homework.homework5.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {

    public static final String MATH_EXPRESSION = "4.1 + 15 * 7 + (28 / 5) ^ 2 = ";

    public static void main(String[] args) {

        CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();

        double result1 = calculator.div(28, 5);
        double result2 = calculator.degreeOfDoubleNumber(result1, 2);
        double result3 = calculator.mult(15, 7);
        double result4 = calculator.sum(result2, result3);
        double result5 = calculator.sum(4.1,result4);

        System.out.println(MATH_EXPRESSION + result5);
        System.out.println("Количество математических операций: " + calculator.getCountOperation());


    }
}
