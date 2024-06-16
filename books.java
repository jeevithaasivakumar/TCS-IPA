/*Create a class Book with below attributes

id - int

pages - int

title - String

author - String

price - double

The above attributes should be private, write getters and setters and parameterized constructor as required.

Create a class Solution with main method
--------------------------------------------
Implement two static methods - findBookWithMaximumPrice and searchBookByTitle in Solution class.

findBookWithMaximumPrice :
=============================
Create a static method findBookWithMaximumPrice in the Solution class. This method will take array of Book objects and 
returns the Book object having the maximum Price if found else return null if not found.

searchBookByTitle :
=============================
Create a static method searchBookByTitle in the Solution class. This method will take array of Book objects and Title as 
input and returns the Book object having the mentioned Title if found else return null if not found.

These methods should be called from the main method.

write code to perform the following tasks.

1. Take necessary input variable and call findBookWithMaximumPrice. For this method - The main method should print the Book
 object with the maximum of mentioned attribute as it is if the returned value is not null, or it should print 
 "No Book found with mentioned attribute."

2. Take necessary input variable and call searchBookByTitle. For this method - The main method should print the Book object 
details as it is, if the returned value is not null or it should print "No Book found with mentioned attribute."

The above mentioned static methods should be called from the main method. Also write the code for accepting the inputs and 
printing the outputs. Don't use any static test or formatting for printing the result. Just invoke the method and print the
result.

All String comparison needs to be in case sensitive.

Input:

1
845
Bengali
Arijit
525.50
2
456
English
Raju
412.30
3
1022
History
Kaka
525.50
4
125
geography
MN
524
English

Output:

1 Bengali
3 History
2
456 */
import java.util.*;

public class books {
    public static void main(String[] args) {
        book[] B = new book[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            int b = sc.nextInt();
            sc.nextLine();
            String c = sc.nextLine();
            String d = sc.nextLine();
            double e = sc.nextDouble();
            sc.nextLine();
            B[i] = new book(a, b, c, d, e);
        }
        String it = sc.nextLine();
        book[] ans = fbwmp(B);
        if (ans != null) {
            for (int i = 0; i < ans.length; i++) {
                System.out.println(ans[i].getid() + " " + ans[i].gett());
            }
        } else {
            System.out.println("no book found");
        }
        book res = sbt(B, it);
        if (res != null) {
            System.out.println(res.getid());
            System.out.println(res.getp());
        }
    }

    public static book[] fbwmp(book[] B) {
        book[] ref = new book[0];
        double max = 0;
        for (int i = 0; i < B.length; i++) {
            if (B[i].getpr() >= max) {
                max = B[i].getpr();
            }
        }
        for (int i = 0; i < B.length; i++) {
            if (B[i].getpr() == max) {
                ref = Arrays.copyOf(ref, ref.length + 1);
                ref[ref.length - 1] = B[i];

            }
        }
        if (ref.length > 0) {
            return ref;
        } else {
            return null;
        }
    }

    public static book sbt(book[] B, String it) {
        for (int i = 0; i < B.length; i++) {
            if (B[i].gett().equals(it)) {
                return B[i];
            }

        }
        return null;
    }

}

class book {
    private int id;
    private int p;
    private String t;
    private String a;
    private double pr;

    public book(int id, int p, String t, String a, double pr) {
        this.id = id;
        this.p = p;
        this.t = t;
        this.a = a;
        this.pr = pr;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int getp() {
        return p;
    }

    public void setp(int p) {
        this.p = p;
    }

    public double getpr() {
        return pr;
    }

    public void setpr(double pr) {
        this.pr = pr;
    }

    public String gett() {
        return t;
    }

    public void sett(String t) {
        this.t = t;
    }

}
