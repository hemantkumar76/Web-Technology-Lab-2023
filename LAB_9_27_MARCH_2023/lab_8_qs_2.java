// Define an interface motor with a data member –capacity and two methodssuchas run() and consume(). Define a Java class ,Washing machine‟ whichimplements this interface and write the code to check the value of the interface datamember thru an object of the class.

import java.util.Scanner;

interface motor {
    int capacity = 0;

    void run();

    void consume();
}

class washing_machine implements motor {
    int capacity;

    public washing_machine(int capacity) {
        this.capacity = capacity;
    }

    public void run() {
        System.out.println("Washing machine is running.");
    }

    public void consume() {
        System.out.println("total power consumed is ");
    }
}

public class lab_8_qs_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter you capacity ");
        int capacity = scanner.nextInt();
        washing_machine washing_machine = new washing_machine(capacity);
        System.out.println("total capacity is " + washing_machine.capacity);
        scanner.close();
    }
}
