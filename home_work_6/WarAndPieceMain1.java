package homework.home_work_6;

import homework.home_work_6.search.*;
import homework.home_work_6.search.api.ISearchEngine;

import java.io.*;
import java.util.*;

/**
 * 2. Работа с коллекциями:
 * 2.1 Найти в тексте все использованные слова и поместить их в коллекцию Set.
 * Более подробное описание задачи, для понимания чего я хочу: Для решения данной задачи необходимо прочитать текстовый файл и поместить текст из данного
 * текстового файла в строку. Далее данную строку необходимо обработать таким образом чтобы из неё можно было бы считывать слова.
 * Далее каждое полученное слово поместить в Set. Благодаря возможностям Set'ов в итоге мы получим коллекцию содержащую набор слов который был использован
 * при написании данного текста. В конце выводим в консоль количество использованных слов.
 */

public class WarAndPieceMain1 {
    public static void main(String[] args) {

        ISearchEngine searchEngine = new EasySearch4();
        String path = "Война и мир_книга.txt";



        WarAndPieceMain1 warAndPiece = new WarAndPieceMain1();
        String text = warAndPiece.readFile(path);

        String[] words = text.replaceAll("(\\p{Graph}|\\p{Space}){1,}", " ").split(" ");
        Set<String> uniqueWords = new HashSet<>();
        for (String s : words) {
            if (!s.isBlank()) {
                uniqueWords.add(s);
            }
        }
        System.out.println("Количество уникальных слов в тексте: " + uniqueWords.size());

        Map<String, Integer> wordsMap = new TreeMap<>();
        for (String s: words){
            if (!wordsMap.containsKey(s)) {
                wordsMap.put(s, 1);
            } else {
                Integer i = wordsMap.get(s);
                wordsMap.put(s, ++i);
            }
        }

        Map<Integer, List<String>> countOfListWords = new TreeMap<>(((o1, o2) -> Integer.compare(o2, o1)));

//        for (String uniqueWord : uniqueWords) {
//            Integer count = wordsMap.get(uniqueWord);
//            if (!countOfListWords.containsKey(count)) {
//                List<String> stringList = new ArrayList<>();
//                stringList.add(uniqueWord);
//                countOfListWords.put(count,stringList);
//            } else {
//                List<String> stringList = countOfListWords.get(count);
//                stringList.add(uniqueWord);
//                countOfListWords.put(count,stringList);
//            }
//        }

        for (String word : uniqueWords) {
            Integer count = wordsMap.get(word);
            List<String> listWords = countOfListWords.get(count);

            if (listWords == null) {
                listWords = new ArrayList<>();
                countOfListWords.put(count, listWords);
            }
            listWords.add(word);
        }

        System.out.println("ТОП 10 используемых слов в тексте:");
        Set<Map.Entry<Integer, List<String>>> entries = countOfListWords.entrySet();
        int count = 10;
        for (Map.Entry<Integer, List<String>> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            count--;
            if (count < 0) {
                break;
            }
        }

        long count1 = searchEngine.search("привет, как дела!", "дела"); //1
        long count2 = searchEngine.search("привет,какдела!", "дела"); //0
        long count3 = searchEngine.search("привет;какдела!", "дела"); //0
        long count4 = searchEngine.search("как дела!.Что делаешь?", "дела"); //1
        long count5 = searchEngine.search("Привет-привет", "привет"); //0
        long count6 = searchEngine.search("Привет -привет", "привет"); //1
        long count7 = searchEngine.search("4-х", "4"); //0
        long count8 = searchEngine.search("один и 1", "один"); //1
        long count9 = searchEngine.search("бабушка бабушке бабушку", "бабушка"); //1
        long count10 = searchEngine.search(text, "война"); //46
        long count11 = searchEngine.search(text, "и"); //13875
        long count12 = searchEngine.search(text, "мир"); //33

        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);
        System.out.println(count5);
        System.out.println(count6);
        System.out.println(count7);
        System.out.println(count8);
        System.out.println(count9);
        System.out.println(count10);
        System.out.println(count11);
        System.out.println(count12);
    }

    public String readFile(String path) {
        StringBuilder stringBuilder = new StringBuilder();

        try (Reader reader = new FileReader(path);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            while (bufferedReader.ready()) {
                stringBuilder.append(bufferedReader.readLine()).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException("Не удалось прочитать файл", e);
        }
        return stringBuilder.toString();
    }
}
