
//Program to check a user entered number is palindrome or not.
import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your numberber  ");
        int number = sc.nextInt();
        int x = number;
        int rev = 0;
        while (x != 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        if (number == rev)
            System.out.println("palindrome hai");
        else
            System.out.println("palindrome nahi hai");
        sc.close();
    }
}