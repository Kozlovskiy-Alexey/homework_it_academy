package homework.homework3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
/*Вводится целое число, обозначающее код символа по таблице ASCII. Определить, это код английской буквы или какой-либо иной символ.
В таблице ASCII символы букв идут по порядку – от “A” до “Z”, далее через несколько небуквенных символов от “a” до “z”.
Задача сводится к тому, что надо сравнить код-число, введенное пользователем,
с кодами первых и последних букв алфавита. Если код принадлежит этим диапазонам, значит это код буквы, если нет – то небуквенный символ.*/
        // A -Z - 65 - 90
        Scanner scan = new Scanner(System.in);
        int exit = 1;
        char ch;

        while (exit != 0) {
            System.out.println("Numbers checker v.1.0");
            System.out.println("-----------------------");
            System.out.print("Enter an integer (exit - 0): ");

            int a = scan.nextInt();

            if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {
                ch = (char) a;
                System.out.println("It is a letter - " + ch);
                System.out.println();
            } else if (a == 0) {
                exit = 0;
            } else {
                System.out.println("It is not an english letter!\n");
            }
        }
    }
}
