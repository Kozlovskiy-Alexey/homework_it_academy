package homework.homework4.loops;
//1.5. Вывести таблицу умножения в консоль. В консоли должно получиться также как и на картинке
// (динозаврика рисовать не надо): https://www.dropbox.com/s/ibakfuppvy2w32g/multiplication_table.jpeg?dl=0

public class Task1p5 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= 5; j++) {
                System.out.printf(" %3d * %2d  = %3d   ", j, i, i * j);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j <= 9; j++) {
                System.out.printf(" %3d * %2d  = %3d   ", j, i, i * j);
            }
            System.out.println();
        }

    }
}