package homework.homework5.calcs.simple;

/**
 * Создать класс CalculatorWithMathCopy.
 * 	3.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 	3.2 В классе должны присутствовать математические методы:
 * 		3.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение). Скопировать базовые математические операции из CalculatorWithOperator.
 * 		3.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 * 		Данные методы должны содержать в своём теле вызов библиотеки Math и возврат полученного результата.
 * 	3.3 Создать класс CalculatorWithMathCopyMain в котором будет точка входа (main метод).
 * 	В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат.
 */


public class CalculatorWithMathCopy {

    // method division
    public double div(double a, double b) {
        return a / b;
    }

    // method multiplication
    public double mult(double a, double b) {
        return a * b;
    }

    // method subtraction
    public double sub(double a, double b) {
        return a - b;
    }

    // method addition
    public double add(double a, double b) {
        return a + b;
    }

    //метод возведение в целую степень дробного положительного числа
    public double degreeOfDoubleNumber(double a, int b) {
        return Math.pow(a, b);
    }

    // метод модуль числа
    public double mod(double a) {
        return Math.abs(a);
    }

    // метод квадратный корень из числа
    public double squareRoot(double a) {
        return Math.sqrt(a);
    }
}
