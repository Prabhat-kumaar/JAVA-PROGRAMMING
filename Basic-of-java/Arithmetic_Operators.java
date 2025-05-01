/*
 * Arithmatic Operators are used to perform basic math
 * add
 * sub
 * mul
 * div
 * moduls
*/

public class Arithmetic_Operators {

    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 20;

        int add = (num1 + num2);
        int sub = (num1 - num2);
        int mul = (num1 * num2);
        int div = (num1 / num2);
        int mod = (num1 % num2);

        // you can use same dat with diffrent datatypes like (float,long, double, short, byte)
        float f = (10.5f + 2.5f);
        long l = (20+20);
        double d = (10.2345d+ 20.34234);
        short s = (23+23);
        byte b = (1+3);

        // now printing there values
        System.out.println("addition of two numbers:- "+add);
        System.out.println("subtration of two numbers:- "+sub);
        System.out.println("Multiplication of two number:- "+mul);
        System.out.println("Division of two number:- "+div);
        System.out.println("Moduluse of two number:- " +mod);
        System.out.println("This is float addition:- "+f);
        System.out.println("This is long addition:- "+l);
        System.out.println("This is double addition:- "+d);
        System.out.println("This is short addition:- "+s);
        System.out.println("This is byte addition:- "+b);
    }
}