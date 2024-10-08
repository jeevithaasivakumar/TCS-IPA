
/*Create a class BankAccount with the following attributes:

accountNumber - int
accountHolderName - String
balance - double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create a class Solution with the main method.

Implement two static methods - withdraw and deposit in Solution class.

withdraw method:
------------------------------------------
This method will take two input parameters - array of BankAccount objects and the account number (int) from which withdrawal 
should be done.
The method will check if the account number is present in the array of BankAccount objects.
If present, the method will then check if the balance is sufficient to withdraw the requested amount (double). If yes, it will 
deduct the amount from the account balance and return the updated balance.
If the account number is not present or the balance is not sufficient, the method should return -1.

deposit method:
--------------------------------------------
This method will take two input parameters - array of BankAccount objects and the account number (int) in which deposit should 
be done.
The method will check if the account number is present in the array of BankAccount objects.
If present, it will add the deposit amount (double) to the account balance and return the updated balance.
If the account number is not present, the method should return -1.

These above mentioned static methods should be called from the main method.

For withdraw method - The main method should print the updated balance if the returned value is greater than or equal to 0, or 
it should print "Sorry - Insufficient balance" if the returned value is -1, or it should print "Sorry - Account not found" if 
the returned value is -2.

For deposit method - The main method should print the updated balance if the returned value is greater than or equal to 0, or 
it should print "Sorry - Account not found" if the returned value is -1.

Before calling these static methods in main, a parameterized constructor in the above mentioned attribute sequence as required.

Input
------------------------
1001
Alice
5000.0
1002
Bob
10000.0
1003
Charlie
15000.0
1002
5000.0
1001
10000.0

Output
---------------------------
5000.0
15000.0 */
import java.util.*;

public class account {
    public static void main(String args[]) {
        acc arr[] = new acc[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            sc.nextLine();
            arr[i] = new acc(a, c, d);

        }
        int ipno = sc.nextInt();
        sc.nextLine();
        double w = sc.nextDouble();
        sc.nextLine();
        int ipn = sc.nextInt();
        sc.nextLine();
        double dp = sc.nextDouble();
        sc.nextLine();

        double ans = withdraw(arr, ipno, w);
        if (ans == -2) {
            System.out.println("Sorry - Account not found");
        }

        


        double res = deposit(arr, ipn,dp);
        if (ans > 0) {
            System.out.println(ans);
        } else if (ans == -1) {
            System.out.println("Sorry - Insufficient balance");
        }
        if (res == -1) {
            System.out.println("Sorry - Account not found");
        } else {
            System.out.println(res);
        }

    }

    public static double withdraw(acc[] arr, int ipno, double w) {
       
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getno() == ipno) {
                

                if (arr[i].getb() >= w) {
                    double up = arr[i].getb() - w;
                    return up;

                } else
                    return -1;
            }

        }
        return -2;

    }

    public static double deposit(acc[] arr, int ipn, double dp) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getno() == ipn) {
                double ndp = arr[i].getb() + dp;
                return ndp;

            }

        }
        return -1;

    }

}

class acc {
    public int no;
    public String n;
    public double b;

    public acc(int no, String n, double b) {
        this.no = no;
        this.n = n;
        this.b = b;

    }

    public int getno() {
        return no;
    }

    public void setno(int no) {
        this.no = no;
    }

    public String getn() {
        return n;
    }

    public void setn(String n) {
        this.n = n;
    }

    public double getb() {
        return b;
    }

    public void setb(double b) {
        this.b = b;
    }
}
