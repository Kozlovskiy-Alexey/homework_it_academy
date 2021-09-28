package homework.homework5.runners;

import homework.homework5.calcs.additional.CalculatorWithCounterAutoComposite;
import homework.homework5.calcs.simple.CalculatorWithMathCopy;
import homework.homework5.calcs.simple.CalculatorWithMathExtends;
import homework.homework5.calcs.simple.CalculatorWithOperator;

/**
 * 7.7 Создать класс CalculatorWithCounterAutoCompositeMain в котором будет точка входа (main метод). В main методе требуется создать
 * экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
 * 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль. Внимание, знак "^" обозначает возведение в степень.
 * Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */

public class CalculatorWithCounterAutoCompositeMain {

    public static final String MATH_EXPRESSION = "4.1 + 15 * 7 + (28 / 5) ^ 2 = ";

    public static void main(String[] args) {

        // создаем экземпляр класса CalculatorWithCounterAutoComposite путем передачи в конструктор объекта CalculatorWithOperator
        CalculatorWithCounterAutoComposite calculator = new CalculatorWithCounterAutoComposite(new CalculatorWithOperator());

        // создаем экземпляр класса CalculatorWithCounterAutoComposite путем передачи в конструктор объекта CalculatorWithMathCopy
        //CalculatorWithCounterAutoComposite calculator = new CalculatorWithCounterAutoComposite(new CalculatorWithMathCopy());

        // создаем экземпляр класса CalculatorWithCounterAutoComposite путем передачи в конструктор объекта CalculatorWithMathCopy
        //CalculatorWithCounterAutoComposite calculator = new CalculatorWithCounterAutoComposite(new CalculatorWithMathExtends());


        double result1 = calculator.div(28, 5);
        double result2 = calculator.degreeOfDoubleNumber(result1, 2);
        double result3 = calculator.mult(15, 7);
        double result4 = calculator.sum(result2, result3);
        double result5 = calculator.sum(4.1,result4);

        System.out.println(MATH_EXPRESSION + result5);
        System.out.println("Количество математических операций: " + calculator.getCountOperation());



    }
}
