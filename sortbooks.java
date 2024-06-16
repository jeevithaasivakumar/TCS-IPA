
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
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sortbooks {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        book[] b = new book[4];
        for (int i = 0; i < b.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String c = sc.nextLine();
            String d = sc.nextLine();
            double e = sc.nextDouble();
            sc.nextLine();
            b[i] = new book(a, c, d, e);
        }
        book[] ans = sbbp(b);
        if (ans != null) {
            for (int i = 0; i < ans.length; i++) {
                System.out.println(ans[i].getid() + ans[i].gett() + ans[i].geta() + ans[i].getp());

            }
        }

    }

    public static book[] sbbp(book[] b) {
        book[] ref = new book[0];
        for (int i = 0; i < b.length; i++) {
            ref = Arrays.copyOf(ref, ref.length + 1);
            ref[ref.length - 1] = b[i];
        }
        book k;
        for (int i = 0; i < ref.length; i++) {
            for (int j = i + 1; j < ref.length; j++) {
                if (ref[i].getp() > ref[j].getp()) {
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

class book {
    public int id;
    public String t;
    public String a;
    public double p;

    public book(int id, String t, String a, double p) {
        this.id = id;
        this.t = t;
        this.a = a;
        this.p = p;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String gett() {
        return t;
    }

    public void sett(String t) {
        this.t = t;
    }

    public String geta() {
        return a;
    }

    public void seta(String a) {
        this.a = a;
    }

    public double getp() {
        return p;
    }

    public void setp(double p) {
        this.p = p;
    }

}