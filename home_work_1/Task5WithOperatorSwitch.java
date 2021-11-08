package homework.home_work_1;

import homework.home_work_1.api.ICommunicationPrinter;

public class Task5WithOperatorSwitch implements ICommunicationPrinter {
    @Override
    public String welcome(String name) {

        switch (name) {
            case "Вася":
                return "Привет! Я тебя так долго ждал";
            case "Анастасия":
                return "Я тебя так долго ждал";
            default:
                return "Добрый день, а вы кто?";
        }
    }
}