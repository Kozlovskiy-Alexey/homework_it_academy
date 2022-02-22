package homework.home_work_2.arrays;

import homework.home_work_2.arrays.api.IArraysOperation;

public class DoWhileOperation implements IArraysOperation {

    @Override
    public void showAllElementsOfArray(int[] arr) {
        int count = 0;
        boolean space = false;
        do {
            if (space) {
                System.out.print(" ");
            } else {
                space = true;
            }
            System.out.print(arr[count]);
            count++;
        } while (count < arr.length);
        System.out.println();
    }

    @Override
    public void everySecondElementToConsole(int[] arr) {
        int count = 0;
        boolean space = false;
        do {
            if (count % 2 != 0) {
                if (space) {
                    System.out.print(" ");
                } else {
                    space = true;
                }
                System.out.print(arr[count]);
            }
            count++;
        } while (count < arr.length);
        System.out.println();
    }

    @Override
    public void arrayReverse(int[] arr) {
        int count = arr.length - 1;
        boolean space = false;
        do {
            if (space) {
                System.out.print(" ");
            } else {
                space = true;
            }
            System.out.print(arr[count]);
            count--;
        } while (count >= 0);

        System.out.println();
    }
}
