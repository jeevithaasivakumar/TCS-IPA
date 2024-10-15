/*Create a class Beach with the below attributes: 
beachId - int 
beachName - String 
beachRating - int 
beachCost - int
Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create class Solution with the main method.
Implement two static methods - findLeastRatingWithName in Solution class.

findLeastRatingWithName method: 
-----------------------------------
This method will take three input parameters - array of Beach objects and string parameter and a int parameter. The method 
will return the minimum rating attribute from beach objects whose name is matched with string parameter and whose amount
is greater than the int parameter. If no data found of beach objects, then the method should return 0.

Note : All the searches should be case insensitive.

These above mentioned static methods should be called from the main method.
For findLeastRatingWithName method - The main method should print the least rating from the beach array. If return 0, then
you should print "No beach found".

Input ->
1001
Puri
3
8600 
1002
Digha
5
6200
1003
Digha
3
4000
1004
Digha
4
5500
digha
5000

Output ->
4*/
import java.util.*;

public class beach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bch[] arr = new bch[4];
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            int e = sc.nextInt();
            sc.nextLine();
            arr[i] = new bch(a, b, d, e);
        }
        String ipn = sc.nextLine();
        int ipc = sc.nextInt();
        sc.nextLine();
        int ans = findleastratingwithname(arr, ipn, ipc);
        if (ans != 0) {
            System.out.println(ans);
        } else {
            System.out.println("No beach found");
        }
    }

    public static int findleastratingwithname(bch[] arr, String ipn, int ipc) {
        int[] ref = new int[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getn().equalsIgnoreCase(ipn) && arr[i].getc() > ipc) {
                ref = Arrays.copyOf(ref, ref.length + 1);
                ref[ref.length - 1] = arr[i].getr();
            }
        }
        Arrays.sort(ref);
        int res = 0;
        if (ref.length > 0) {
            int x = ref[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].getr() == x) {
                    res = arr[i].getr();
                }
            }
            return res;

        }
        return 0;
    }

}

class bch {
    public int id;
    public String n;
    public int r;
    public int c;

    public bch(int id, String n, int r, int c) {
        this.id = id;
        this.n = n;
        this.r = r;
        this.c = c;
    }

    public String getn() {
        return n;
    }

    public void setn(String n) {
        this.n = n;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public void setr(int r) {
        this.r = r;
    }

    public void setc(int c) {
        this.c = c;
    }

    public int getr() {
        return r;
    }

    public int getc() {
        return c;
    }
}
