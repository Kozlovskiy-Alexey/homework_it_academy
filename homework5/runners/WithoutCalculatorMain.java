package homework.homework5.runners;

/**
 * Посчитать следующие выражения:
 * 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль. Внимание, знак "^" обозначает возведение в степень.
 */


public class WithoutCalculatorMain {
    public static void main(String[] args) {
        double a = 4.1;
        int b = 15;
        int c = 7;
        double d = 28;
        int e = 5;
        int p = 2;

        double result = a + b * c + Math.pow(d / e, p);
        System.out.printf("%.2f", result);

    }
}
