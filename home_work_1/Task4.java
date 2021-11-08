package homework.home_work_1;

import java.util.Scanner;

/**
 * 4.* Создать СТАТИЧЕСКИЙ метод sleepIn рядом с методом main. (Взято с https://codingbat.com/prob/p187868).
 * 	4.1 Данный метод будет принимает два параметра
 * 	4.2 Будет отвечать на вопрос спать ли дальше (возвращать true либо false).
 * 	4.3 Первый параметр boolean weekday обозначает рабочий день
 * 	4.4 Второй параметр boolean vacation обозначает отпуск.
 * 	4.5 Если у нас отпуск или не рабочий день то мы можем спать дальше
 * 	4.6 На основании ответа от метода sleepIn вывести сообщение можем спать дальше или пора идти на работу
 */

@SuppressWarnings("deprecation")
public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сегодня рабочий день?");
        boolean isWeekday = scanner.nextBoolean();
        System.out.println("Вы сейчас в отпуске?");
        boolean isVocation = scanner.nextBoolean();

        boolean sleepIn = Task4.sleepIn(isWeekday, isVocation);
        if (sleepIn) {
            System.out.println("Можешь спать дальше)");
        } else {
            System.out.println("Вставай на работу!");
        }

    }

    /**
     * Метод определяет необходимо ли идти на работу
     * @param isWeekday значение выходного дня, true или false
     * @param isVocation значение отпуска, true или false
     * @return true - можно спать дальше, false - необходимо идти на работу.
     *
     * Помечен @Deprecated для изучения тестирования
     */

    @Deprecated
    public static boolean sleepIn(boolean isWeekday, boolean isVocation) {
        if (isWeekday && isVocation) {
            return true;
        } else if (isWeekday && !isVocation){
            return false;
        } else if (!isWeekday && isWeekday) {
            return true;
        } else
         return true;

    }
}
