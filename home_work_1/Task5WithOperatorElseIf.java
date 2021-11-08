package homework.home_work_1;

import homework.home_work_1.api.ICommunicationPrinter;

public class Task5WithOperatorElseIf implements ICommunicationPrinter {

    @Override
    public String welcome(String name) {
        String result;
        if (name.equals("Вася")) {
            result = "Привет! Я тебя так долго ждал";
        } else if (name.equals("Анастасия")) {
            result = "Я тебя так долго ждал";
        } else {
            result = "Добрый день, а вы кто?";
        }
        return result;
    }
}
