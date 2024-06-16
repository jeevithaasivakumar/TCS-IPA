/*Create a class Phone with below attributes: 

phoneId - int 
os - String 
brand - String 
price - int

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create class Solution with main method.

Implement two static methods - findPriceForGivenBrand and getPhoneIdBasedOnOs in Solution class.

findPriceForGivenBrand method: 
----------------------------------
This method will take two input parameters - array of Phone objects and string 
parameter brand. The method will return the sum of the price attribute from phone objects for the brand passed 
as parameter. If no phones with the given brand is present in the array of phone objects, then the method should 
return 0.

getPhoneIdBasedOnOs method: 
----------------------------------
This method will take a String parameter os, along with the array of Phone objects. 
The method will return the phone object, if the input String parameter matches with the os attribute of the phone 
object and its price attribute is greater than or equal to 50000. If any of the conditions are not met, then the 
method should return null.

Note : No phone object would have the same value for os attribute. All phone object would have the price greater than 0. 
All the searches should be case insensitive.

These above mentioned static methods should be called from the main method.

For findPriceForGivenBrand method - The main method should print the price as it is if the returned price is greater 
than 0, or it should print "The given Brand is not available".

For getPhoneIdBasedOnOs method - The main method should print the phoneId of the returned phone object. If the returned 
value is null then it should print "No phones are available with specified os and price range".

Before calling these static methods in main, use Scanner object to read the values of four Phone objects referring 
attributes in the above mentioned attribute sequence. Next, read the value for brand and os.

Input
--------------
111
iOS
Apple
30000
222
android
Samsung
50000
333
Symbian
HTC
12000
444
Paranoid
HTC
89000
Blackberry
aNdRoid

Output
------------------
The given Brand is not available
222 */
import java.util.Arrays;
import java.util.Scanner;

public class phones {
    public static void main(String[] args) {
        phone[] p = new phone[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            p[i] = new phone(a, b, c, d);
        }
        String ib = sc.nextLine();
        String ios = sc.nextLine();
        int ans = fpgb(p, ib);
        if (ans != 0) {
            System.out.println(ans);
        } else {
            System.out.println("The given Brand is not available");
        }
        int res = gpidbo(p, ios);
        if (res != 0) {

            System.out.println(res);

        } else {
            System.out.println("No phones are available with specified os and price range");
        }

    }

    public static int fpgb(phone[] p, String ib) {
        int sum = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i].getb().equals(ib)) {
                sum += p[i].getpr();
            }
        }
        if (sum > 0) {
            return sum;
        } else {
            return 0;
        }
    }

    public static int gpidbo(phone[] p, String ios) {

        for (int i = 0; i < p.length; i++) {
            if (p[i].getos().equalsIgnoreCase(ios) && p[i].getpr() >= 50000) {
                return p[i].getid();
            }
        }
        return 0;

    }
}

class phone {
    public int id;
    public String os;
    public String b;
    public int pr;

    public phone(int id, String os, String b, int pr) {
        this.id = id;
        this.os = os;
        this.b = b;
        this.pr = pr;
    }

    public int getpr() {
        return pr;
    }

    public String getos() {
        return os;
    }

    public void setpr(int pr) {
        this.pr = pr;
    }

    public void setos(String os) {
        this.os = os;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getb() {
        return b;
    }

    public void setb(String b) {
        this.b = b;
    }
}
