package homework.home_work_1.frompresentation;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*Определить, является ли год, который ввел пользователем, високосным или невисокосным.
Високосные года делятся нацело на 4. Однако из этого правила есть исключение: столетия, которые не делятся нацело на 400, високосными не являются.
В високосном годе 366 дней, в обычном 365.
Если год не делится на 4, значит он обычный.
Иначе надо проверить не делится ли год на 100.
Если не делится, значит это не столетие и можно сделать вывод, что год високосный.
Если делится на 100, значит это столетие и его следует проверить его делимость на 400.
Если год делится на 400, то он високосный.
Иначе год обычный.
Проверки можно проводить последовательно, а можно группировать через логические операторы “И” и “ИЛИ”. Поэтому способов решения задачи может быть несколько.*/
// leap year % 4 = 0 &&  year % 400 == 0
        Scanner scan = new Scanner(System.in);
        int exit = 1;

        while (exit != 0) {
            System.out.println("Leap year checker v.1.0");
            System.out.println("-----------------------");
            System.out.print("Enter a year (exit - 0): ");

            int year = scan.nextInt();

            if (year == 0) {
                exit = 0;
            } else if (year % 4 > 0) {
                System.out.println("Normal year\n");
            } else {
                if (year % 100 > 1) {
                    System.out.println("Leap year\n");
                } else if (year % 400 == 0) {
                    System.out.println("Leap year\n");
                } else
                    System.out.println("Normal year\n");
            }
        }
    }
}

