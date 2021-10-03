package homework.home_work_2.sorts;

// сортировка массива пузырьком

public class SortArrayByBubble {
    public static void main(String[] args) {

        int[] array = {25, 34, 0, -1, 100, -25, 78, 15};
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
                    for (int e : array
                    ) {
                        System.out.print(e + " ");
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }

        for (int i : array) {
            System.out.print(i + " ");

        }
    }
}
