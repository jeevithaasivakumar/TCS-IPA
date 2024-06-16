/* Create the class Flowers with below attribute:

flowerId-int;
flowerName-String;
price-int;
rating-int;
type-String;

The above attributes must be private,write getters and setters and parametrized constructor as well.

Create class MyClass with main method.

Implement one static method:findMinPriceByType in MyClass class.

findMinPriceByType Method:

This method will take two input parameters:Array of Flower objects and String parameter.This method will return the minimum 
priced flower object from  array of Flower objects for the given type(String parameter),only if the rating is greater than 
3. If no Flowers with the above conditions are present in the array of the flower objects,then the method will return null.

For this method-The main method  should print the flowerId from the returned object if the returned value is not null.
else it should print "There is no flower with given type".

**********************************************************************

input1:

123

Yellow trout lilly

3000

5

ephemerals

345

snowdrop

2500

4

ephemerals

321

Yarrow

1000

4

perennials

213

red trillium

2250

4

ephemerals

ephemerals



output:

213





**********************

input2:

123

Yellow trout lilly

3000

5

ephemerals

345

snowdrop

2500

4

ephemerals

321

Yarrow

1000

4

perennials

213

red trillium

2250

4

ephemerals

Biennial


output2:

There is no flower with given type. */
import java.util.*;

public class flowers {
   public static void main(String[] args) {
      flower[] f = new flower[4];
      Scanner sc = new Scanner(System.in);
      for (int i = 0; i < 4; i++) {
         int a = sc.nextInt();
         sc.nextLine();
         String b = sc.nextLine();
         int c = sc.nextInt();
         sc.nextLine();
         int d = sc.nextInt();
         sc.nextLine();
         String e = sc.nextLine();
         f[i] = new flower(a, b, c, d, e);
      }
      String it = sc.nextLine();
      int ans = fmpbt(f, it);
      if (ans != 0) {
         System.out.println(ans);

      } else {
         System.out.println("There is no flower with given type");
      }
   }

   public static int fmpbt(flower[] f, String it) {
      flower[] ref = new flower[0];
      for (int i = 0; i < f.length; i++) {
         if (f[i].gett().equalsIgnoreCase(it) && f[i].getr() > 3) {
            ref = Arrays.copyOf(ref, ref.length + 1);
            ref[ref.length - 1] = f[i];
         }
      }
      if (ref.length > 0) {
         flower min = ref[0];
         for (int i = 0; i < ref.length; i++) {
            if (min.getp() > ref[i].getp()) {
               min = ref[i];
            }
         }
         return min.getid();

      } else {
         return 0;
      }
   }

}

class flower {
   private int id;
   private String n;
   private int p;
   private int r;
   private String t;

   public flower(int id, String n, int p, int r, String t) {
      this.id = id;
      this.n = n;
      this.p = p;
      this.r = r;
      this.t = t;

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

   public int getp() {
      return p;
   }

   public void setp(int p) {
      this.p = p;
   }

   public int getr() {
      return r;
   }

   public void setr(int r) {
      this.r = r;
   }

   public String gett() {
      return t;
   }

   public void sett(String t) {
      this.t = t;
   }
}
