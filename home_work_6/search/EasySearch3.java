package homework.home_work_6.search;


import homework.home_work_6.search.api.ISearchEngine;

/**
 * * 4.1 Написать класс EasySearch. Реализовать поиск используя метод indexOf из класса String. В данной реализации запрещено использовать регулярные выражения
 * * в любом виде, для любых задач. Данный класс ищет слова с учётом регистра.
 */

public class EasySearch3 implements ISearchEngine {

    /**
     * Метод возвращает информации о количестве раз которое встречается слово в тексте.
     *
     * @param text Текст в котором ищем.
     * @param word Слово, которе ищем в тексте.
     * @return Количество раз, которое встречается слово в тексте.
     */
    @Override
    public long search(String text, String word) {
        int index = -1;
        long count = 0;
        while ((index = text.indexOf(word, index + 1)) != -1) {
            count++;
        }
        return count;
    }


}
