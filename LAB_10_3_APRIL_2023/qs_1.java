// qs 1 hai bhai 
import java.util.Scanner;

interface Numbers {
    int process(int x, int y);
}

class Sum implements Numbers {
    public int process(int x, int y) {
        return x + y;
    }
}

class Average implements Numbers{ 
        public int process(int x, int y) {
        return (x + y) / 2;
    }
}

public class qs_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 2 numbers ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Numbers n = new Sum();
        System.out.println("sum is " + n.process(x, y));
        n = new Average();
        System.out.println("average is " + n.process(x, y));
    }
}
