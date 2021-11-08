package homework.home_work_1;

/*
7.** Создать СТАТИЧЕСКИЙ метод String toBinaryString(byte number) и возвращает двоичное представление числа.
В методе можно использовать только обычную математику которая описана в теории. Если число отрицательное то вернуть
дополнительный код. Теория https://planetcalc.ru/747. Пример:
	7.1 Вводим: 42.  Возвращает: 00101010
	7.2 Вводим: 15.  Возвращает: 00001111
	7.3 Вводим: -42. Возвращает: 11010110
	7.4 Вводим: -15. Возвращает: 11110001
 */
public class Task7 {
    public static void main(String[] args) {

        String toBinary1 = toBinaryString((byte) 42);
        String toBinary2 = toBinaryString((byte) 15);
        String toBinary3 = toBinaryString((byte) -42);
        String toBinary4 = toBinaryString((byte) -15);

        System.out.println("число " + "42 " + "в двоичной системе = " + toBinary1);
        System.out.println("число " + "15 " + "в двоичной системе = " + toBinary2);
        System.out.println("число " + "-42 " + "в двоичной системе = " + toBinary3);
        System.out.println("число " + "-15 " + "в двоичной системе = " + toBinary4);
    }

    /**
     * Метод преобразует число из десятичной системы в двоичную
     *
     * @param number число в десятичной системе
     * @return число в двоичной системе в строковом представлении
     */
    public static String toBinaryString(byte number) {
        int[] arr = new int[8];
        StringBuilder sb = new StringBuilder();
        int counter = 7;
        int addOne = 0;
        byte bit;

        // если число положительное
        if (number >= 0) {
            while (number != 0) {
                bit = (byte) (number % 2);
                number = (byte) (number / 2);
                arr[counter] = bit;
                counter--;
            }

        // если число отрицательное
        } else {
            arr = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
            number = (byte) (-number);
            while (number != 0) {
                bit = (byte) (number % 2);
                number = (byte) (number / 2);
                if (counter == 7) {
                    if (bit == 0) {
                        arr[counter] = 0;
                        counter--;
                        addOne = 1;
                    } else if (bit == 1) {
                        arr[counter] = 1;
                        counter--;
                        addOne = 0;
                    }
                } else if (counter > 0 && counter < 7) {
                    if (addOne == 0) {
                        arr[counter] = (bit == 1 ? 0 : 1);
                        counter--;
                    } else if (addOne == 1) {
                        if (bit == 0) {
                            arr[counter] = 0;
                            counter--;
                            addOne = 1;
                        } else if (bit == 1) {
                            arr[counter] = 1;
                            counter--;
                            addOne = 0;
                        }
                    }
                }
            }
        }
        for (int i : arr) {
            sb.append(i);
        }
        return sb.toString();
    }
}

