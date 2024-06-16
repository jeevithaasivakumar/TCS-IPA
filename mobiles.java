/*Create a class MobileDetails with the below attributes:

MobileId – int
Price - int
Brand – String
isFlagShip – boolean

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class MobileDetails with main method.

Implement two static methods – getTotalPrice() and getSecondMin() in MobileDetails class.

getTotalPrice method: 
----------------------------------------
This method will take two int input parameters which take object array and string brand. The method will return the total
price of mobiles of that brand.

If no mobile with the given brand is present in the array of MobileDetails objects, then the method should return 0.

getSecondMin method: 
----------------------------------------
This method will take object array which will return the second minimum price from the array and name of that mobile brand.

The above mentioned static methods should be called from the main method.

For getTotalPrice method: The main method should print the total price as it is, if the returned 
value is not null, or it should print “There are no mobile with given brand”. 

Before calling these static methods in main, use Scanner object to read the values of five objects referring attributes 
in the above mentioned attribute sequence.

Input :
---------------------------------------
101
25000
Samsung
True
102
19000
Redmi
False
103
28000
Nokia
True
104
25000
Realme
False
105
40000
Samsung
True
Samsung

Output :
-----------------------------------------
65000
Samsung : 25000
Realme : 25000 */
import java.util.*;

public class mobiles {

    public static void main(String[] args) {
        mobile[] m = new mobile[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            int b = sc.nextInt();
            sc.nextLine();
            String c = sc.nextLine();
            Boolean d = sc.nextBoolean();
            sc.nextLine();
            m[i] = new mobile(a, b, c, d);
        }
        String ib = sc.nextLine();
        int ans = gtp(m, ib);

        System.out.println(ans);
        mobile[]res =gsm(m);
        if(res!=null){
            for(int i=0;i<res.length;i++){
            System.out.println(res[i].getb()+":"+res[i].getp());

            }
        }
        else{
            System.out.println("Prices are same");
        }

    }

    public static int gtp(mobile[] m, String ib) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i].getb().equals(ib)) {
                sum += m[i].getp();
            }
        }
        if (sum > 0) {
            return sum;
        } else {
            return 0;
        }
    }
    public static mobile[] gsm(mobile[] m){
mobile[] ref=new mobile[0];
for(int i=0;i<m.length;i++){
    for(int j=i+1;j<m.length;j++){
        if(m[i].getp() > m[j].getp()){
            mobile temp = m[i];
            m[i]=m[j];
            m[j]=temp;
        }
    }
}
for(int i=1;i<m.length;i++){
    if(m[0].getp()<m[i].getp()){
        ref =Arrays.copyOf(ref,ref.length+1);
        ref[ref.length-1]=m[i];
        break;
    }
}
for (int j = 0; j < m.length; j++) 
        {
            if(ref[0].getp()==m[j].getp() && ref[0].getid()!=m[j].getid()) 
            {
                ref = Arrays.copyOf(ref,ref.length+1);
                ref[ref.length-1] = m[j];
            }
        }
        if(ref.length>0){
            return ref;
        }
        return null;
    }
}

class mobile {
    private int id;
    private int p;
    private String b;
    private Boolean f;

    public mobile(int id, int p, String b, Boolean f) {
        this.id = id;
        this.p = p;
        this.b = b;
        this.f = f;
    }

    public int getp() {
        return p;
    }

    public void setp(int p) {
        this.p = p;
    }

    public String getb() {
        return b;
    }

    public void setb(String b) {
        this.b = b;
    }
    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id=id;
    }

}
