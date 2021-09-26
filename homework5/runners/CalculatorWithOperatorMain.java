package homework.homework5.runners;

/**
 * 2.5 Создать класс CalculatorWithOperatorMain в котором будет точка входа (main метод).
 * В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат.
 */

import homework.homework5.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {

        CalculatorWithOperator calculator = new CalculatorWithOperator();
        double x = 2.5;
        int y = 2;

        //деление
        System.out.printf("%.1f / %d = ", x, y);
        System.out.println(calculator.div(x, y));

        //умножение
        System.out.printf("%.1f * %d = ", x, y);
        System.out.println(calculator.mult(x, y));

        //вычитание
        System.out.printf("%.1f - %d = ", x, y);
        System.out.println(calculator.sub(x, y));

        //сложение
        System.out.printf("%.1f + %d = ", x, y);
        System.out.println(calculator.sum(x, y));

        //возведение в степень
        System.out.printf("%.1f ^ %d = ", x, y);
        System.out.println(calculator.degreeOfDoubleNumber(x, y));

        //модуль числа
        System.out.printf("ABS |-%.1f|  = ", x);
        System.out.println(calculator.mod(-x));

        //квадратный корень
        System.out.printf("Square root %.1f  = ", x);
        System.out.println(calculator.squareRoot(x));
    }
}
