package homework.home_work_2.loops;
import java.util.Scanner;

// 1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
// Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
// Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
// использовать цикл

public class Task1p1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        int prod = 1;

        for (int i = 1; i <= num; i++) {
            prod *= i;
        }
        toShowResult(num);
        System.out.println(prod);
    }

    public static void toShowResult(int c) {
        for (int i = 1; i <= c; i++) {
            if (i >= 1 && i < c) {
                System.out.print(i + " * ");
            } else System.out.print(i + " = ");
        }
    }
}
