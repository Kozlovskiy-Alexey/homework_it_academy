package homework.home_work_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Загрузчик курсов валют с сайта Альфа-Банка
 */

public class AlfaBankLoader extends SiteLoader {

    /**
     * Метод для запуска загрузки курса валют
     *
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(SiteLoader.Currency currencyName) {
        return load("https://developerhub.alfabank.by:8273/partner/1.0.0/public/rates/", currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     *
     * @param content      то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, SiteLoader.Currency currencyName) {
        String[] strings = content.split("\\{");
        String group = null;
        String regex = String.format("(sellRate\":)(\\d+\\.\\d+)(,\"sellIso\":\"%s)", currencyName.name());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        for (String s : strings) {
            matcher = pattern.matcher(s);
            if (matcher.find()) {
                group = matcher.group(2);

            }
        }
        return Double.parseDouble(group);
    }
}
