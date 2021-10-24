package homework.home_work_6.search;


import homework.home_work_6.search.api.ISearchEngine;


/**
 * * 4.1 Написать класс EasySearch. Реализовать поиск используя метод indexOf из класса String. В данной реализации запрещено использовать регулярные выражения
 * * в любом виде, для любых задач. Данный класс ищет слова с учётом регистра.
 */

public class EasySearch4 implements ISearchEngine {
    String devChars = " !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

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
        int textLength = text.length();
        int wordLength = word.length();
        do {
            index = text.indexOf(word, index + 1);
            if (index != -1) {
                if (index == 0) {
                    count++;
                    break;
                }
               char charBefore = text.charAt(index - 1);
                if (isChar(charBefore)) {
                    int afterCharIndex = index + wordLength;
                    if (textLength >= afterCharIndex) {
                        if (textLength == afterCharIndex) {
                            count++;
                            break;
                        }
                        char afterChar = text.charAt(afterCharIndex);
                        if (isChar(afterChar)) {
                            count++;
                        }
                    }
                }
            }
        } while (index != -1);

        return count;
    }

    private boolean isChar(char c) {
        return devChars.indexOf(c) != -1;
    }


}
