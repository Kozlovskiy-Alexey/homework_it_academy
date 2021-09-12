package homework.homework4;/*
В массиве, содержащем положительные и отрицательные целые числа, вычислить сумму четных положительных элементов.
В цикле проверяем каждый элемент массива на четность и положительность. Данные условия можно скомбинировать через логическое «И»
в заголовке одного условного оператора или использовать два (один вложен в другой) отдельных каждый со своим условием.
Если элемент массива удовлетворяет обоим условиям, то его значение добавляется к переменной,
в которой хранится сумма. После цикла ее значение выводится на экран.
Ноль является четным числом, однако он не относится к положительным. Поэтому проверка на положительность — это «больше 0»,
а не «больше или равно 0». Хотя это не столь важно, так как добавление нуля к сумме ничего не меняет.
Проверку на четность можно выполнить с помощью нахождения остатка от деления на 2.
Если остаток равен нулю, то число четное. В ряде языков есть специальные функции, проверяющие четное число или нечетное.*/

public class Task7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] > 0) {
                summ += arr[i];
            }
        }
        System.out.println("sum of even positive numbers is " + summ);
    }
}
