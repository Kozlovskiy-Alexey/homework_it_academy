package homework.home_work_2.arrays;

import homework.home_work_2.arrays.api.IArraysOperation;

public class ForOperation implements IArraysOperation {
    @Override
    public void showAllElementsOfArray(int[] arr) {
        boolean space = false;
        for (int i = 0; i < arr.length; i++) {
            if (space) {
                System.out.print(" ");
            } else {
                space = true;
            }
            System.out.print(arr[i]);
        }
    }

    @Override
    public void everySecondElementToConsole(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            
        }
    }

    @Override
    public void arrayReverse(int[] arr) {

    }
}
