package homework.home_work_3.runners;
import homework.home_work_3.calcs.additional.CalculatorWithCounterClassic;

/**
 * 5.5 Создать класс CalculatorWithCounterClassicMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора
 * и используя методы из данного экземпляра посчитать выражения из задания 1, при каждой математической операции самостоятельно вызывать
 * метод incrementCountOperation() для увеличения счётчика. Вывести в консоль результат.
 * Посчитать следующие выражения:
 * 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль. Внимание, знак "^" обозначает возведение в степень.
 */

public class CalculatorWithCounterClassicMain {

    public static final String MATH_EXPRESSION = "4.1 + 15 * 7 + (28 / 5) ^ 2 = ";

    public static void main(String[] args) {

        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();

        double result1 = calculator.div(28, 5);
        calculator.incrementCountOperation();

        double result2 = calculator.degreeOfDoubleNumber(result1, 2);
        calculator.incrementCountOperation();

        double result3 = calculator.mult(15, 7);
        calculator.incrementCountOperation();

        double result4 = calculator.sum(result2, result3);
        calculator.incrementCountOperation();

        double result5 = calculator.sum(4.1,result4);
        calculator.incrementCountOperation();

        System.out.println(MATH_EXPRESSION + result5);
        System.out.println("количество математических операций: " + calculator.getCountOperation());

    }
}
