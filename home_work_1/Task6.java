package homework.home_work_1;


/**
 *Создать СТАТИЧЕСКИЙ метод createPhoneNumber рядом с методом main, данный метод будет принимает один параметр
 * и будет возвращать строку в отформатированном виде. В метод будет передаваться массив из 10 цифр (от 0 до 9).
 * Данные цифры должны быть помещены в строку формата: (XXX) XXX-XXXX. Например передан массив: {1,2,3,4,5,6,7,8,9,0},
 * возвращаемый результат: (123) 456-7890. (Взято с https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java).
 * В задании нельзя использовать колекции, стрима.
 */
public class Task6 {
    public static void main(String[] args) {

        int[] arr = new int[]{3,7,5,2,9,6,7,6,7,9};
        String phoneNumber = Task6.createPhoneNumber(arr);
        System.out.println(phoneNumber);
    }

    /**
     * метод преобразует массив чисел в телефонный номер
     * @param arr массив чисел
     * @return строка в виде телефонного номера
     */
    public static String createPhoneNumber(int[] arr) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8]
                ,arr[9]);
    }
}
