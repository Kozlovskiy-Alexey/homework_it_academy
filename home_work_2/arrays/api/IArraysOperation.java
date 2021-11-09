package homework.home_work_2.arrays.api;

public interface IArraysOperation {

    /**
     * Метод выводит все элементы в консоль
     * @param arr массив чисел
     */
    void showAllElementsOfArray(int[] arr);

    /**
     * Метод выводит каждый второй элемент массива в консоль.
     * @param arr передаваемый массив
     */
    void everySecondElementToConsole(int[] arr);

    /**
     * Выводит все элементы массива в консоль в обратном порядке
     * @param arr передаваемый массив
     */
    void arrayReverse(int[] arr);

}
