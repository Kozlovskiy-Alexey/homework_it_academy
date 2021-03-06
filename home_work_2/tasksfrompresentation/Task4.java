package homework.home_work_2.tasksfrompresentation;
import java.util.Scanner;

/*
Вывести на экран столько элементов ряда Фибоначчи, сколько указал пользователь. Например,
если на ввод поступило число 6, то вывод должен содержать шесть первых чисел ряда Фибоначчи: 1 2 3 5 8 13.
Ряд Фибоначчи – это последовательность натуральных чисел, где каждое последующее число является суммой двух предыдущих:
1 1 2 3 5 8 13 21 34 55 89 …
В программах ниже первые два элемента ряда равны не по 1 каждый, а 1 и 2.
Поскольку начальные значения должны быть заданы и выведены на экран, то первые два элемента ряда Фибоначчи
выводятся перед циклом. Поэтому цикл начинается с третьего элемента ряда. В самом цикле выполняются следующие действия:
Вывести сумму текущих значений последних двух элементов.
Присвоить предпоследнему элементу значение последнего, а последнему сумму последнего и предпоследнего (это делается через буферную переменную).
Цикл выполняется до тех пор, пока переменная-счетчик, изначально равная 3, не достигнет числа, введенного пользователем.
*/

public class Task4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements Fibonacci: ");
        int amount = scanner.nextInt();
        System.out.print(a + " " + b + " ");
        for (int i = 0; i < amount - 2; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
