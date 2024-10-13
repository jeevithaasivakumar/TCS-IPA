/* Create class Player2 with below attributes:

id - int
name - String
iccRank - int
matchesPlayed - int
runsScored - int

Create class Solution and implement static method "findAverageOfRuns" in the Solution class.
This method will take array of Player objects and a target int as parameters.
And will return another double array where the target int is lesser than or equal to the original array of Player object's 
matchesPlayed attribute and contains the average run scored by each player satisfying above condition.

Write necessary getters and setters.

Before calling "findAverageOfRuns" method in the main method, read values for four Player objects referring the attributes 
in above sequence along with a int target.
Then call the "findAverageOfRuns" method and write logic in main method to print "Grade A",if the calculated averageRun 
value is 80 to 100. Else if the averageRun value is between 50 and 79 then print "Grade B". Else print "Grade C".

Input
------------------
100
Sachin
5
150
13000
101
Sehwag
4
120
10000
103
Dhoni
7
110
7000
104
Kohli
15
57
4400
100

Output
--------------------
Grade A
Grade A
Grade B*/
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
