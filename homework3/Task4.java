package homework.homework3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
/*Перевести число, введенное пользователем, в байты или килобайты в зависимости от его выбора.
В данной задаче пользователь должен ввести два значения:
само число и как-либо указать, во что он хочет его перевести (в байты или килобайты).
Пусть выбор способа перевода указывается с помощью одного из двух символов. Например,
если пользователь введет букву “b”, то число будет переводиться в байты, а если букву “k”,
то в килобайты.
Тогда алгоритм решения задачи будет следующим:
Ввести число.
Указать направление перевода.
Если выбран перевод в байты, то надо умножить число на 1024.
Если выбран перевод в килобайты, то надо разделить число на 1024.
В данной задаче нельзя оставлять второй случай без проверки,
т.е. использовать исключительно ветку else,
т.к. пользователь может ввести что угодно. Поэтому надо использовать либо две отдельные ветки if,
либо вложенную в else вторую проверку через if.
С точки зрения наиболее оптимального кода второй вариант предпочтительнее,
т.к. в случае срабатывания первого if второй проверяться не будет.
Данную задачу проще решить с помощью оператор выбора case, а не if. */

        Scanner scan = new Scanner(System.in);
        int exit = 1;
        int kb;
        int b;

        while (exit != 0) {
            System.out.println("Numbers converter v.1.0");
            System.out.println("-----------------------");
            System.out.println("What would you like to do?\n" +
                    "1. convert KByte to Byte - enter 1\n" +
                    "2. convert Byte to KByte - enter 2\n" +
                    "exit - enter 0\n");
            int a = scan.nextInt();

            if (a == 1 | a == 2) {
                switch (a) {
                    case 1: {
                        System.out.print("Enter a number in KBytes: ");
                        kb = scan.nextInt();
                        b = kb * 1024;
                        System.out.println("--------------------");
                        System.out.printf("%d KByte = %d Byte%n", kb, b);
                        System.out.println("--------------------");
                        break;
                    }
                    case 2: {
                        System.out.print("Enter a number in Bytes: ");
                        b = scan.nextInt();
                        kb = b / 1024;
                        System.out.println("--------------------");
                        System.out.printf("%d Byte = %d KByte%n", b, kb);
                        System.out.println("--------------------");
                        break;
                    }
                }
            } else if (a == 0) {
                exit = 0;
            } else {
                System.out.println("Wrong doing! Enter numbers 1 or 2!!");
            }

        }
    }
}

