package homework.homework3;
/*
 Изучить библиотеку (класс) Math из jdk. (https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html)
*/

public class TaskTxt3 {
    public static void main(String[] args) {

        // abs returns the absolute value of the double value
        System.out.println(Math.abs(-12.5545));

        // addExact returns the sum of its arguments, throwing an exception if the result overflows an int
        System.out.println(Math.addExact(2_145_041_110, 10));
        //System.out.println(Math.addExact(2_145_041_110, 10000000)); throwing an exception

        // cbrt(double a) Returns the cube root of a double value
        System.out.println(Math.cbrt(4.6));

        // ceil(double a) Returns the smallest (closest to negative infinity) double value that is greater
        // than or equal to the argument and is equal to a mathematical integer.
        System.out.println(Math.ceil(10.135));

        // copySign(double magnitude, double sign)
        //Returns the first floating-point argument with the sign of the second floating-point argument.
        System.out.println(Math.copySign(10.5, -2.5));

        //decrementExact(int a)
        //Returns the argument decremented by one, throwing an exception if the result overflows an int.
        System.out.println(Math.decrementExact(25));
        //System.out.println(Math.decrementExact(Math.decrementExact(Integer.MIN_VALUE))); // throwing an exception

        // exp(double a)
        //Returns Euler's number e raised to the power of a double value.
        System.out.println(Math.exp(2.0));

        //	floor(double a)
        //Returns the largest (closest to positive infinity) double value
        // that is less than or equal to the argument and is equal to a mathematical integer.
        System.out.println(Math.floor(5.6));

        // floorDiv(int x, int y)
        //Returns the largest (closest to positive infinity) int value that is less than or equal to the algebraic quotient.
        System.out.println(Math.floorDiv(-15, 2));

        //hypot(double x, double y)
        //Returns sqrt(x2 +y2) without intermediate overflow or underflow.
        System.out.println(Math.hypot(4, 3));

        //log(double a)
        //Returns the natural logarithm (base e) of a double value.
        System.out.println(Math.log(7.38905609893065));

        //log10(double a)
        //Returns the base 10 logarithm of a double value.
        System.out.println(Math.log10(100));

        // max, min
        System.out.println(Math.max(10, 100) + " " + Math.min(99, 9));

        //multiplyExact(int x, int y)
        //Returns the product of the arguments, throwing an exception if the result overflows an int.
        System.out.println(Math.multiplyExact(10, 15));

        //negateExact(int a)
        //Returns the negation of the argument, throwing an exception if the result overflows an int.
        System.out.println(Math.negateExact(99));

        //nextAfter(double start, double direction)
        //Returns the floating-point number adjacent to the first argument in the direction of the second argument.
        System.out.println(Math.nextAfter(10, 9));

        // nextDown(double d)
        //Returns the floating-point value adjacent to d in the direction of negative infinity.
        System.out.println(Math.nextDown(5.5));

        // nextUp(double d)
        // Returns the floating-point value adjacent to d in the direction of positive infinity.
        System.out.println(Math.nextUp(5.6));

        // pow(double a, double b)
        // Returns the value of the first argument raised to the power of the second argument.
        System.out.println(Math.pow(5, 2));

        //random()
        //Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
        System.out.println((int) (Math.random() * 10));

        // round(float a)
        //Returns the closest int to the argument, with ties rounding to positive infinity.
        System.out.println(Math.round(10.05));

        //sqrt(double a)
        //Returns the correctly rounded positive square root of a double value.
        System.out.println(Math.sqrt(9));

    }
}
