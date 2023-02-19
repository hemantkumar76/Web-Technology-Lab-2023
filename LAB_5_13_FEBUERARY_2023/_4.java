
//Write a program in Java to define a class Number with appropriate data members and member functions to input n number of integers and swap the biggestand smallest elements. Use member functions read(), swap() and display().
// lab manual ka qs - 7
import java.util.Scanner;

public class _4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("elements dalo  ");
            arr[i] = sc.nextInt();
        }
        // array method se banaye ahi hum mam acccept bhi ki hia
        int max = arr[0];
        int min = arr[0];
        int max_wala_index = 0;
        int mai_wala_index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                max_wala_index = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                mai_wala_index = i;
            }
        }
        int temp = arr[max_wala_index];
        arr[max_wala_index] = arr[mai_wala_index];
        arr[mai_wala_index] = temp;
        System.out.println("after swapping ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}