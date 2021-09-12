package homework.homework4;
// сортировка массива выбором

public class SortArrayBySelection {
    public static void main(String[] args) {

        int[] array = {25, 38, 44, 0, -58, 3, 15};
        int min;
        int temp;

        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
            for (int e : array) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
        for (int e : array) {
            System.out.print(e + " ");
        }


    }
}
