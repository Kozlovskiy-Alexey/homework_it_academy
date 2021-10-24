package homework.home_work_6.search.api;

/**
 * 3. Написать интерфейс ISearchEngine. Это будет интерфейс в котором будут методы:
 * 3.1 long search(String text, String word) - Метод возвращает информацию о количестве раз, которое встречается слово в тексте.
 * Первый параметр текст в котором ищем, второй параметр, что ищем в тексте.
 */

public interface ISearchEngine {

    /**
     * Метод ищет слово в тексте
     * @param text тест, в котором ищем.
     * @param word слово, которое ищем.
     * @return количество найденных совпадений слова в тесте.
     */
    long search(String text, String word);


}
