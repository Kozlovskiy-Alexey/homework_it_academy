package homework.home_work_3.calcs.additional;
import homework.home_work_3.calcs.simple.CalculatorWithMathExtends;

/**
 * Создать класс CalculatorWithCounterClassic.
 * 5.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static). 5.2 Данный класс должен наследовать класс CalculatorWithMathExtends.
 * 5.3 В классе должен быть метод void incrementCountOperation() который должен увеличивать внутренний счётчик в калькуляторе.
 * 5.4 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора.
 * 5.5 Создать класс CalculatorWithCounterClassicMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора
 * и используя методы из данного экземпляра посчитать выражения из задания 1, при каждой математической операции самостоятельно вызывать
 * метод incrementCountOperation() для увеличения счётчика. Вывести в консоль результат.
 */

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    private long counter;

    // метод void incrementCountOperation() должен увеличивать внутренний счётчик counter в калькуляторе
    public void incrementCountOperation() {
        this.counter++;
    }

    // метод long getCountOperation() должен возвращать количество использований данного калькулятора
    public long getCountOperation() {
        return this.counter;
    }

}
