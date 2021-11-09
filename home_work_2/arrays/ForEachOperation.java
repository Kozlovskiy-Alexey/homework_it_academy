package homework.home_work_2.arrays;

import homework.home_work_2.arrays.api.IArraysOperation;

public class ForEachOperation implements IArraysOperation {
    @Override
    public void showAllElementsOfArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    @Override
    public void everySecondElementToConsole(int[] arr) {
        int counter = 0;
        for (int i : arr) {
            if (counter % 2 != 0) {
                System.out.print(i + " ");
            }
            counter++;
        }
        System.out.println();
    }

    @Override
    public void arrayReverse(int[] arr) {
        
        StringBuilder stringBuilder = new StringBuilder();
        boolean space = false;
        for (int i : arr) {
            if (space) {
                stringBuilder.append(" ");
            } else {
                space = true;
            }
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder.reverse());
    }
}
