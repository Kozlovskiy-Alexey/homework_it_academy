package homework.home_work_7;

public class Test {
    public static void main(String[] args) {


        BelagroLoader loader = new BelagroLoader();
        AlfaBankLoader loader1 = new AlfaBankLoader();
        double value1 = loader1.load(SiteLoader.Currency.USD);
        double value2 = loader1.load(SiteLoader.Currency.EUR);
        double value3 = loader1.load(SiteLoader.Currency.RUB);
        System.out.println("USD " + value1);
        System.out.println("EUR " + value2);
        System.out.println("RUB " + value3);


    }

    public static void printRates(SiteLoader loader){
        System.out.println(loader.load(SiteLoader.Currency.USD));
        System.out.println(loader.load(SiteLoader.Currency.EUR));
        System.out.println(loader.load(SiteLoader.Currency.RUB));
    }
}
