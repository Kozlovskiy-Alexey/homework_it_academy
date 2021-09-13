package homework.homework4.loops;
// 1.3. Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число
//      мы будем возводить, Второе число это степень в которую возводят первое число. Степень - только положительная и целая.
//      Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
//		1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
//		1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25

import java.util.Scanner;

public class Task1p3 {
    public static void main(String[] args) {

        double a;
        int b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a double number");
        a = scanner.nextDouble();
        System.out.println("Enter a power");
        b = scanner.nextInt();
        System.out.println(a + " ^ " + b + " = " + powOfNumber(a,b));

    }

    public static double powOfNumber(double a, int  b) {
        int count = b;
        double result = a;
        while (count > 1) {
            result *= a;
            count--;
        }
        return result;
    }
}
