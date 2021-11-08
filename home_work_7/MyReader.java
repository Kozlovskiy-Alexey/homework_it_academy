package homework.home_work_7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyReader {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        try (Reader reader = new FileReader("D:\\Java\\Mk-JC1-84-21\\src\\homework\\home_work_7\\infofromurl.txt");
             BufferedReader bufferedReader = new BufferedReader(reader)){

            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                stringBuilder.append(line);
                stringBuilder.append("\n");
            }
        } catch (IOException e) {
            System.out.println("ошибка чтения файла" + e);
        }

        String text = stringBuilder.toString();
        SiteLoader.Currency currencyName = null;

        String[] strings = text.split("\\{");
        double v = 0;

        String regex = String.format("(sellRate\":)(\\d+\\.\\d+)(,\"sellIso\":\"%s)", "USD");
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher;
        String group = null;

        for (String s: strings){
            matcher = pattern.matcher(s);
            if (matcher.find()) {
                group = matcher.group(2);
            }
        }
        System.out.println(group);
    }
}
