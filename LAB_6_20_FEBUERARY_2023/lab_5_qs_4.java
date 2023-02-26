
// Program to find no. of objects created out of a class using „static‟
// modifier.
import java.util.Scanner;

public class lab_5_qs_4 {
    static int count = 0;

    public lab_5_qs_4() {
        count++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how much object you want to create ? ");
        int n = sc.nextInt();

        lab_5_qs_4[] objects = new lab_5_qs_4[n];
        for (int i = 0; i < n; i++) {
            objects[i] = new lab_5_qs_4();
        }

        System.out.println("so object created are" + lab_5_qs_4.count);

        sc.close();
    }
}