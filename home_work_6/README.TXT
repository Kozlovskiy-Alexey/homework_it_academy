2.1 Найти в тексте все использованные слова и поместить их в коллекцию Set. - package homework.home_work_6 - class WarAndPieceMain1.

2.2 Найти в тексте топ N (настраиваемое значение) слов и вывести количество этих слов используя Map и List.
    Отсортировать по количеству. Распечатать в консоль. - package homework.home_work_6 - class WarAndPieceMain1.

3. Написать интерфейс ISearchEngine. - package homework.home_work_6.search.api - interface ISearchEngine.

	3.1 long search(String text, String word) - Метод возвращает информации о количестве раз которое встречается слово в тексте. - package homework.home_work_6.search.api - interface ISearchEngine.

4. Реализовать интерфейс ISearchEngine:
	4.1 Написать класс EasySearch. Реализовать поиск используя метод indexOf из класса String. В данной реализации запрещено использовать регулярные выражения
	в любом виде, для любых задач. Данный класс ищет слова с учётом регистра. - package homework.home_work_6.search - class EasySearch4.

	4.2* Написать класс RegExSearch реализующий интерфейс ISearchEngine. Реализовать поиск при помощи класса Matcher. - package homework.home_work_6.search - public class RegexSearch.

