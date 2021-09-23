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
    public static void main(String[] args) {

        double a = 4.1;
        int b = 15;
        int c = 7;
        double d = 28;
        int e = 5;
        int p = 2;

        CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();
        double result = calculator.add(a, (calculator.add(b * c, calculator.degreeOfDoubleNumber(d / e, p))));

        System.out.printf("%s%.2f%n", WithoutCalculatorMain.MATH_EXPRESSION, result);
        System.out.println("Количество вызываемых методов: " + calculator.getCountOperation());


    }
}
