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
