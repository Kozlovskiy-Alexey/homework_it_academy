package homework.home_work_3.calcs.additional;

import homework.home_work_3.calcs.api.ICalculator;

/**
 * Создать CalculatorWithMemory.
 * 10.1 Данный калькулятор предназначен для того чтобы расширить возможности калькулятора и обеспечить его дополнительной функцией памяти.
 * В принципе работает как калькулятор из реальной жизни.
 * 10.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 10.3 Данный класс напрямую не умеет считать математику.
 * 10.4 В классе должны присутствовать математические методы:
 * 10.4.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
 * 10.4.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 * 10.5 Функция памяти работает через методы:
 * 10.5.1 Записать в память результат выполнения последнего вызванного метода. У данного метода не должно быть параметров.
 * Данный метод вызывается непосредтвенно пользователем, а не автоматический.
 * 10.5.2 Получить из памяти записанное значение. При получении записи из памяти память стирается, при записи нового значения память перезаписывается.
 * Данный метод вызывается непосредтвенно пользователем, а не автоматический.
 * 10.6 Создать класс CalculatorWithMemoryMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора и
 * используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат. В мэйне запрещается использование
 * переменных для хранения значений участвующих в просчёте, а также результатов работы методов калькулятора, можно использовать
 * только литералы и метод получения из памяти записанного значения.
 */

public class CalculatorWithMemory {

    private ICalculator iCalculator;
    private double result;
    private double memory;

    public CalculatorWithMemory(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }

    // деление
    public double div(double a, double b) {
        this.result = iCalculator.div(a, b);
        return this.result;
    }

    // умножение
    public double mult(double a, double b) {
        this.result = iCalculator.mult(a, b);
        return this.result;
    }

    // вычитание
    public double sub(double a, double b) {
        this.result = iCalculator.sub(a, b);
        return this.result;
    }

    // сложение
    public double sum(double a, double b) {
        this.result = iCalculator.sum(a, b);
        return this.result;
    }

    //метод возведение в целую степень дробного положительного числа
    public double degreeOfDoubleNumber(double a, int b) {
        this.result = iCalculator.degreeOfDoubleNumber(a, b);
        return this.result;
    }

    // метод модуль числа
    public double mod(double a) {
        this.result = iCalculator.mod(a);
        return this.result;
    }

    // метод квадратный корень из числа
    public double squareRoot(double a) {
        this.result = iCalculator.squareRoot(a);
        return this.result;
    }

    public void writeToMemory() {
        this.memory = this.result;
    }

    public double getMemory() {
        double tempMemory = this.memory;
        this.memory = 0;
        return tempMemory;
    }
}
