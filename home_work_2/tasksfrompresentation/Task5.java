package homework.home_work_2.tasksfrompresentation;
import java.util.Scanner;

/*
Вывести на экран ряд натуральных чисел от минимума до максимума с шагом.
Например, если минимум 10, максимум 35, шаг 5, то вывод должен быть таким: 10 15 20 25 30 35.
Минимум, максимум и шаг указываются пользователем (считываются с клавиатуры).
Для решения данной задачи лучше всего использовать цикл со счетчиком (for),
Алгоритм же решения очень прост: пока минимум не достигнет максимума выводить его на экран и затем увеличивать на значение шага.*/

public class Task5 {
    public static void main(String[] args) {
        int min;
        int max;
        int step;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the minimum number: ");
        min = scanner.nextInt();
        System.out.print("Enter the maximum number: ");
        max = scanner.nextInt();
        System.out.print("Enter step: ");
        step = scanner.nextInt();
        System.out.println();

        for (int i = min; i <= max; i +=step) {
            System.out.print(i + " ");
        }



    }
}
