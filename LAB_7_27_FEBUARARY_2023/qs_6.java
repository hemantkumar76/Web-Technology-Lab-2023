// Write a program in java using inheritance to show how to call the base classparameterized constructors from the derived class using super.

class A {
    int a;

    A(int x) {
        a = x;
    }

    void display() {
        System.out.println("value of a is " + a);
    }
}

class B extends A {
    int b;

    B(int x, int y) {
        super(x);
        b = y;
    }

    void display() {
        super.display();
        System.out.println(" b is " + b);
    }
}

class qs_6 {
    public static void main(String args[]) {
        B obj = new B(1, 2);
        obj.display();
    }
}
