package homework.home_work_2.arrays;

import homework.home_work_2.utils.ArraysUtils;
import java.util.Scanner;

/**
 * 2.4 Задачи Все задачи в одном классе, в отдельных методах. Для создания массивов использовать ранее созданный arrayRandom.
 * 2.4.1. Сумма четных положительных элементов массива
 * 2.4.2. Максимальный из элементов массива с четными индексами
 * 2.4.3. Элементы массива, которые меньше среднего арифметического
 * 2.4.4. Найти два наименьших (минимальных) элемента массива
 * 2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
 * 2.4.6. Сумма цифр массива
 */
public class ArrayTaskMain {
    public static void main(String[] args) {

        int[] array = ArraysUtils.arrayRandom(10, 100);
        System.out.println("сгенерированный массив:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

//           Сумма четных положительных элементов массива
        int sum = ArrayTaskMain.sumPositiveNumbers(array);
        System.out.println("Сумма четных положительных элементов массив = " + sum);

//        Максимальный из элементов массива с четными индексами
        int index = ArrayTaskMain.maxIndex(array);
        System.out.println("Максимальный из элементов массива с четными индексами = " + index);

//          Элементы массива, которые меньше среднего арифметического
        ArrayTaskMain.valueLessSumAverage(array);
        System.out.println();

//          Найти два наименьших (минимальных) элемента массива
        ArrayTaskMain.twoMinElements(array);
        System.out.println();

//          Сжать массив, удалив элементы, принадлежащие интервалу
        ArrayTaskMain.compressArray(array);
        System.out.println();

//          Сумма цифр массива
        ArrayTaskMain.sumAllElements(array);

    }

    //    Сумма четных положительных элементов массива
    public static int sumPositiveNumbers(int[] arr) {
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] > 0) {
                summ += arr[i];
            }
        }
        return summ;
    }

    //    Максимальный из элементов массива с четными индексами
    public static int maxIndex(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i += 2) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    //    Элементы массива, которые меньше среднего арифметического
    public static void valueLessSumAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int average = sum / arr.length;
        System.out.print("Элементы массива, которые меньше среднего арифметического: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    //    Найти два наименьших (минимальных) элемента массива
    public static void twoMinElements(int[] arr) {
        int min;
        int min2;
        if (arr[0] <= arr[1]) {
            min = 0;
        } else {
            min = 1;
        }
        min2 = 1;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] <= arr[min]) {
                min2 = min;
                min = i;
            }
        }
        System.out.printf("Два наименьших (минимальных) элемента массива arr[%d] = %d  arr[%d] = %d", min2, arr[min2], min, arr[min]);
    }

    //    Сжать массив, удалив элементы, принадлежащие интервалу
    public static void compressArray(int[] array) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число из диапазона:");
        int firstValue = scanner.nextInt();
        System.out.println("Введите второе число из диапазона:");
        int secondValue = scanner.nextInt();

        int i = 0;
        int m = array.length;

        while (i < m) {
            if (array[i] >= firstValue && array[i] <= secondValue) {
                m--;
                for (int j = i; j < m; j++) {
                    array[j] = array[j + 1];
                }
            } else i++;
        }
        for (int k = m; k < array.length; k++) {
            array[k] = 0;
        }
        System.out.println("Массив после удаления элементов, принадлежащие интервалу [" + firstValue + " - " + secondValue + "]");
        for (int e : array
        ) {
            System.out.print(e + " ");
        }
    }

        //    Сумма цифр массива
    public static void sumAllElements(int[] arr) {
        int sum = 0;
        int num;

        for (int i = 0; i < arr.length; i++) {
            num = arr[i];
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
        }
        System.out.println("Сумма цифр массива = " + sum);
    }
}



