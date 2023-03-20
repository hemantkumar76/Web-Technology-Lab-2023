import java.util.Scanner;

class Shape {
    float area;

    void show_area() {
        System.out.println("area hai " + area);
    }
}

class Circle extends Shape {
    float radius;

    void get_radius() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your radius ");
        radius = sc.nextInt();
    }

    void calculate_area() {
        area = (float) 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    float length, breadth;

    void getLengthBreadth() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your length ");
        length = sc.nextFloat();
        System.out.print("enter your breadth ");
        breadth = sc.nextFloat();
    }

    void calculate_area() {
        area = length * breadth;
    }
}

public class qs_4 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.get_radius();
        c.calculate_area();
        c.show_area();
        r.getLengthBreadth();
        r.calculate_area();
        r.show_area();
    }
}
