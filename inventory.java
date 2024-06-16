/*Create class Inventory with below attributes:

inventoryId - String
maximumQuantity - int
currentQuantity - int
threshold - int

Create class Solution and implement static method "Replenish" in the Solution class.
This method will take array of Inventory objects and a limit int as parameters.
And will return another array of Inventory objects where the limit int is greater than or equal to the original array of 
Inventory object's threshold attribute.

Write necessary getters and setters.

Before calling "Replenish" method in the main method, read values for four Inventory objects referring the attributes in above 
sequence along with a int limit.Then call the "Replenish" method and write logic in main method to print "Critical Filling",
if the threshold attribute is greater than 75. Else if the threshold attribute is between 50 and 75 then print 
"Moderate Filling". Else print "Non-Critical Filling"

Input
---------------------------
1
100
50
50
2
200
60
40
3
150
35
45
4
80
45
40
45

Output
----------------------------
2 Non-Critical Filling
3 Non-Critical Filling
4 Non-Critical Filling */
import java.util.*;

public class inventory {

    public static void main(String args[]) {
        inven[] in = new inven[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            String a = sc.nextLine();
            int b = sc.nextInt();
            sc.nextLine();
            int c = sc.nextInt();
            sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            in[i] = new inven(a, b, c, d);

        }
        int limit = sc.nextInt();
        sc.nextLine();
        inven[] ans = replenish(in, limit);
        if (ans != null) {
            for (int i = 0; i < ans.length; i++) {
                if (ans[i].getth() > 75) {
                    System.out.println(ans[i].getid() + "Critical Filling");
                } else if (ans[i].getth() >= 50 && ans[i].getth() <= 75) {
                    System.out.println(ans[i].getid() + "Moderate Filling");
                } else {
                    System.out.println(ans[i].getid() + "Non-Critical Filling");
                }
            }
        }

    }

    public static inven[] replenish(inven[] in, int limit) {
        inven[] ref = new inven[0];
        for (int i = 0; i < in.length; i++) {
            if (in[i].getth() <= limit) {
                ref = Arrays.copyOf(ref, ref.length + 1);
                ref[ref.length - 1] = in[i];

            }
        }
        if (ref.length > 0) {
            return ref;
        } else {
            return null;
        }

    }
}

class inven {
    public String id;
    public int mq;
    public int cq;
    public int th;

    public inven(String id, int mq, int cq, int th) {
        this.id = id;
        this.mq = mq;
        this.cq = cq;
        this.th = th;
    }

    public int getth() {
        return th;

    }

    public void setth(int th) {
        this.th = th;
    }

    public String getid() {
        return id;

    }

    public void setid(String id) {
        this.id = id;
    }
}
