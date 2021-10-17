package homework.home_work_6;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 2. Работа с коллекциями:
 * 	2.1 Найти в тексте все использованные слова и поместить их в коллекцию Set.
 * 		Более подробное описание задачи, для понимания чего я хочу: Для решения данной задачи необходимо прочитать текстовый файл и поместить текст из данного
 * 		текстового файла в строку. Далее данную строку необходимо обработать таким образом чтобы из неё можно было бы считывать слова.
 * 		Далее каждое полученное слово поместить в Set. Благодаря возможностям Set'ов в итоге мы получим коллекцию содержащую набор слов который был использован
 * 		при написании данного текста. В конце выводим в консоль количество использованных слов.
 */

public class WarAndPieceMain1 {
    public static void main(String[] args) {

        String book;
        StringBuilder stringBuilder = new StringBuilder();

//        считываем текст из файла "Война и мир_книга.txt"
        try (Reader reader = new FileReader("Война и мир_книга.txt");
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            while (bufferedReader.ready()) {
                stringBuilder.append(bufferedReader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        сохраняем текст в строку
        book = stringBuilder.toString();

//        с помощью регулярного выражения удаляем все знаки препинания и др.
        String clearBook = book.replaceAll("[)(|,;.:!?\"-*1234567890=]+"  ,"");

//        создаем массив строк, с помощью метода split делим нашу строку на подстроки по пробелу
        String[] words = clearBook.split(" +");

//        помещаем все строки из массива в множество
        Set<String> wordsSet = new HashSet<>(Arrays.asList(words));
        System.out.println("Количество использованных слов в книге \"Война и мир\": " + wordsSet.size());

    }
}
