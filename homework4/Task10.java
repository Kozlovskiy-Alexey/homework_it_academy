package homework.homework4;
/*В одномерном массиве целых чисел определить два наименьших элемента.
Они могут быть как равны между собой (оба являться минимальными), так и различаться.*/

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        int amount;
        int[] arr;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount elements in array:");
        amount = scanner.nextInt();

        arr = new int[amount];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element of array № " + i + " : ");
            arr[i] = scanner.nextInt();
        }
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
        System.out.printf("minimum elements in array are: arr[%d] = %d  arr[%d] = %d", min2, arr[min2], min, arr[min]);


    }
}
