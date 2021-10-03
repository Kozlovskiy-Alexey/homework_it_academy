package homework.home_work_2.tasksfrompresentation;
import java.util.Scanner;

/*
Посчитать четные и нечетные цифры введенного натурального числа.
Например, если введено число 34560, то у него 3 четные цифры (4, 6 и 0) и 2 нечетные (3 и 5).

Присвоить переменным-счетчикам четных (even) и нечетных (odd) цифр значение 0.
Пока введенное число не уменьшится до нуля выполнять нижеследующие действия:
Если число четное (делится нацело на 2), значит последняя его цифра четная и надо увеличить на 1 переменную even.
Иначе число нечетное и следует добавить 1 к переменной odd.
Убрать последнюю цифру числа путем деления числа нацело на 10.*/

public class Task3 {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        while (number > 0) {
            if (number % 2 == 0) {
                even++;
            }
            else odd++;
            number /= 10;
        }
        System.out.println("amount of even numbers is " + even);
        System.out.println("amount of odd numbers is " + odd);
    }
}
