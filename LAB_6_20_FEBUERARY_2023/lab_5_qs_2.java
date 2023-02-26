// Accept 10 numbers from command line and check how many of them are even and
// how many odd.

import java.util.Scanner;

public class lab_5_qs_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count_even_wala = 0, count_odd_wala = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("enter numbers ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                count_even_wala++;
            } else {
                count_odd_wala++;
            }
        }
        sc.close();

        System.out.println("total number of even hai  " + count_even_wala);
        System.out.println("total number of odd hai  " + count_odd_wala);
    }
}
