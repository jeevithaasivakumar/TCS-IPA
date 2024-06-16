/*Create class Sim2 with below attributes:

id - int
company - String
balance - int
ratePerSecond - double
circle - String

Create class Solution and implement static method "matchAndSort" in the Solution class.

This method will take array of Sim objects, search_circle String and search_rate double as parameters.
And will return another Sim array where the search_circle matches with the circle parameter of the original Sim array and 
the search_rate double is greater than the original array of Sim object's ratePerSecond attribute which is also sorted by 
means of balance attribute in descending order.

Write necessary getters and setters.

Before calling "matchAndSort" method in the main method, read values for four Sim objects referring the attributes in above 
sequence along with a String search_circle and a double search_rate. Then call the "matchAndSort" method and write logic in 
main method to print the id's of the result obtained.

Input
--------------------------
1
jio
430
1.32
mumbai
2
idea
320
2.26
mumbai
3
airtel
500
2.54
mumbai
4
vodafone
640
3.21
mumbai
mumbai
3.4

Output
--------------------------
4
3
1
2 */
import java.util.*;

public class sim2new {
    public static void main(String args[]) {
        sim2[] s = new sim2[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            sc.nextLine();
            double d = sc.nextDouble();
            sc.nextLine();
            String e = sc.nextLine();

            s[i] = new sim2(a, b, c, d, e);
        }
        String ic = sc.nextLine();
        double ir = sc.nextDouble();
        sc.nextLine();

        sim2[] ans = mas(s, ic, ir);
        if (ans != null) {
            for (int i = 0; i < ans.length; i++) {
                System.out.println(ans[i].getid());
            }
        } else {
            System.out.println("No ");
        }
    }

    public static sim2[] mas(sim2[] s, String ic, double ir) {
        sim2[] ref = new sim2[0];
        for (int i = 0; i < s.length; i++) {
            if (s[i].getc().equals(ic) && ir>s[i].getrps()) {
                ref = Arrays.copyOf(ref, ref.length + 1);

                ref[ref.length - 1] = s[i];

            }
        }

        for (int i = 0; i < ref.length-1; i++) {
            for (int j = i + 1; j < ref.length; j++) {
                if (ref[i].getb() < ref[j].getb()) {
                    sim2 k = ref[i];
                    ref[i] = ref[j];
                    ref[j] = k;

                }
            }
        }
        if (ref.length > 0) {
            return ref;
        } else {
            return null;
        }

    }
}

class sim2 {
    private int id;
    private String cn;
    private int b;
    private double rps;
    private String c;

    public sim2(int id, String cn, int b, double rps, String c) {
        this.id = id;
        this.cn = cn;
        this.b = b;
        this.rps = rps;
        this.c = c;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getcn() {
        return cn;
    }

    public void setcn(String cn) {
        this.cn = cn;
    }

    public int getb() {
        return b;
    }

    public void setb(int b) {
        this.b = b;
    }

    public double getrps() {
        return rps;
    }

    public void setrps(double rps) {
        this.rps = rps;
    }

    public String getc() {
        return c;
    }

    public void setc(String c) {
        this.c = c;
    }
}
