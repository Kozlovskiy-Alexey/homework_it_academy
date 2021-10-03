package homework.home_work_3.runners;
import homework.home_work_3.calcs.simple.CalculatorWithOperator;

/**
 * 2.5 Создать класс CalculatorWithOperatorMain в котором будет точка входа (main метод).
 * В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
 * Вывести в консоль результат.
 */

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {

        CalculatorWithOperator calculator = new CalculatorWithOperator();

        //деление
        System.out.println(calculator.div(500, 5));

        //умножение
        System.out.println(calculator.mult(25, 4));

        //вычитание
        System.out.println(calculator.sub(110, 10));

        //сложение
        System.out.println(calculator.sum(55, 45));

        //возведение в степень
        System.out.println(calculator.degreeOfDoubleNumber(10, 2));

        //модуль числа
        System.out.println(calculator.mod(-100));

        //квадратный корень
        System.out.println(calculator.squareRoot(10000));
    }
}
