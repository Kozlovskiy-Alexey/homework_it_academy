package homework.home_work_6.search;

import homework.home_work_6.search.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {

        String regex = "\\b" + word + "\\b";
        Pattern compile = Pattern.compile(regex,Pattern.UNICODE_CASE);
        Matcher matcher = compile.matcher(text);
        long count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
