package homework.homework5.calcs.simple;

import homework.homework5.calcs.api.ICalculator;

/**
 * Создать класс CalculatorWithOperator.
 * 2.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 2.2 В классе должны присутствовать математические методы:
 * 2.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение) каждый из этих методов должен
 * принимать два параметра (определитесь с их типами) и должны возвращать результат (определиться с возвращаемым типом результата) при помощи ключевого слово return.
 * 2.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Квадратный корень из числа).
 * 2.3 В методах можно использовать любые арифметические операторы.
 * 2.4 Использование библиотеки Math ЗАПРЕЩЕНО! (кроме извлечения корня). Если у Вас плохо с математикой, то для реализации метода
 * "Квадратный корень из числа" можно воспользоваться библиотекой Math.
 * 2.5 Создать класс CalculatorWithOperatorMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр
 * калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат.
 */

public class CalculatorWithOperator implements ICalculator {

    // method division
    @Override
    public double div(double a, double b) {
        return a / b;
    }

    // method multiplication
    @Override
    public double mult(double a, double b) {
        return a * b;
    }

    // method subtraction
    @Override
    public double sub(double a, double b) {
        return a - b;
    }

    // method addition
    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    //метод возведение в целую степень дробного положительного числа
    @Override
    public double degreeOfDoubleNumber(double a, int b) {

        double result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    // метод модуль числа
    @Override
    public double mod(double a) {
        if (a > 0) return a;
        else return -a;
    }

    // метод квадратный корень из числа
    @Override
    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

}
