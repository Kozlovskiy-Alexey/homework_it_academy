package homework.home_work_1.frompresentation;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*Вводятся три разных числа. Найти, какое из них является средним (больше одного, но меньше другого).*/
/*Проверить, лежит ли первое число между двумя другими. При этом может быть два случая:
первое больше второго и первое меньше третьего,
первое меньше второго и первое больше третьего.
Если ни один из вариантов не вернул истину, значит первое число не среднее.
Тогда проверяется, не лежит ли второе число между двумя другими. Это может быть в двух случаях, когда
второе больше первого и меньше третьего,
второе меньше первого и больше третьего.
Если эти варианты также не вернули истину, то остается только один вариант – посередине лежит третье число.
Это при условии, что никакие два числа из трех не могут быть равны между собой. Иначе и здесь надо использовать логические выражения.*/
        boolean inf = true;
        String str = "среднее число - %d%n";

        while (inf) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите число 1");
            int a = scan.nextInt();
            System.out.println("Введите число 2");
            int b = scan.nextInt();
            System.out.println("Введите число 3");
            int c = scan.nextInt();

            if ((a > b && a < c) || (a < b && a > c)) {
                System.out.printf(str, a);
            } else if ((b > a && b < c) || (b < a && b > c)) {
                System.out.printf(str, b);
            } else if (a == b && a == c) {
                System.out.printf("все числа равны - %d%n", a);
            } else if (a == b || b == c) {
                System.out.printf(str, b);
            } else if (a == c && b != a) {
                System.out.printf(str, a);
            } else {
                System.out.printf(str, c);
            }
            System.out.println();
        }
    }
}
