// Illustrate the usage of abstract class with following Java classes –
// i)An abstract class „student‟ with data member roll no, reg no and aabstract method course()
// ii)A subclass „kiitian‟ with course() method implementation

import java.util.Scanner;

abstract class student {
    int roll_no, reg_no;

    abstract void course();
}

class kiitian extends student {
    void course() {
        System.out.println("B.Tech");
    }
}

public class lab_8_qs_1 {
    public static void main(String[] args) {
        kiitian obj = new kiitian();
        obj.course();
    }
}
