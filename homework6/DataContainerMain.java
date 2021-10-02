package homework.homework6;

public class DataContainerMain {
    public static void main(String[] args) {

//        создаем массив
        Integer[] array = new Integer[0];

//        передаем массив в DataContainer
        DataContainer<Integer> dc1 = new DataContainer<>(array);

//        с помощью метода add добавляем данные во внутреннее поле объекта DataContainer
        System.out.println(dc1.add(100));
        System.out.println(dc1.add(999));
        System.out.println(dc1.add(555));
        System.out.println(dc1.add(333));
        System.out.println("Последний переданный объект: " + dc1.get(5));

        for (Integer i : dc1.getData()) {
            System.out.print(i + " ");
        }
        System.out.println();

//        удаляем элемент с индексом с помощью метода delete
        System.out.println(dc1.delete(0));

        System.out.println("Массив после удаления элемента:");
        for (Integer i : dc1.getData()) {
            System.out.print(i + " ");
        }
        System.out.println();

//        удаляем элемент по значению
        System.out.println(dc1.delete(Integer.valueOf(333)));

        System.out.println("Массив после удаления элемента по значению:");

        for (Integer i : dc1.getData()) {
            System.out.print(i + " ");
        }

    }
}