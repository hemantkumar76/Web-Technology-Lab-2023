
// Find sum of each diagonal (left & right) elements separately of a user
// entered 3X 3 matrixes in Java.
import java.util.Scanner;

public class lab_5_qs_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println("enter elements fo matrix ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int left_diagonal_sum = 0, right_diagonal_sum = 0;
        for (int i = 0; i < 3; i++) {
            left_diagonal_sum += matrix[i][i];
            right_diagonal_sum += matrix[i][2 - i];
        }

        System.out.println("sum of left diagonal is " + left_diagonal_sum);
        System.out.println("sum of right diagonal is " + right_diagonal_sum);
    }
}