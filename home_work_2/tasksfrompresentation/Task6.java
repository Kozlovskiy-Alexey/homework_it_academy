package homework.home_work_2.tasksfrompresentation;
import java.util.Scanner;

/*
Сформировать из введенного числа обратное по порядку входящих в него цифр и вывести на экран.
Например, если введено число 3486, то надо вывести число 6843.*/

public class Task6 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integer number: ");
        num = scanner.nextInt();
        System.out.println();

        int temp;
        while (num > 0) {
            temp = num % 10;
            num /= 10;
            System.out.print(temp + " ");
        }
    }
}
