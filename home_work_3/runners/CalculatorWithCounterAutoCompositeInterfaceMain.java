package homework.home_work_3.runners;

import homework.home_work_3.calcs.additional.CalculatorWithCounterAutoCompositeInterface;
import homework.home_work_3.calcs.simple.CalculatorWithOperator;

/**
 * 9.7 Создать класс CalculatorWithCounterAutoCompositeInterfaceMain в котором будет точка входа (main метод).
 * В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения
 * 4.1 + 15 * 7 + (28 / 5) ^ 2.
 * Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */

public class CalculatorWithCounterAutoCompositeInterfaceMain {

    public static final String MATH_EXPRESSION = "4.1 + 15 * 7 + (28 / 5) ^ 2 = ";

    public static void main(String[] args) {

        CalculatorWithCounterAutoCompositeInterface calculator = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithOperator());
        //CalculatorWithCounterAutoCompositeInterface calculator = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithMathCopy());
        //CalculatorWithCounterAutoCompositeInterface calculator = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithMathExtends());

        double result1 = calculator.div(28, 5);
        double result2 = calculator.degreeOfDoubleNumber(result1, 2);
        double result3 = calculator.mult(15, 7);
        double result4 = calculator.sum(result2, result3);
        double result5 = calculator.sum(4.1,result4);

        System.out.println(MATH_EXPRESSION + result5);
        System.out.println("Количество математических операций: " + calculator.getCountOperation());





    }
}
