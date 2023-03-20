import java.util.Scanner;

class plate {
    int length;
    int breadth;
    Scanner ob = new Scanner(System.in);

    plate() {
        System.out.println("enter a dimension ");
        length = ob.nextInt();
        System.out.println("enter b dimension ");
        breadth = ob.nextInt();
    }
}

class box extends plate {
    int height;

    public box() {
        super();
        System.out.print("enter diomension c ");
        height = ob.nextInt();
    }
}

class wood_box extends box {
    int thick;

    public wood_box() {
        super();
        System.out.println("enter dimension d");
        thick = ob.nextInt();
    }
}

public class qs_2 {
    public static void main(String args[]) {
        plate p = new plate();
        System.out.println("dimension of plate hia " + p.length + "," + p.breadth);
        box b = new box();
        System.out.println("dimension of box hai " + b.length + "," + b.breadth + "," + b.height);
        wood_box wb = new wood_box();
        System.out
                .println("dimension of wod bos is  " + wb.length + "," + wb.breadth + "," + wb.height + "," + wb.thick);
    }
}
