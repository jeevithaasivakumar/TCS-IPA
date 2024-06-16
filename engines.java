/*Create a class Engine with the below attributes:

engineld – int

engineName – String

engine Type – String

enginePrice – double

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class MyClass with main method.

Implement two static methods – findAvgEnginePriceByType and searchEngineByName in MyClass class.

findAvgEnginePriceByType method: This method will take two input parameters Engine objects and String parameter. 
The method will return the average price of Engines from array of Engine objects for the given engine type 
(String parameter passed). If no Engine with the given type is present in the array of Engine objects, then the method 
should return 0.


searchEngineByName method: This method will take a String parameter and an array of Engine objects as the other parameter. 
The method will return Engine object array in an ascending order of their engine ids, from the array of Engine objects whose 
name attribute matches with the given engine name (String parameter passed). If no Engine with the given name is present in 
the array of Engine objects, then the method should return null.

Note: No two Engine object would have the same engine id.

All searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For findAvgEnginePriceByType method: The main method should print the average enginePrice of Engines as it is, if the returned 
value is greater than 0, or it should print “There are no engine with given type”.

For searchEngineByName method: The main method should print the engineld from the returned Engine object array if the returned 
value is not null. If the returned value is null, then it should print “There are no engine with the given name”. 

Before calling these static methods in main, use Scanner object to read the values of four Engine objects referring attributes 
in the above mentioned attribute sequence. next, read the value of two String parameters for capturing engine type and engine 
name respectively.

Input :

1001
Maruti
Diesel
20000
1002
Kia
Pertro
17000
1003
Hyundai
Diesel
24000
1000
Maruti
Petrol
27500
Petrol
Maruti

Output :

27500
1000
1001 */
import java.util.Scanner;
import java.util.*;

public class engines {
    public static void main(String[] args) {
        engine[] e = new engine[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            sc.nextLine();
            e[i] = new engine(a, b, c, d);
        }
        String it = sc.nextLine();
        String in = sc.nextLine();
        int ans = faenpt(e, it);
        if (ans != 0) {
            System.out.println(ans);
        } else {
            System.out.println("There are no engine with given type");
        }
        engine[] res = sebn(e, in);
        if (res != null) {
            for (int i = 0; i < res.length; i++) {
                System.out.println(res[i].getid());

            }
        } else {
            System.out.println("There are no engine with the given name");
        }
    }

    public static int faenpt(engine[] e, String it) {
        int sum = 0;
        int count = 0;
        
        for (int i = 0; i < e.length; i++) {
            if (e[i].gett().equals(it)) {
                sum += e[i].getp();
                count++;
            }
        }
        if (count > 0) {
            int avg = sum / count;
            return avg;
        } else {
            return 0;
        }
    }

public static engine[] sebn(engine[] e, String in){
    engine[] ref= new engine[0];
for(int i=0;i<e.length;i++){
    if(e[i].getn().equals(in)){
ref= Arrays.copyOf(ref,ref.length+1);
ref[ref.length-1]=e[i];
    }
}
for(int i=0;i<ref.length;i++){
    for(int j=i+1;j<ref.length;j++){
        if(ref[i].getid()>ref[j].getid()){
            engine k =ref[i];
            ref[i]=ref[j];
            ref[j]=k;
        }
        
    }
}
if(ref.length>0){
    return ref;
}
else{
    return null;
}
}
}

class engine {

    private int id;
    private String n;
    private String t;
    private double p;

    public engine(int id, String n, String t, double p) {
        this.id = id;
        this.n = n;
        this.t = t;
        this.p = p;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getn() {
        return n;
    }

    public void setn(String n) {
        this.n = n;
    }

    public String gett() {
        return t;
    }

    public void sett(String t) {
        this.t = t;
    }

    public double getp() {
        return p;
    }

    public void setp(double p) {
        this.p = p;
    }
}
