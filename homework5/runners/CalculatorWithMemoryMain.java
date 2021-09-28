package homework.homework5.runners;
/**
 * 10.6 Создать класс CalculatorWithMemoryMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора и
 * * используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат. В мэйне запрещается использование
 * * переменных для хранения значений участвующих в просчёте, а также результатов работы методов калькулятора, можно использовать
 * * только литералы и метод получения из памяти записанного значения.
 */

import homework.homework5.calcs.additional.CalculatorWithMemory;
import homework.homework5.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {

    public static final String MATH_EXPRESSION = "4.1 + 15 * 7 + (28 / 5) ^ 2 = ";

    public static void main(String[] args) {

        CalculatorWithMemory calculator = new CalculatorWithMemory(new CalculatorWithOperator());

        double result1 = calculator.div(28, 5);
        calculator.writeToMemory();
        double result2 = calculator.degreeOfDoubleNumber(result1, 2);
        double result3 = calculator.mult(15, 7);
        double result4 = calculator.sum(result2, result3);
        double result5 = calculator.sum(4.1, result4);

        System.out.println(MATH_EXPRESSION + result5);
        System.out.println("Значение в памяти: " + calculator.getMemory());
        System.out.println("Значение в памяти: " + calculator.getMemory());

    }
}
