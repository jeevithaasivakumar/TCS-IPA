
import java.io.*;
import java.util.*;

public class building {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        build[] b = new build[4];
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            String j = sc.nextLine();
            double c = sc.nextDouble();
            int d = sc.nextInt();
            double e = sc.nextDouble();
            int g = sc.nextInt();
            boolean h = sc.nextBoolean();
            b[i] = new build(a, j, c, d, e, g, h);
        }

        int iid = sc.nextInt();
        double ans = faspb(b, iid);
        if (ans != -1) {
            System.out.println(ans);
        } else {
            System.out.println("Building with provided Id does not exist");
        }

        build res = fbmp(b);
        if (res != null) {
            System.out.println(res.getid());
            System.out.println(res.getn());
        }
    }

    public static double faspb(build[] b, int iid) {
        double avg = -1;
        for (int i = 0; i < b.length; i++) {
            if (b[i].getid() == iid) {
                avg = b[i].getsp() / b[i].getu();
                break;
            }
        }
        return avg;
    }

    public static build fbmp(build[] b) {
        double maxProfit = 0;
        build result = null;
        for (int i = 0; i < b.length; i++) {
            double profit = b[i].getsp() - b[i].getcp();
            if (profit > maxProfit) {
                maxProfit = profit;
                result = b[i];
            }
        }
        return result;
    }
}

class build {
    private int id;
    private String n;
    private double cp;
    private int u;
    private double sp;
    private int f;
    private boolean i;

    public build(int id, String n, double cp, int u, double sp, int f, boolean i) {
        this.id = id;
        this.n = n;
        this.cp = cp;
        this.u = u;
        this.sp = sp;
        this.f = f;
        this.i = i;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public double getsp() {
        return sp;
    }

    public void setsp(double sp) {
        this.sp = sp;
    }

    public double getcp() {
        return cp;
    }

    public void setcp(double cp) {
        this.cp = cp;
    }

    public int getu() {
        return u;
    }

    public void setu(int u) {
        this.u = u;
    }

    public String getn() {
        return n;
    }

    public void setn(String n) {
        this.n = n;
    }
}
