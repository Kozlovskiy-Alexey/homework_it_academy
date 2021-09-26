package homework.homework5.runners;

/**
 * 5.5 Создать класс CalculatorWithCounterClassicMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора
 * и используя методы из данного экземпляра посчитать выражения из задания 1, при каждой математической операции самостоятельно вызывать
 * метод incrementCountOperation() для увеличения счётчика. Вывести в консоль результат.
 * Посчитать следующие выражения:
 * 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль. Внимание, знак "^" обозначает возведение в степень.
 */

import homework.homework5.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {

        double a = 4.1;
        int b = 15;
        int c = 7;
        double d = 28;
        int e = 5;
        int p = 2;

        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();

        double mult = calculator.mult(b, c);
        calculator.incrementCountOperation();

        double div = calculator.div(d, e);
        calculator.incrementCountOperation();

        double pow = calculator.degreeOfDoubleNumber(div, p);
        calculator.incrementCountOperation();

        double add1 = calculator.sum(a, mult);
        calculator.incrementCountOperation();

        double add2 = calculator.sum(add1, pow);
        calculator.incrementCountOperation();

        System.out.printf("%s%.2f %n", WithoutCalculatorMain.MATH_EXPRESSION, add2);
        System.out.println("количество математических операций: " + calculator.getCountOperation());

    }
}
