//Write a program in Java to take first name and last name from user and print both inone line as last name followed by first name

import java.util.Scanner;

public class _4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first name");
        String first_name = sc.nextLine();
        System.out.println("enter last name");
        String last_name = sc.nextLine();
        System.out.println(last_name + " " + first_name);
        sc.close();
    }
}