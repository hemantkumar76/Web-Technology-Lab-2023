import java.util.*;

public class _5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int count = 0;
        System.out.println("enter any no");
        a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0)
                count++;
        }
        if (count == 2)
            System.out.println("PRIME HAI ");
        else
            System.out.println("not a prime ");
    }
}