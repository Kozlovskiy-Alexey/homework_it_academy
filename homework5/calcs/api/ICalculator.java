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

    // method division
    double div(double a, double b);

    // method multiplication
    double mult(double a, double b);

    // method subtraction
    double sub(double a, double b);

    // method addition
    double sum(double a, double b);

    //метод возведение в целую степень дробного положительного числа
    double degreeOfDoubleNumber(double a, int b);

    // метод модуль числа
    double mod(double a);

    // метод квадратный корень из числа
    double squareRoot(double a);
}
