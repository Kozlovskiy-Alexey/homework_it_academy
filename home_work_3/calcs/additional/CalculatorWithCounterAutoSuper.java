package homework.home_work_3.calcs.additional;

import homework.home_work_3.calcs.simple.CalculatorWithMathExtends;

/**
 * Создать класс CalculatorWithCounterAutoSuper.
 * 6.1 Все методы и поля объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 6.2 Данный класс наследует класс CalculatorWithMathExtends.
 * 6.3 Данный класс переопределяет все методы полученные в результате наследования и в этих методах должен быть
 * реализован механизм учёта их использования (учёт общий для всех методов класса), а вместо реализации математики
 * при помощи ключевого слова super вызывает данный метод у родителя. Например вызвали метод plus(7, 3) который
 * должен сложить два числа и вернуть результат сложения. Внутри метода plus() пишем реализацию учета, а после
 * делаем вызов super.plus(7, 3). Использование super позволит вызвать реализацию из родительского класса.
 * 6.4 В классе должен быть метод long getCountOperation() который должен возвращать количество использований
 * данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
 * 6.5 Создать класс CalculatorWithCounterAutoSuperMain в котором будет точка входа (main метод). В main методе
 * требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения
 * из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private long countOperation;

    @Override
    public double div(double a, double b) {
        incrementCountOperation();
        return super.div(a, b);
    }

    @Override
    public double mult(double a, double b) {
        incrementCountOperation();
        return super.mult(a, b);
    }

    @Override
    public double sub(double a, double b) {
        incrementCountOperation();
        return super.sub(a, b);
    }

    @Override
    public double sum(double a, double b) {
        incrementCountOperation();
        return super.sum(a, b);
    }

    @Override
    public double degreeOfDoubleNumber(double a, int b) {
        incrementCountOperation();
        return super.degreeOfDoubleNumber(a, b);
    }

    @Override
    public double mod(double a) {
        incrementCountOperation();
        return super.mod(a);
    }

    @Override
    public double squareRoot(double a) {
        incrementCountOperation();
        return super.squareRoot(a);
    }

    private void incrementCountOperation() {
        this.countOperation++;
    }

    public long getCountOperation() {
        return this.countOperation;
    }

}
