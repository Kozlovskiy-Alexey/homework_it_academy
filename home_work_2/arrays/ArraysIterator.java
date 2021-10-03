package homework.home_work_2.arrays;
import homework.home_work_2.utils.ArraysUtils;

/**
 *  2.2 Перебор массива при помощи do....while, while, for, foreach. Элементы массива вводить используя ранее созданный arrayFromConsole.
 *  Все задачи в одном классе, в отдельных методах. Должно получиться 3 метода (что такое метод https://metanit.com/java/tutorial/2.7.php):
 * 		2.2.1. Вывести все элементы в консоль.
 * 		2.2.2. Вывести каждый второй элемент массива в консоль.
 *      2.2.3. Вывести все элементы массива в консоль в обратном порядке.
 */

public class ArraysIterator {
    public static void main(String[] args) {


        int[] array = ArraysUtils.arrayFromConsole();

        // 2.2.1. Вывести все элементы в консоль.
        showAllElementsOfArray(array);

        // 2.2.2. Вывести каждый второй элемент массива в консоль.
        everySecondElementToConsole(array);

        // 2.2.3. Вывести все элементы массива в консоль в обратном порядке.
        arrayReverse(array);

    }

    public static void showAllElementsOfArray(int[] arr) {
        for (int e: arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void everySecondElementToConsole(int[] arr) {
        for (int i = 1; i < arr.length; i+=2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void arrayReverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
