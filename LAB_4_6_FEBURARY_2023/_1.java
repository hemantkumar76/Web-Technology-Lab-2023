
// Program to print the corresponding grade for the given mark using if..elsestatement in Java
import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks ");
        int mark = sc.nextInt();
        if (mark >= 90)
            System.out.println("your grade is A");
        else if (mark >= 80)
            System.out.println("your grade is B");
        else if (mark >= 70)
            System.out.println("your grade is C");
        else if (mark >= 60)
            System.out.println("your grade is d");
        else if (mark >= 50)
            System.out.println("your grade is E");
        else
            System.out.println("fail ho bhai ");

        sc.close();
    }
}
