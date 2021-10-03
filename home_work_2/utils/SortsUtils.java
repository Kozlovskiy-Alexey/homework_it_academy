package homework.home_work_2.utils;

/**
 * 4.* Выполнить сортировку массива с числами:
 * 4.1. После каждой сортировки в консоли у вас должно получиться "[Какой массив был до сортировки] ->
 * [Каким стал массив после сортировки]". Для преобразования массива в текст можно использовать класс Arrays.
 * 4.2. Создать класс SortsUtils. Пишем в нём следующие алгоритмы:
 * 4.2.1. Пузырьковая сортировка
 * 4.2.2. Шейкерная сортировка
 * 4.3. Для тестов используем предварительно созданные массивы (в коде ваши тесты должны остаться):
 * 4.3.1. {1,2,3,4,5,6}
 * 4.3.2. {1,1,1,1}
 * 4.3.3. {9,1,5,99,9,9}
 * 4.3.4. {}
 * 4.4. После тестов написать код который будет массив через ранее созданный arrayRandom. Отсортировать.
 * 4.5. После рандома написать код который будет создавать массив через ранее созданный arrayFromConsole. Отсортировать.
 */
public class SortsUtils {
    public static void main(String[] args) {

//      Для тестов используем предварительно созданные массивы
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 1, 1, 1};
        int[] arr3 = {9, 1, 5, 99, 9, 9};
        int[] arr4 = {};

//        пузырьковая сортировка
//        SortsUtils.sortByBubble(arr1);
//        SortsUtils.sortByBubble(arr2);
//        SortsUtils.sortByBubble(arr3);
//        SortsUtils.sortByBubble(arr4);

//        шейкерная сортировка
        SortsUtils.shakerSort(arr1);
        SortsUtils.shakerSort(arr2);
        SortsUtils.shakerSort(arr3);
        SortsUtils.shakerSort(arr4);


//      Написать код, который будет создавать массив через ранее созданный arrayRandom. Отсортировать
        int[] arr5 = ArraysUtils.arrayRandom(10, 100);
        SortsUtils.sortByBubble(arr5);

//      Написать код, который будет создавать массив через ранее созданный arrayFromConsole. Отсортировать
        int[] arr6 = ArraysUtils.arrayFromConsole();
        SortsUtils.sortByBubble(arr6);

        int[] arr7 = ArraysUtils.arrayFromConsole();
        SortsUtils.shakerSort(arr7);

    }

    // пузырьковая сортировка

    public static void sortByBubble(int[] array) {
        System.out.println("[Какой массив был до сортировки]");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();

        int temp;
        boolean isTrue = false;

        while (!isTrue) {
            isTrue = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    isTrue = false;
                }
            }
        }
        System.out.println("[Каким стал массив после сортировки] ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void shakerSort(int[] array) {
        int left = 0;
        int right = array.length - 1;
        int temp = 0;

        System.out.println("[Какой массив был до сортировки]");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
        while (left <= right) {
            for (int i = right; i > left; i--) {
                if (array[i - 1] > array[i]) {

                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            left++;
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i - 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
            right--;
        }
        System.out.println("[Каким стал массив после сортировки] ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void showArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
