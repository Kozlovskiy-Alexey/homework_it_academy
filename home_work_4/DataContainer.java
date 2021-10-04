package homework.home_work_4;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1. Создать класс DataContainer у которого есть один дженерик (обобщение). Например литерал T. Данный класс как раз и будет решать
 * задачу поставленную перед нами: хранить неограниченное количество передаваемых объектов обобщённого типа.
 * 2. Внутри DataContainer должно быть поле T[] data, внутренний массив, которое предназначено для хранения передаваемых объектов.
 * Да, именно T[] а не Object[]. Если использовать Object[] то это будет опасно и постоянно придётся делать приведение типов.
 * 3. Из-за особенностей дженериков в данном классе обязательно будет присутствовать один конструктор DataContainer(T[]).
 * Есть и другие способы, но в рамках обучения они будут сложными и с ними мы разбираться будем слишком сложно.
 * 4. В данном классе должен быть метод int add(T item) который добавляет данные во внутреннее поле data и возвращает номер позиции в которую
 * были вставлены данные, начиная с 0.
 * 4.1 Если поле data не переполнено то данные нужно добавлять в первую позицию (ячейку) после последней заполненной позиции (ячейки).
 * 4.1.1 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(777). Должно получиться data = [1, 2, 3, 777, null, null]. Метод add вернёт число 3.
 * 4.1.2 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(null). Должно получиться data = [1, 2, 3, null, null, null].
 * Метод add вернёт число -1. -1 будет индикатором того что данный элемент в наш контейнер вставлять нельзя.
 * 4.1.3 Пример: data = [1, null, 3, null, null, null]. Вызвали add(777). Должно получиться data = [1, 777, 3, null, null, null]. Метод add вернёт число 1.
 * 4.1.4 Пример: data = []. Вызвали add(777). Должно получиться data = [777]. Метод add вернёт число 0.
 * 4.2 В случае если поле data переполнено, нужно придумать механизм который будет расширять пространство для новых элементов. Тут вам поможет Arrays.copyOf.
 * 4.2.1 Пример: data = [1, 2, 3]. Вызвали add(777). Должно получиться data = [1, 2, 3, 777]. Метод add вернёт число 3.
 * 5. В данном классе должен быть метод T get(int index). Данный метод получает из DataContainer'а, из поля data, предварительно сохранённый
 * объект который мы передали на предыдущем шаге через метод add.
 * 5.1 Пример: data = []. Вызвали add(9999). Получили data = [9999]. Метод add вернул число 0. Вызываем get(0). Метод get возвращает 9999
 * 5.2 Пример: data = [9999]. Вызываем get(1). Метод get возвращает null
 * 6. В данном классе должен быть метод T[] getItems(). Данный метод возвращает поле data.
 * 7. Добавить метод boolean delete(int index) который будет удалять элемент из нашего поля data по индексу.
 * 7.1 Метод возвращает true если у нас получилось удалить данные.
 * 7.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(3). Должно получиться data = [1, 2, 3]. Метод delete вернёт true
 * 7.2 Метод возвращает false если нет такого индекса.
 * 7.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(9). Должно получиться data = [1, 2, 3, 777]. Метод delete вернёт false
 * 7.3. Освободившуюся ячейку в поеле data необходимо удалить полностью. Пустых элементов не должно быть.
 * 7.3.1 Пример data = [1, 2, 3, 777]. Вызывают delete(2). Должно получиться data = [1, 2, 777]. Метод delete вернёт true
 * 8. Добавить метод boolean delete(T item) который будет удалять элемент из нашего поля data.
 * 8.1 Метод возвращает true если у нас получилось удалить данные.
 * 8.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(777). Должно получиться data = [1, 2, 3]. Метод delete вернёт true
 * 8.2 Метод возвращает false если нет такого элемента.
 * 8.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(111). Должно получиться data = [1, 2, 3, 777]. Метод delete вернёт false
 * 8.3 Освободившуюся ячейку необходимо удалить полностью. Пустых элементов не должно быть.
 * 8.3.1 Пример data = [1, 2, 3, 777, 3]. Вызывают delete(3). Должно получиться data = [1, 2, 777, 3]. Метод delete вернёт true
 * 9. Добавить НЕ СТАТИЧЕСКИЙ метод void sort(Comparator<.......> comparator). Данный метод занимается сортировкой данных записанных в поле data используя
 * реализацию сравнения из ПЕРЕДАННОГО объекта comparator. Классом Arrays пользоваться запрещено.
 * 10. Переопределить метод toString() в классе и выводить содержимое data без ячеек в которых хранится null.
 */

public class DataContainer<T> {

    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }

    //  метод добавляет данные в поле data
    public int add(T item) {
        int result = 0;
        boolean isEmpty = true;
        if (item == null) {
            result = -1;
        } else {

            for (int i = 0; i < data.length; i++) {
                if (data[i] == null) {
                    data[i] = item;
                    result = i;
                    isEmpty = false;
                    break;
                }
            }

            if (isEmpty) {
                data = Arrays.copyOf(data, data.length + 1);
                data[data.length - 1] = item;
                result = data.length - 1;
            }
        }
        return result;
    }

    //  метод возвращает данные по индексу
    public T get(int index) {

        if (index > data.length - 1) {
            return null;
        } else return data[index];
    }

    //  метод удаляет данные по индексу
    public boolean delete(int index) {
        if (index <= data.length - 1) {

            for (int i = index; i < data.length - 1; i++) {
                data[i] = data[i + 1];
            }
            data = Arrays.copyOf(data, data.length - 1);
            return true;

        } else return false;
    }

    //    метод удаляет элемент из поля data
    public boolean delete(T item) {
        boolean isTrue = false;
        for (int i = 1; i <= data.length; i++) {
            if (item.hashCode() == data[i - 1].hashCode() && i != data.length) {
                System.arraycopy(data, i, data, i - 1, data.length - i);
                data = Arrays.copyOf(data, data.length - 1);
                isTrue = true;
                break;
            } else if (i == data.length && item.hashCode() == data[i - 1].hashCode()) {
                data = Arrays.copyOf(data, data.length - 1);
                isTrue = true;
            }
        }
        return isTrue;
    }

    public void sort(Comparator<T> comparator) {
        boolean isTrue = true;
        while (isTrue) {
            isTrue = false;
            for (int i = 1; i < data.length; i++) {
                if (comparator.compare(data[i - 1], data[i]) > 0) {
                    T temp = data[i - 1];
                    data[i - 1] = data[i];
                    data[i] = temp;
                    isTrue = true;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        boolean space = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                if (space) {
                    stringBuilder.append(" ");
                } else {
                    space = true;
                }
                stringBuilder.append(data[i]);
            }
        }
        return stringBuilder.toString();
    }
}


