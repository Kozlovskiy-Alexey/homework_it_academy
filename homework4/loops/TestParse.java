package homework.homework4.loops;

public class TestParse {
    public static void main(String[] args) {

        String str1 = "99";
        int x = Integer.parseInt(str1);

        System.out.println(x);

        double d = Double.parseDouble("350");
        d *= 10;
        System.out.println(d);

        int c = Integer.parseInt("111",16);
        System.out.println(c);
    }
}
