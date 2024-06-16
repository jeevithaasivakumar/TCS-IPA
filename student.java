
/*Create a class Student with below attributes:

rollNo - int
name - String
subject - String
grade - char
date - String [DD/MM/YYYY]



The above attributes should be private.Write Getter and Setter and parametrized constructor as required.


Create class Solution with main method.
****************************************************************************
Implement one static method: findStudentByGradeAndMonth Solution Class.


findStudentByGradeAndMonth Method:

This method will take an array of Student objects, char value as grade and int value as month 
for input parameters.The method will find out all Students from the given grade and month. 
This method will return array of Student object assending based on their rollNo if found. 
If there is no Student that matches then the method should return null.

for this method- main method should print Student name, subject and total student found [The 
length of the list], if the returned value is not null. If the returned value is null then 
main method should print "No student found".


NOTE:
	1. For Taking char as input use sc.nextLine().charAt(0)
	2. To match/check the month You havee to convert int month in the parameter to String.
	3. No need to count the Student array if return not null just print the array length.


****************************************************************************



Consider the below input and output:


input1:

111
Arijit
Math
B
22/09/2023
101
Priyanka
English
A
30/03/2022
107
Shreosi
History
C
13/05/2022
105
Tatan
Physics
A
27/03/2022
A
3


output1:

Priyanka
English
Tatan
Physics
2





input2:

111
Sohel
Math
B
22/09/2022
101
Priyanka
English
A
30/03/2022
107
Gopa
History
C
12/05/2022
105
Kamal
Physics
A
27/03/2022
A
7



output 2:

No student found
 */
import java.util.*;

public class student {
    public static void main(String[] args) {
        stud[] s = new stud[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();
            s[i] = new stud(a, b, c, d, e);
        }
        char ig = sc.nextLine().charAt(0);
        int im = sc.nextInt();
        sc.nextLine();
        stud[] ans = fsbgm(s, ig, im);
        if (ans != null) {

            for (int i = 0; i < ans.length; i++) {
                System.out.println(ans[i].getn());
                System.out.println(ans[i].getsub());
            }
            System.out.println(ans.length);

        } else {
            System.out.println("no student found");
        }
    }

    public static stud[] fsbgm(stud[] s, char ig, int im) {
        stud[] ref = new stud[0];
        for (int i = 0; i < s.length; i++) {
            String[] month = s[i].getd().split("/");
            if (s[i].getg() == ig && Integer.parseInt(month[1]) == im) {
                ref = Arrays.copyOf(ref, ref.length + 1);
                ref[ref.length - 1] = s[i];

            }
        }
        stud k;
        for (int i = 0; i < ref.length; i++) {
            for (int j = i + 1; j < ref.length; j++) {
                if (ref[i].getrn() > ref[j].getrn()) {
                    k = ref[i];
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

class stud {

    private int rn;
    private String n;
    private String sub;
    private char g;
    private String d;

    public stud(int rn, String n, String sub, char g, String d) {
        this.rn = rn;
        this.n = n;
        this.sub = sub;
        this.g = g;
        this.d = d;
    }

    public int getrn() {
        return rn;
    }

    public void setrn(int rn) {
        this.rn = rn;
    }

    public String getn() {
        return n;
    }

    public void setn(String n) {
        this.n = n;
    }

    public String getsub() {
        return sub;
    }

    public void setsub(String sub) {
        this.sub = sub;
    }

    public char getg() {
        return g;
    }

    public void setg(char g) {
        this.g = g;
    }

    public String getd() {
        return d;
    }

    public void setd(String d) {
        this.d = d;
    }
}