
/*create a class Footwear which consists of the below attributes.
  footwearId=int
  footwearName=String
  footwearType=String
  price =int

the above attributes should be private.
write getter and setter and parametrised constructor as required.

create the class footwearProgrammm with the main method.
implement the 2 static methods.getCountByType and
getSecondHighestPriceByBrand in the Solution class.


getCountByType method:
   this method will take two input parameters.
array of the Footwear objects and string parameter footwear type.
this method will return the count of the footwears from array of the
footwear objects for the given type of footwear.
if no footwear with the given footwear type is found in the
array of footwear abjects,then the method should return 0.



getSecondHighestPriceByBrand method:
  this method will take 2 input parameters-array of footwear objects and string parameter inputFootwearName.the method
will return the second highest footwear objects based on the price from the array of the Footwear objects


whose brand name matches with the input string parameter.


if no footwear with the given brand is present in the array of the footwear objects,the the method
should return null.

NOTE: no two footwear objects would have the same footwearId.All the searches should be case insensitive.
the above mentioned static methods should be called from the main method.

for getCountByType method- the main method should print the count of the footwears ,if the returned value
is greater than zero. or it should print "Footwear not available";

for getSecondHighestPriceByBrand method-The main method should print price from the returned footwear objects


if the returned footwear object is not null.else it should print "Brand not available".
for example.
112
ABC
25555
  where 112 is the footwear id,ABC is brand name,25555 is price.

consider the sample input and output.
100
Sketchers
sneekers
12345
103
Puma
running shoes
10099
102
reebok
Running shoes
5667
101
Reebok
running shoes
5656
99
reebok
floaters
5666
Running shoes
reebok

Sample output:
3
99
reebok
5666

Sample input2:

100
Puma
sneekers
12345
101
Puma
sneekers
10099
102
Puma
sneekers
5000
102
Reebok
sneekers
8000
104
Puma
floaters
2000
running shoes
bata

Sample output:
Footwear not available
Brand not available */
import java.util.*;

public class footwear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        fw[] arr = new fw[5];
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            arr[i] = new fw(a, b, c, d);
        }
        String ipt = sc.nextLine();
        String ipn = sc.nextLine();
        int ans = getCountByType(arr, ipt);
        if (ans != 0) {
            System.out.println(ans);

        } else {
            System.out.println("Footwear not available");
        }
        fw res = getsecondhighestpricebrand(arr, ipn);
        if (res != null) {

            System.out.println(res.getid());
            System.out.println(res.getn());
            System.out.println(res.getp());

        } else {
            System.out.println("Brand not available");
        }

    }

    public static int getCountByType(fw[] arr, String ipt) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].gett().equalsIgnoreCase(ipt)) {
                count++;

            }

        }
        if (count > 0) {
            return count;
        }

        return 0;

    }

    public static fw getsecondhighestpricebrand(fw[] arr, String ipn) {
        int[] ref = new int[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getn().equals(ipn)) {
                ref = Arrays.copyOf(ref, ref.length + 1);
                ref[ref.length - 1] = arr[i].getp();

            }

        }
        Arrays.sort(ref);

        if (ref.length > 0) {
            int x = ref[ref.length - 2];
            for (int i = 0; i < arr.length; i++) {
                if (x == arr[i].getp()) {
                    return arr[i];
                }

            }

        }
        return null;

    }
}

class fw {
    public int id;
    public String n;
    public String t;
    public int p;

    public fw(int id, String n, String t, int p) {
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

    public int getp() {
        return p;
    }

    public void setp(int p) {
        this.p = p;
    }
}