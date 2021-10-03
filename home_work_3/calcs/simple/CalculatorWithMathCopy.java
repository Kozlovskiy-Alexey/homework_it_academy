package homework.home_work_3.calcs.simple;

import homework.home_work_3.calcs.api.ICalculator;

/**
 * Создать класс CalculatorWithMathCopy.
 * 3.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 3.2 В классе должны присутствовать математические методы:
 * 3.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение). Скопировать базовые математические операции из CalculatorWithOperator.
 * 3.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 * Данные методы должны содержать в своём теле вызов библиотеки Math и возврат полученного результата.
 * 3.3 Создать класс CalculatorWithMathCopyMain в котором будет точка входа (main метод).
 * В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат.
 */

public class CalculatorWithMathCopy implements ICalculator {

    // метод деление
    @Override
    public double div(double a, double b) {
        return a / b;
    }

    // метод умножение
    @Override
    public double mult(double a, double b) {
        return a * b;
    }

    // метод вычитание
    @Override
    public double sub(double a, double b) {
        return a - b;
    }

    // метод сложение
    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    // метод возведение в целую степень дробного положительного числа
    @Override
    public double degreeOfDoubleNumber(double a, int b) {
        return Math.pow(a, b);
    }

    // метод модуль числа
    @Override
    public double mod(double a) {
        return Math.abs(a);
    }

    // метод квадратный корень из числа
    @Override
    public double squareRoot(double a) {
        return Math.sqrt(a);
    }
}
