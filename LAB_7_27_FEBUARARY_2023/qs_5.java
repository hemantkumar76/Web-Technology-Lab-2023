// Write a program to create an Account class containing acc_no, balance as datamembers and displaying_result() to displaying_resultlay the details. Inherit it in koi_aadmi class with all mentioneddata members and functions. koi_aadmi class also has name and aadhar_no as extra datamembers of its own. Override displaying_result() function. Create 5 koi_aadmis‟ details.

import java.util.Scanner;

class Account {
    int acc_no;
    int balance;

    void displaying_result() {
        System.out.println("account number is " + acc_no);
        System.out.println("balance is " + balance);
    }
}

class koi_aadmi extends Account {
    String name;
    String aadhar_no;

    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name ");
        name = sc.nextLine();
        System.out.print("enter your aadhar number ");
        aadhar_no = sc.nextLine();
        System.out.print("enter your account number ");
        acc_no = sc.nextInt();
        System.out.print("enter your balance ");
        balance = sc.nextInt();
    }

    void displaying_result() {
        System.out.println("name is " + name);
        System.out.println("aadhar number is  " + aadhar_no);
        System.out.println("account number is " + acc_no);
        System.out.println("balance ios " + balance);
    }
}

public class qs_5 {
    public static void main(String[] args) {
        koi_aadmi[] p = new koi_aadmi[1];
        for (int i = 0; i <= 1; i++) {
            p[i] = new koi_aadmi();
            p[i].getDetails();
            p[i].displaying_result();
        }
    }
}
