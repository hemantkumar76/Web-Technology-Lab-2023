// Define two packages as – General and Marketing. In General package define aclass ,employee‟ with data members as empid(protected), ename(private) and apublic method as earnings() which calculate total earnings as
// earnings basic + DA (80% of basic) + HRA (15% of basic)
// In Marketing package define a class ,sales‟ which is extending from ,employee‟class and has a method tallowance() which calculates Travelling Allowance as5% of total earning. Write the programs to find out total earning of a sales person for thegiven basic salary amount and print along with the emp id.

import java.util.Scanner;

class employee {
    protected int emp_id;

    public void earnings(int basic) {
        int da = (int) (0.8 * basic);
        int hra = (int) (0.15 * basic);
        int total_earnings = basic + da + hra;
        System.out.println("total earnings are " + total_earnings);
    }
}

class sales extends employee {
    private int basic;

    public sales(int basic, int emp_id, String emp_name) {
        this.basic = basic;
        this.emp_id = emp_id;
    }

    public void tallowance() {
        int da = (int) (0.8 * basic);
        int hra = (int) (0.15 * basic);
        int total_earnings = basic + da + hra;
        int tallowance = (int) (0.05 * total_earnings);
        System.out.println("travelling allowed is  " + tallowance);
    }
}

public class lab_9_qs_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("base salary  ");
        int basic = sc.nextInt();
        System.out.print("enp id ");
        int emp_id = sc.nextInt();
        System.out.print("enp name  ");
        String emp_name = sc.next();
        sales obj = new sales(basic, emp_id, emp_name);
        // obj.earnings();
        obj.tallowance();
    }
}
