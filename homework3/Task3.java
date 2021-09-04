package homework.homework3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
/*Вводятся два целых числа не равных нулю. Проверить делится ли первое на второе.
Вывести на экран сообщение об этом, а также остаток (если он есть) и частное (в любом случае).
Если первое число нацело делится на второе, то вывести сообщение об этом.
Иначе вывести сообщение о том, что первое число не делится на второе, найти остаток от деления и также вывести его.
В конце программы найти частное от деления чисел и вывести его.*/
        boolean inf = true;
        int c;
        int quotient;

        while (inf) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите число 1 не равное нулю");
            int a = scan.nextInt();
            System.out.println("Введите число 2 не равное нулю");
            int b = scan.nextInt();

            if (a == 0 | b == 0) {
                System.out.println("Вы ввели число равное нулю! Введите другое число");
            } else if (a % b != 0) {
                c = a % b;
                quotient = a / b;
                System.out.printf("число %d не делится на число %d, остаток равен %d, частное равно %d%n", a, b, c, quotient);
            } else if (a % b == 0) {
                quotient = a / b;
                System.out.printf("число %d делится на число %d, частное равно %d%n", a, b, quotient);
            }
            System.out.println();
        }
    }
}
