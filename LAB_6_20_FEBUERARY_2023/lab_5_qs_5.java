
// Find the no. of occurrence of each element in an user entered list of nos.
import java.util.Scanner;

public class lab_5_qs_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how much elements you want ? ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter utna elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = n + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    for (int k = j; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    n--;
                    j--;
                }
            }
            System.out.println(arr[i] + " aaya hai  " + count + " baar ");
        }
    }
}