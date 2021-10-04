package homework.home_work_4;

public class DataContainerMain {
    public static void main(String[] args) {

//        создаем массив
        Integer[] arrayInt = new Integer[7];
        String[] arrayStr = new String[10];

//        передаем массив в DataContainer
        DataContainer<Integer> dc1 = new DataContainer<>(arrayInt);
        DataContainer<String> dc2 = new DataContainer<>(arrayStr);

//        с помощью метода add добавляем данные во внутреннее поле объекта DataContainer
        dc1.add(100);
        dc1.add(999);
        dc1.add(-55);
        dc1.add(28);
        dc1.add(222);
        System.out.println("Последний переданный объект: " + dc1.get(4));

        System.out.println("Первоначальный массив чисел:");
        for (Integer i : dc1.getData()) {
            System.out.print(i + " ");
        }
        System.out.println();

//        удаляем элемент с индексом с помощью метода delete
        System.out.println(dc1.delete(3));

        System.out.println("Массив после удаления элемента:");
        for (Integer i : dc1.getData()) {
            System.out.print(i + " ");
        }
        System.out.println();

//        удаляем элемент по значению
        System.out.println(dc1.delete(Integer.valueOf(999)));

        System.out.println("Массив после удаления элемента по значению:");
        for (Integer i : dc1.getData()) {
            System.out.print(i + " ");
        }
        System.out.println();

        String str = dc1.toString();
        System.out.println(str);

        DataContainerIntComparator dataContainerIntComparator = new DataContainerIntComparator();
        dc1.sort(dataContainerIntComparator);
        for (Integer i : dc1.getData()) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(dc1);

//        с помощью метода add добавляем данные во внутреннее поле объекта DataContainer
        dc2.add("Привет");
        dc2.add("Как дела");
        dc2.add("Все хорошо");
        dc2.add("Делаю ДЗ");
        dc2.add("Голова квадратная");

        System.out.println("Первоначальный массив строк:");
        for (String j : dc2.getData()) {
            System.out.print(j + " ");
        }
        System.out.println();

        System.out.println(dc2.delete(1));
        System.out.println(dc2);
        dc2.delete("Привет");
        System.out.println(dc2);

        System.out.println();
        DataContainerStringComparator dataContainerStringComparator = new DataContainerStringComparator();
        dc2.sort(dataContainerStringComparator);
        for (String j : dc2.getData()) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(dc2);
    }
}