// Write a program to perform following operations on user entered strings –
//i) Change the case of the string
// ii) Reverse the string
// iii) Compare two strings
// iv) Insert one string into another string

import java.util.Scanner;

public class lab_9_qs_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dalo 1st  string ");
        String str1 = sc.nextLine();
        System.out.println("dalo 2nd string ");
        String str2 = sc.nextLine();
        System.out.println("both string in upper case is  " + str1.toUpperCase() + str2.toUpperCase());
        System.out.println("The reverse of both string is " + new StringBuffer(str1).reverse()
                + new StringBuffer(str2).reverse());
        System.out.println("compaaring two string " + str1.compareTo(str2));
        System.out.print("enter the string yuou want to insert ");
        String str3 = sc.nextLine();
        System.out.print("enter the index at which you want to insert  ");
        int index = sc.nextInt();
        System.out.println("after insertion the string is " + str1.substring(0, index) + str3 + str1.substring(index));
    }
}
