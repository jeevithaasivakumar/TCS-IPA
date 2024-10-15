/* Create a class Employee with the following attributes:

name (string)
age (int)
salary (double)
Write getters, setters, and a parameterized constructor in the above-mentioned attribute sequence as required.

Create a class Solution with the main method.

Implement two static methods - calculateYearlySalary and calculateTax in the Solution class.

calculateYearlySalary method:
-----------------------------------------
This method will take an Employee object as input.
The method will calculate the yearly salary of the employee (assuming that the employee works for 12 months in a year) and 
return it as a double.

calculateTax method:
-----------------------------------------
This method will take an Employee object as input.
The method will calculate the tax to be paid by the employee based on the following rules:

If the yearly salary is less than or equal to 50000, the tax is 10% of the yearly salary.
If the yearly salary is greater than 50000 but less than or equal to 100000, the tax is 20% of the amount over 50000 plus 10% 
of the first 50000.
If the yearly salary is greater than 100000, the tax is 30% of the amount over 100000 plus 20% of the amount between 50000 and 
100000 plus 10% of the first 50000.
The method will return the tax amount as a double.
These above-mentioned static methods should be called from the main method.

For calculateYearlySalary method - The main method should print the yearly salary returned by the method.

For calculateTax method - The main method should print the tax amount returned by the method.

Before calling these static methods in main, use a Scanner object to read the values of an Employee object's attributes.

Example Input:
----------------
John
30
55000.0

Example Output:
----------------
Yearly salary of John: 660000.0
Tax to be paid by John: 183000.0*/
import java.util.Scanner;

public class employees {
    public static void main(String[] args) {
        // emp[] e =new emp[4]
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int a = sc.nextInt();
        sc.nextLine();
        double s = sc.nextDouble();
        sc.nextLine();
        emp e = new emp(n, a, s);
        double ans = cys(e);
        double res = ct(e);

        if (ans != 0 && res != 0) {
            System.out.println("yearly salary of " + e.getn() + ":" + " " + ans);
            System.out.println("tax to be paid by" + "" + e.getn() + ":" + res);

        }

    }

    public static double cys(emp e) {
        if (e.gets() > 0) {
            return e.gets() * 12;

        }
        return 0;
    }

    public static double ct(emp e) {
        double t = e.gets() * 12;
        double tax = 0;
        if (t > 0) {
            if (t <= 50000) {
                tax = e.gets() * 0.1;
            }
            if (t > 50000 && t <= 100000) {
                tax = (50000 * 0.10) + ((t - 50000) * 0.20);
            }
            if (t > 100000) {
                tax = (50000 * 0.10) + (50000 * 0.20) + ((t - 100000) * 0.30);
            }
        }
        return tax;
    }
}

class emp {
    public String n;
    public int a;
    public double s;

    public emp(String n, int a, double s) {
        this.n = n;
        this.a = a;
        this.s = s;
    }

    public double gets() {
        return s;
    }

    public void sets(double s) {
        this.s = s;
    }

    public String getn() {
        return n;
    }

    public void setn(String n) {
        this.n = n;
    }
}
