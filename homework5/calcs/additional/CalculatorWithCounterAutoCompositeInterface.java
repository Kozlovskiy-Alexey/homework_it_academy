package homework.homework5.calcs.additional;

import homework.homework5.calcs.api.ICalculator;

/**
 * 9. Создать класс CalculatorWithCounterAutoCompositeInterface.
 * 9.1 Внутри класса нельзя создавать объекты, можно пользоваться только тем что передал вам пользователь вашего класса.
 * 9.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 9.3 В данном классе должен быть только конструктор принимающий объект типа ICalculator
 * 9.4 Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики другим калькуляторам переданным в конструктор
 * 9.5 В классе должны присутствовать все методы объявленные в интерфейсе.
 * 9.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
 * 9.7 Создать класс CalculatorWithCounterAutoCompositeInterfaceMain в котором будет точка входа (main метод).
 * В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания
 * 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 *
 * Вот мы пришли к тому что сочетание композиции и интерфейса нам позволило остановить ту лавину кода, конструкторов и классов...
 * В общем все проблемы которые нас преследовали ранее в предыдущих пунктах нашего задания. Наш код стал простым и соответственно понятным,
 * его легче поддерживать так как теперь наш вариант CalculatorWithCounterAutoCompositeInterface будет работать с любым калькулятором который
 * реализует интерфейс ICalculator. Если вдруг вы захотите выпустить свой калькулятор в виде библиотеки -
 * то в этой библиотеке будет всего лишь два файла CalculatorWithCounterAutoCompositeInterface и ICalculator.
 * Все кто захочет воспользоваться вашими наработками, просто создадут свой калькулятор реализуя интерфейс ICalculator.
 * А логику учёта будут использовать ту что вы написали в классе CalculatorWithCounterAutoCompositeInterface.
 */

public class CalculatorWithCounterAutoCompositeInterface {

    private final ICalculator iCalculator;
    private long countOperation;

    public CalculatorWithCounterAutoCompositeInterface(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }

    public double div(double a, double b) {
        incrementCountOperation();
        return this.iCalculator.div(a, b);
    }

    public double mult(double a, double b) {
        incrementCountOperation();
        return this.iCalculator.mult(a, b);
    }

    public double sub(double a, double b) {
        incrementCountOperation();
        return this.iCalculator.sub(a, b);
    }

    public double sum(double a, double b) {
        incrementCountOperation();
        return this.iCalculator.sum(a, b);
    }

    public double degreeOfDoubleNumber(double a, int b) {
        incrementCountOperation();
        return this.iCalculator.degreeOfDoubleNumber(a, b);
    }

    public double mod(double a) {
        incrementCountOperation();
        return this.iCalculator.mod(a);
    }

    public double squareRoot(double a) {
        incrementCountOperation();
        return this.iCalculator.squareRoot(a);
    }

    public void incrementCountOperation() {
        this.countOperation++;
    }

    public long getCountOperation() {
        return this.countOperation;
    }
}
