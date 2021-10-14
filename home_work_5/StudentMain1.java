package homework.home_work_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class StudentMain1 {
    static Random random = new Random();

    public static void main(String[] args) {

        List<Student> listStudents = new ArrayList<>();

        for (int i = 1; i <= 10_000; i++) {
            Student student = new Student();
            listStudents.add(student);
            student.setNumber(i);
//            student.setName(StudentMain1.randomName());
//            student.setName(StudentMain1.randomNaturalName());
            student.setName(StudentMain1.randomNameFromFile());
            student.setAge(StudentMain1.randomAge());
            student.setMark(StudentMain1.randomMark());
            student.setOlympiadParticipation(StudentMain1.randomOlympicParticipation());
        }
        System.out.println("Размер первоначального списка: " + listStudents.size());

//        Фильтруем студентов по возрасту и оценке, сохраняем в новый список.
        List<Student> sortedStudentsList = StudentMain1.filterByNameAndMark(listStudents);
        System.out.println("Размер отфильтрованного списка по возрасту и оценке: " + sortedStudentsList.size());
        System.out.println("Проверка размера первоначального списка: " + listStudents.size());
        System.out.println();

//        Сортируем отфильтрованных студентов по имени, от меньшего к большему. Выводим в консоль ТОП 10.
        sortStudentsByName(sortedStudentsList);
        showFirstTenStudents(sortedStudentsList, "Список отфильтрованных по имени студентов. ТОП 10:");
        System.out.println();

//        Сортируем отфильтрованных студентов по оценке, выводим в консоль ТОП 10.
        sortByMark(sortedStudentsList);
        showFirstTenStudents(sortedStudentsList, "Список отфильтрованных по оценке студентов. ТОП 10:");
        System.out.println();

//        Сортируем отфильтрованных студентов по возрасту и оценке одновременно. Выводим ТОП 10 в каждом возрасте.
        sortStudentsByMarkAndAge(sortedStudentsList);
        showTenStudentsWithMaxMarksAtEveryAge(sortedStudentsList, "Список отсортированных студентов по возрасту и оценке. ТОП 10:");
    }

    /**
     * Метод генерирует случайный возраст студента.
     *
     * @return число от 7 до 17.
     */
    public static int randomAge() {
        return 7 + random.nextInt(11);
    }

    /**
     * Метод генерирует случайную оценку студента.
     *
     * @return число от 0.0 до 10.0.
     */
    public static double randomMark() {
        return Math.round(random.nextDouble() * 10);
    }

    /**
     * Метод генерирует случайное участие в Олимпиаде.
     *
     * @return boolean случайное значение участия в Олимпиаде.
     */
    public static boolean randomOlympicParticipation() {

        return random.nextBoolean();
    }

    /**
     * Метод генерирует случайное имя на русском языке.
     *
     * @return Строка размером от 3 до 10 русских символов.
     */
    public static String randomName() {

        int nameLengthFrom = 3;
        int nameLengthTo = 10;
        int firstCharFromUnicode = 1040;
        int lastCharFromUnicode = 1103;

        int nameLength = nameLengthFrom + random.nextInt(nameLengthTo - nameLengthFrom);
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < nameLength; i++) {
            int charFromUnicode = firstCharFromUnicode + random.nextInt(lastCharFromUnicode - firstCharFromUnicode);
            String str = "" + (char) charFromUnicode;
            if (i == 0) {
                builder.append(str.toUpperCase());
            } else builder.append(str.toLowerCase());
        }
        return builder.toString();
    }

    /**
     * Метод генерирует настоящее случайное имя на русском языке.
     *
     * @return русское имя.
     */
    public static String randomNaturalName() {
        List<String> nameList = new ArrayList<>();
        nameList.add("Алексей");
        nameList.add("Владимир");
        nameList.add("Илья");
        nameList.add("Наталья");
        nameList.add("Ольга");
        nameList.add("Иван");
        nameList.add("Дмитрий");
        nameList.add("Петр");
        nameList.add("Анна");
        return nameList.get(random.nextInt(nameList.size()));
    }

    /**
     * Метод генерирует случайное русское имя из файла.
     *
     * @return русское имя студента.
     */
    public static String randomNameFromFile() {
        String s;
        String filePath = "D:\\Java\\Mk-JC1-84-21\\src\\homework\\home_work_5\\Names.txt";
        File file = new File(filePath);
        StringBuilder sb = new StringBuilder();
        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine());
                if (scanner.hasNextLine()) {
                    sb.append(" ");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        s = sb.toString();
        String[] nameArray = s.split(" +");
        return nameArray[random.nextInt(nameArray.length)];
    }

    /**
     * Метод сортирует список студентов по имени.
     *
     * @param sortedStudentsList список студентов.
     */
    private static void sortStudentsByName(List<Student> sortedStudentsList) {
        Collections.sort(sortedStudentsList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getName().length() > o2.getName().length()) {
                    return 1;
                } else if (o1.getName().length() < o2.getName().length()) {
                    return -1;
                } else return 0;
            }
        });
    }

    /**
     * Метод отфильтровывает студентов по нескольким признакам. По возрасту (тем кому 12 и выше), по оценке (выше 8).
     * Отфильтрованных студентов помещает в отдельный список. Переданный список остается неизменным.
     *
     * @param students - список студентов.
     * @return новый отфильтрованный список студентов.
     */
    public static List<Student> filterByNameAndMark(List<Student> students) {
        List<Student> newStudentsList = new ArrayList<>();

        Iterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAge() >= 12 && student.getMark() > 8) {
                newStudentsList.add(student);
            }
        }
        return newStudentsList;
    }

    /**
     * Метод сортирует студентов по оценке.
     *
     * @param sortedStudentsList список студентов.
     */
    private static void sortByMark(List<Student> sortedStudentsList) {
        Collections.sort(sortedStudentsList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getMark() > o2.getMark()) {
                    return -1;
                } else if (o1.getMark() < o2.getMark()) {
                    return 1;
                } else return 0;
            }
        });
    }

    /**
     * Метод сортирует по возрасту и оценке студентов. Студент с меньшим возрастом и максимальной оценкой
     * располагается в начале списка.
     *
     * @param sortedStudentsList лист студентов.
     */
    private static void sortStudentsByMarkAndAge(List<Student> sortedStudentsList) {
        sortByMark(sortedStudentsList);
        Collections.sort(sortedStudentsList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else if (o1.getAge() < o2.getAge()) {
                    return -1;
                } else return 0;
            }
        });
    }

    /**
     * Метод выводит в консоль первых десять студентов из списка.
     *
     * @param sortedStudentsList список студентов.
     * @param s                  описание по каким критериям выполнялась сортировка списка.
     */
    private static void showFirstTenStudents(List<Student> sortedStudentsList, String s) {
        System.out.println(s);
        for (int i = 0; i < 10; i++) {
            System.out.println(sortedStudentsList.get(i));
        }
    }

    /**
     * Метод выводит в консоль первых десять студентов из списка с максимальными оценками в каждом возрасте.
     *
     * @param sortedStudentsList список студентов.
     * @param s                  строка описание по каким критериям выполнялась сортировка списка.
     */
    private static void showTenStudentsWithMaxMarksAtEveryAge(List<Student> sortedStudentsList, String s) {
        System.out.println(s);
        Iterator<Student> iterator = sortedStudentsList.listIterator();
        int count = 0;
        int age = 12;
        while (iterator.hasNext()) {
            do {
                Student student = iterator.next();
                if (student.getAge() == age) {
                    System.out.println(student);
                    ++count;
                } else if (student.getAge() == age + 1) {
                    count = 0;
                    System.out.println(student);
                    count++;
                    age++;
                }
            } while (count < 10 && iterator.hasNext());
            count = 0;
            age++;
        }
    }
}
