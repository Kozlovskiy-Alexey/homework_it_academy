package homework.home_work_2.loops;

/**
 * 1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе. Есть нюанс с
 * переполнением, можно добавить проверки и сообщения пользователю. Пример: Ввели 5, должно получиться в консоли:
 * 1 * 2 * 3 * 4 * 5 = ответ
 * 1.1.2.* Используя рекурсию
 */
public class Task1p1p2Recursion {

    public long multiplyWithRecursion(long n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        return multiplyWithRecursion(n - 1) * n;
    }
}
