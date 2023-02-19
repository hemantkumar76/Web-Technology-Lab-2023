
//Write a program in java to input and display the details of n number of students having roll, name and cgpa as data members. Also display the name of thestudent having lowest cgpa.
// lab manual ka qs - 5
import java.util.Scanner;

public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("how much students hai  ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] rolls = new int[n];
        int[] cgpa = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("enter detain for student  %d:%n", i + 1);

            System.out.print("name dalo  ");
            names[i] = sc.next();

            System.out.print("rolll dalo ");
            rolls[i] = sc.nextInt();

            System.out.print("cgpa  ");
            cgpa[i] = sc.nextInt();
        }

        int lowest_mark = 0;
        for (int i = 1; i < n; i++) {
            if (cgpa[i] < cgpa[lowest_mark]) {
                lowest_mark = i;
            }
        }

        System.out.printf("every student details hai :- :%n", n);
        for (int i = 0; i < n; i++) {
            System.out.printf("student hai  %d:%n", i + 1);
            System.out.printf("name is : %s%n", names[i]);
            System.out.printf("roll is : %d%n", rolls[i]);
            System.out.printf("cgpa is : %.2f%n", cgpa[i]);
            System.out.println();
        }

        System.out.printf("low cgpa hai : %s%n", names[lowest_mark]);

        sc.close();
    }
}