
//Program to print the corresponding week day for the given day no. of the current month using switch..case statement in Java
import java.util.Scanner;

public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter day no ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("monday hai");
                break;
            case 2:
                System.out.println("tuesday hai");
                break;
            case 3:
                System.out.println("wednesday  hai");
                break;
            case 4:
                System.out.println("thursday hai");
                break;
            case 5:
                System.out.println("friday hai");
                break;
            case 6:
                System.out.println("saturday hai");
                break;
            case 7:
                System.out.println("sunday hai");
                break;
            default:
                System.out.println("invalid day no.");
                break;
        }
        sc.close();
    }
}