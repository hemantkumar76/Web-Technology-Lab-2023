
// A plastic manufacturer sells plastic in different shapes like 2D sheet and
// 3Dbox. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs
// 60/ per
// cubic ft. Implement it in Java to calculate the cost of plastic as per
// thedimensions given by the user where 3D inherits from 2D
import java.util.Scanner;

class Plastic2D {
    protected double length;
    protected double width;

    public void read() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter length of sheet ");
        length = input.nextDouble();
        System.out.print("enter width of sheet ");
        width = input.nextDouble();
    }

    public double calculateCost() {
        return length * width * 40;
    }
}

class Plastic3D extends Plastic2D {
    protected double height;

    public void read() {
        super.read();
        Scanner input = new Scanner(System.in);
        System.out.print("enetr height ");
        height = input.nextDouble();
    }

    public double calculateCost() {
        return length * width * height * 60;
    }
}

public class lab_7_qs_1 {
    public static void main(String[] args) {
        Plastic3D box = new Plastic3D();
        box.read();
        double cost = box.calculateCost();
        System.out.println("total cost is " + cost);
    }
}