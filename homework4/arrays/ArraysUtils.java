package homework.homework4.arrays;
// 2.1. Создать класс ArraysUtils:
//		2.1.1. Написать метод public static int[] arrayFromConsole() рядом с main.
//		Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.
//			2.1.1.1. Пример int[] container = arrayFromConsole(). Результат: В методе arrayFromConsole будет
//			запрошена информация у пользователя, пользователь вводит размер (3) и его элементы по порядку {4, 17, 32}.
//			Соответсвенно будет создан массив размером 3 с элементами {4, 17, 32} и сохранён в переменную container.

//      2.1.2. Написать метод public static int[] arrayRandom(int size, int maxValueExclusion) рядом с main.
//          Данный метод принимает два аргумента. Первый (size) указывает размер массива который мы хотим получить.
//          Второй (maxValueExclusion) указывает до какого числа генерировать рандомные числа.
//			2.1.2.1. Пример: int[] container = arrayRandom(5, 100). Результат: В методе arrayRandom будет создан массив
//			размером 5 с числами от 0 до 99 (использовать класс Random) и сохранён в переменную container.

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    public static void main(String[] args) {

        int[] container = arrayFromConsole();

        for (int e: container) {
            System.out.print(e + " ");
        }
        System.out.println();

        int[] container2 = arrayRandom(10,100);
        for (int e: container2) {
            System.out.print(e + " ");
        }

    }
    public static int[] arrayFromConsole() {

        System.out.println("Enter the size of the array");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("enter element of array " + (i + 1));
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {

        int[] array = new int[size];
        Random random = new Random();
        for (int i  = 0 ; i < size; i++) {
            array[i] = random.nextInt(maxValueExclusion);
        }
        return array;
    }
}
