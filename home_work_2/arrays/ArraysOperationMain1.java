package homework.home_work_2.arrays;

public class ArraysOperationMain1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        DoWhileOperation doWhileOperation = new DoWhileOperation();
        doWhileOperation.showAllElementsOfArray(arr);
        doWhileOperation.everySecondElementToConsole(arr);
        doWhileOperation.arrayReverse(arr);

        ForEachOperation forEachOperation = new ForEachOperation();
        forEachOperation.showAllElementsOfArray(arr);
        forEachOperation.everySecondElementToConsole(arr);
        forEachOperation.arrayReverse(arr);

        ForEachOperation forEachOperation1 = new ForEachOperation();
        forEachOperation.showAllElementsOfArray(arr);

    }
}
