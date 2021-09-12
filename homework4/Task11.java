package homework.homework4;/*
Сжать массив, удалив из него все элементы, величина которых находится в интервале [а, b].
Освободившиеся в конце массива элементы заполнить нулями.
Задачу можно разбить на три подзадачи:

Удаление элементов массива, принадлежащих заданному интервалу.
Сдвиг оставшихся элементов.
Заполнение «освободившейся» части массива нулями.
На самом деле первая и вторая подзадача решаются совместно по следующему алгоритму:

В цикле перебираем элементы массива, начиная с первого.
При обнаружении элемента, принадлежащего удаляемому интервалу,
размерность массива уменьшаем на единицу (поэтому лучше использовать цикл while, а не for.),
остальную (правую) часть массива сдвигаем на одну ячейку в лево.
Сдвиг правой части массива выполняется в цикле от текущего индекса элемента до размерности массива.

После того, как все элементы, принадлежащие заданному интервалу будут удалены, следует заполнить конец массива нулями от элемента
с индексом на единицу больше новой размерности массива до количества элементов в «старом» массиве.*/

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        int[] array = {5, 8, 15, 25, -4, 35, 8, 99, 21, 7};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number from range of values");
        int firstValue = scanner.nextInt();
        System.out.println("Enter second number from range of values");
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
        for (int e : array
        ) {
            System.out.print(e + " ");
        }
    }
}

