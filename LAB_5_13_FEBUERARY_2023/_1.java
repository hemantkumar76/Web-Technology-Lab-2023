
// Write a program to overload subtract method with various parameters in a class inJava
// lab manual ka qs - 2
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

        System.out.println(calc.subtract(100, 50));
        System.out.println(calc.subtract(100.0, 50.0));
        System.out.println(calc.subtract(5, 6, 7));
    }
}
