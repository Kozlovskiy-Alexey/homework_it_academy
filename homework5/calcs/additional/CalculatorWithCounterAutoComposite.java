package homework.homework5.calcs.additional;

import homework.homework5.calcs.simple.CalculatorWithMathCopy;
import homework.homework5.calcs.simple.CalculatorWithMathExtends;
import homework.homework5.calcs.simple.CalculatorWithOperator;

/**
 * 7. Создать класс CalculatorWithCounterAutoComposite.
 * 7.1 Внутри класса нельзя создавать объекты, можно пользоваться только тем что передал вам пользователь вашего класса.
 * 7.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 7.3 В данном классе должны быть следующие варианты конструктора:
 * 7.3.1 Принимающий объект типа CalculatorWithOperator
 * 7.3.2 Принимающий объект типа CalculatorWithMathCopy
 * 7.3.3 Принимающий объект типа CalculatorWithMathExtends
 * 7.4 Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики другим калькуляторам переданным в конструктор
 * 7.5 В классе должны присутствовать математические методы:
 * 7.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
 * 7.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 * 7.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора.
 * При вызове данного метода счётчик учёта не увеличивается.
 * 7.7 Создать класс CalculatorWithCounterAutoCompositeMain в котором будет точка входа (main метод). В main методе требуется создать
 * экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
 * Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */

public class CalculatorWithCounterAutoComposite {

    private CalculatorWithOperator cwo;
    private CalculatorWithMathCopy cwmc;
    private CalculatorWithMathExtends cwme;

    private long countOperation;

    public CalculatorWithCounterAutoComposite(CalculatorWithOperator cwo) {
        this.cwo = cwo;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy cwmc) {
        this.cwmc = cwmc;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends cwme) {
        this.cwme = cwme;
    }

    public double div(double a, double b) {

        incrementCountOperation();

        double result = 0;
        if (this.cwo != null) {
            result = cwo.div(a, b);
        }
        if (this.cwmc != null) {
            result = cwmc.div(a, b);
        }
        if (this.cwme != null) {
            result = cwme.div(a, b);
        }
        return result;
    }

    public double mult(double a, double b) {

        incrementCountOperation();

        double result = 0;
        if (this.cwo != null) {
            result = cwo.mult(a, b);
        }
        if (this.cwmc != null) {
            result = cwmc.mult(a, b);
        }
        if (this.cwme != null) {
            result = cwme.mult(a, b);
        }
        return result;
    }

    public double sub(double a, double b) {

        incrementCountOperation();

        double result = 0;
        if (this.cwo != null) {
            result = cwo.sub(a, b);
        }
        if (this.cwmc != null) {
            result = cwmc.sub(a, b);
        }
        if (this.cwme != null) {
            result = cwme.sub(a, b);
        }
        return result;
    }

    public double sum(double a, double b) {

        incrementCountOperation();

        double result = 0;
        if (this.cwo != null) {
            result = cwo.sum(a, b);
        }
        if (this.cwmc != null) {
            result = cwmc.sum(a, b);
        }
        if (this.cwme != null) {
            result = cwme.sum(a, b);
        }
        return result;
    }

    public double degreeOfDoubleNumber(double a, int b) {

        incrementCountOperation();

        double result = 0;
        if (this.cwo != null) {
            result = cwo.degreeOfDoubleNumber(a, b);
        }
        if (this.cwmc != null) {
            result = cwmc.degreeOfDoubleNumber(a, b);
        }
        if (this.cwme != null) {
            result = cwme.degreeOfDoubleNumber(a, b);
        }
        return result;
    }

    public double mod(double a) {

        incrementCountOperation();

        double result = 0;
        if (this.cwo != null) {
            result = cwo.mod(a);
        }
        if (this.cwmc != null) {
            result = cwmc.mod(a);
        }
        if (this.cwme != null) {
            result = cwme.mod(a);
        }
        return result;
    }

    public double squareRoot(double a) {

        incrementCountOperation();

        double result = 0;
        if (this.cwo != null) {
            result = cwo.squareRoot(a);
        }
        if (this.cwmc != null) {
            result = cwmc.squareRoot(a);
        }
        if (this.cwme != null) {
            result = cwme.squareRoot(a);
        }
        return result;
    }

    public void incrementCountOperation() {
        this.countOperation++;
    }

    public long getCountOperation() {
        return this.countOperation;
    }
}


