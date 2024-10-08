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