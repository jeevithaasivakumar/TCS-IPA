import java.util.*;

public class matches {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        player p[] = new player[4];
        // p[] arr = new p[4];
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            sc.nextLine();
            p[i] = new player(a, b, c, d, e);
        }
        int target = sc.nextInt();
        player res[] = new player[4];
        int j = 0;
        for (int i = 0; i < 4; i++) {
            if (p[i].matchplayed >= target) {
                res[j] = p[i];
                j++;
            }
        }
        for (int i = 0; i < j; i++) {
            double runavg = (double) (res[i].runscored / res[i].matchplayed);
            if (runavg >= 80 && runavg <= 100) {
                System.out.println("Grade A");
            } else if (runavg >= 50 && runavg <= 79) {
                System.out.println("Grade B");

            } else {
                System.out.println("Grade C");
            }
        }
        // public static int
    }
}

class player {
    int id;
    String name;
    int exp;
    int matchplayed;
    int runscored;

    public player(int a, String b, int c, int d, int e) {
        this.id = a;
        this.name = b;
        this.exp = c;
        this.matchplayed = d;
        this.runscored = e;
    }

    public int getmatchplayed() {
        return matchplayed;
    }

    public int getrunscored() {
        return runscored;
    }

    public void setid(int id) {
        this.id = id;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setexp(int exp) {
        this.exp = exp;
    }

    public void setmatchplayed(int matchplayed) {
        this.matchplayed = matchplayed;
    }

    public void setrunscored(int runscored) {
        this.runscored = runscored;
    }
}
