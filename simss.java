/*Create a class Sim with below attributes:



simId - int

customerName - String

balance - double

ratePerSecond - double

circle - String



Write getters, setters and parameterized constructor as required. 



Public class Solution is already created with main method.


Code inside main method should not be altered else your solution might be 


scored as zero.You may copy the code from main method in eclipse to 

verify your implementation. 





Implement static method - transferCustomerCircle in Solution class.

This method will take first parameter as array of Sim class objects, 

second parameter as circle to be transferred (which is String parameter 

circle1) and third parameter as new circle (which is String parameter 

circle2).



Method will transfer the customer to new circle (circle2), where the

 circle attribute would match second parameter (circle1). 


Method will return array of Sim objects for which circle is transferred.


 Return array should be sorted in descending order of ratePerSecond

 (assuming ratePerSecond is not same for any of the Sim objects).





This method should be called from main method and display the simId,

customerName,circle and ratePerSecond of returned objects 

(as per sample output).



Main method mentioned above already has Scanner code to read values, 

create objects and test above methods. Hence do not modify it.






************************************************************************



Consider below sample input and output:



Input:

1
raj
100
1.5
KOL
2
chetan
200
1.6
AHD
3
asha
150
1.7
MUM
4
kiran
50
2.2
AHD
5
vijay
130
1.8
AHD
AHD
KOL



Output:

4 kiran KOL 2.2

5 vijay KOL 1.8

2 chetan KOL 1.6
 */
import java.util.*;

public class simss {
    public static void main(String args[]) {
        sim[] s = new sim[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            double c = sc.nextDouble();
            sc.nextLine();
            double d = sc.nextDouble();
            sc.nextLine();
            String e = sc.nextLine();

            s[i] = new sim(a, b, c, d, e);
        }
        String c1 = sc.nextLine();
        String c2 = sc.nextLine();

        sim[] ans = tcc(s, c1, c2);
        if (ans != null) {
            for (int i = ans.length - 1; i >= 0; i--) {
                System.out.println(ans[i].getid() + " " + ans[i].getcn() + " " + ans[i].getc() + " " + ans[i].getrps());
            }
        } else {
            System.out.println("No ");
        }
    }

    public static sim[] tcc(sim[] s, String c1, String c2) {
        sim[] ref = new sim[0];
        for (int i = 0; i < s.length; i++) {
            if (s[i].getc().equals(c1)) {
                ref = Arrays.copyOf(ref, ref.length + 1);
                s[i].c = c2;
                ref[ref.length - 1] = s[i];

            }
        }

        for (int i = 0; i < ref.length; i++) {
            for (int j = i + 1; j < ref.length; j++) {
                if (ref[i].getrps() > ref[j].getrps()) {
                    sim k = ref[i];
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

class sim {
    int id;
    String cn;
    double b;
    double rps;
    String c;

    public sim(int id, String cn, double b, double rps, String c) {
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

    public double getb() {
        return b;
    }

    public void setb(double b) {
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
