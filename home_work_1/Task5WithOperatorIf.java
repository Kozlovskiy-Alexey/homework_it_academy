package homework.home_work_1;

import homework.home_work_1.api.ICommunicationPrinter;

public class Task5WithOperatorIf implements ICommunicationPrinter {

    @Override
    public String welcome(String name) {
        String answer = null;
        if (name.equals("Вася")) {
            answer = "Привет! Я тебя так долго ждал";
        }
        if (name.equals("Анастасия")) {
            answer = "Я тебя так долго ждал";
        }
        if (!name.equals("Вася") && !name.equals("Анастасия")) {
            answer = "Добрый день, а вы кто?";
        }
        return answer;
    }
}
