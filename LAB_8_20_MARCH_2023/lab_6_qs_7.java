
// Write a program in Java to define a class Number with appropriate data
// members and member functions to input n number of integers and swap the biggestand smallest elements. Use member functions read(), swap() and display().
import java.util.Scanner;

public class lab_6_qs_7 {
    private int[] arr;
    private int n;

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of integers ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.print("enter " + n + " integers ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void swap() {
        int min_wala = 0;
        int max_wala = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[min_wala]) {
                min_wala = i;
            }
            if (arr[i] > arr[max_wala]) {
                max_wala = i;
            }
        }
        int temp = arr[min_wala];
        arr[min_wala] = arr[max_wala];
        arr[max_wala] = temp;
    }

    public void display() {
        System.out.print("after swapping new array hai ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        lab_6_qs_7 num = new lab_6_qs_7();
        num.read();
        num.swap();
        num.display();
    }
}
