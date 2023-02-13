// Write a program to overload subtract method with various parameters in a class inJava
import java.util.Scanner;

public class _1 {
    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int subtract(int a, int b, int c) {
        return a - b - c;
    }

    public static void main(String[] args) {
        _1 calc = new _1();

        System.out.println(calc.subtract(10, 20));
        System.out.println(calc.subtract(11.2, 23.4));
        System.out.println(calc.subtract(5, 6, 7));
    }
}
