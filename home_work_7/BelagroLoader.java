package homework.home_work_7;

/**
 * Загрузчик курса валют с сайта БелАгроПромБанка
 */

public class BelagroLoader extends SiteLoader {

    /**
     * Метод для запуска загрузки курса валют
     *
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(SiteLoader.Currency currencyName) {
        return load("https://belapb.by/ExCardsDaily.php?ondate=11/01/2021", currencyName);
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
        String[] strings = content.split("Currency Id=");
        double v = 0;
        for (String s : strings) {
            if (s.contains(currencyName.getId())) {
                int rateBuy1 = s.indexOf("<RateBuy>") + "</RateBuy>".length() - 1;
                int rateBuy2 = s.indexOf("</RateBuy>", rateBuy1 + 1);

                String substring = s.substring(rateBuy1, rateBuy2);
                v = Double.parseDouble(substring);
            }
        }
        return v;
    }
}
