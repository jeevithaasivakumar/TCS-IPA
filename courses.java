/*Create a Class Course with below attributes:

CourseId - Int
CourseName - String
CourseRating - double
Mode - String
HaveCertificate - boolean

Write getters, setters and parameterized constructor as required. 

Create class Solution with main method. 

Implement static method - CountCourse in Solution class.

This method will take a String parameter and a double parameter along with the other parameter as array of Course objects. 
The method will return the total number of courses which have certificate facility and the rating of the course object is greater
than or equal to the given parameter with match the mode(with case insensitive search).

If no count is there then print "No course found".

Consider below sample input and output:

Input 1:
------------
1001
Java
5
Online
True
1002
Python
3
Offline
False
1003
HTML
4
Offline
True
1004
JavaScript
2
Online
False
3
Online


Output 1:
------------
1
=========================================
Input 2:
------------
1001
Java
5
Online
True
1002
Python
3
Offline
False
1003
HTML
4
Offline
True
1004
JavaScript
2
Online
False
5
Offline

Output 2:
-------------
No course found*/
import java.util.*;

public class courses {
    public static void main(String[] args) {
        course[] C = new course[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            double c = sc.nextDouble();
            sc.nextLine();
            String d = sc.nextLine();
            boolean e = sc.nextBoolean();
            sc.nextLine();
            C[i] = new course(a, b, c, d, e);
        }
        double g = sc.nextDouble();
        sc.nextLine();
        String f = sc.nextLine();
        int ans = cc(C, g, f);
        if (ans > 0) {
            System.out.println(ans);

        } else {
            System.out.println("no course found");
        }
    }

    public static int cc(course[] C, double g, String f) {
        int count = 0;

        for (int i = 0; i < C.length; i++) {
            if (C[i].isc() == true && C[i].getcr() >= g && C[i].getm().equals(f)) {
                count++;
            }
        }
        return count;
    }
}

class course {
    public int id;
    String n;
    double cr;
    String m;
    boolean c;

    public course(int id, String n, double cr, String m, boolean c) {
        this.id = id;
        this.n = n;
        this.cr = cr;
        this.m = m;
        this.c = c;
    }

    public String getm() {
        return m;
    }

    public void setm(String m) {
        this.m = m;
    }

    public double getcr() {
        return cr;
    }

    public void setcr(double cr) {
        this.cr = cr;
    }

    public boolean isc() {
        return c;
    }

    public void setc(boolean c) {
        this.c = c;
    }
}
