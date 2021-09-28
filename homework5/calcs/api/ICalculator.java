package homework.homework5.calcs.api;

/**
 * 8. Создать интерфейс ICalculator. Данный интерфейс создайте в пакете calcs.api . Можете прогуглить слово API, оно очень универсально.
 * Такие пакеты обычно содержат интерфейсы, перечисления и в некоторых случаях абстрактные классы.
 * 8.1 В данном интерфейсе должны быть объявлены методы:
 * 8.1.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
 * 8.1.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 * 8.2 На данный момент данный интерфейс вы должны прописать во всех классах калькуляторов созданных нами в пакетах calcs.simple
 */

public interface ICalculator {

    double div(double a, double b);

    double mult(double a, double b);

    double sub(double a, double b);

    double sum(double a, double b);

    double degreeOfDoubleNumber(double a, int b);

    double mod(double a);

    double squareRoot(double a);
}
