package homework.home_work_2.loops;
import java.util.Scanner;

// 1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль.
// Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
//		1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
//		1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
//		1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число

public class Task1p2 {
    public static void main(String[] args) {

        int prov = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number");

        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            toShowResult(num);
            while (num > 0) {
                prov *= num % 10;
                num /= 10;
            }
        } else if (scanner.hasNextDouble()) {
            System.out.println("Введено не целое число");
        } else
            System.out.println("Введено не число");
        System.out.println(prov);
    }

    public static void toShowResult(int c) {
        String str = Integer.toString(c);

        char[] chars = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (i >= 0 && i < str.length() - 1) {
                System.out.print(chars[i] + " * ");
            } else {
                System.out.print(chars[i] + " = ");
            }
        }
    }

}

