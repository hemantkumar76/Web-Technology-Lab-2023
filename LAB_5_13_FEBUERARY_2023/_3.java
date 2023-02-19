
//Write a program to calculate area according to user input, whether it is circle, squareor triangle (Menu Driven).
// lab manual ka qs - 6
import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your shapre bruh ");
        System.out.println("1.circle");
        System.out.println("2.square ");
        System.out.println("3.triangle ");
        int your_choice = sc.nextInt();
        switch (your_choice) {
            case 1:
                System.out.println("enter radius for your cicle ");
                int radius = sc.nextInt();
                int areaOfCircle = (int) 3.14 * radius * radius;
                System.out.println("area of your cicle is " + areaOfCircle);
                break;
            case 2:
                System.out.println("enter side of your square ");
                int side = sc.nextInt();
                int areaOfSquare = side * side;
                System.out.println("area of your cicle is " + areaOfSquare);
                break;
            case 3:
                System.out.println("enter base of your triangle ");
                int base = sc.nextInt();
                System.out.println("enter height of your triangle ");
                int height = sc.nextInt();
                int areaOfTriangle = (int) (0.5 * base * height);
                System.out.println("the area of your trian gle is " + areaOfTriangle);
                break;
            default:
                System.out.println("shi se dalo bhai ");
        }
    }
}