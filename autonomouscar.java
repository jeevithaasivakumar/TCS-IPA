/*Create a class AutonomousCar with the below attributes:

carld – int
brand – String 
noOfTestsConducted – int
noOfTestsPassed- int
environment – String

Write getters, setters for the above attributes . Create constructor which takes parameter in the above sequence 
except grade.

Create class Solution with main method. Implement two static methods – findTestPassedByEnv and updateCarGrade in 
Solution class.

findTestPassedByEnv method:

This method will take two input parameters -array of AutonomousCar objects and string parameter environment. The method 
will return the sum of the noOfTestsPassed attribute from autonomousCar objects for the environment passed as parameter. 
If no autonomousCar with the given environment is present in the array of AutonomousCar objects, then the method should 
return 0.

updateCarGrade method:

This method will take a String parameter brand, along with the array of AutonomousCar objects. The method will return 
the autonomousCar object, if the input String parameter matches with the brand attribute of the autonomousCar object. 
Before returning the object, the grade should be derived based on the rating calculation mentioned below. This grade 
value should be assigned to the object. If any of the above conditions are not met, then the method should return null. 
The grade attribute should be calculated as follows: rating .(noOfTestsPassed * 100)/noOfTestsConducted 
If the rating > = 80 then grade should be ‘A1’, otherwise the grade should be ‘B2’.

The above mentioned static methods should be called from the main method. For findTestPassedByEnv method – The main 
method should print the totalTestPassed as it is, if the returned value is greater than 0, or it should print “There 
are no tests passed in this particular environment”.

For updateCarGrade method – The main method should print the brand and grade of the returned autonomousCar object. 
The brand and grade should be concatinated with :: while printing. eg:- Tesla::A1, where Tesla is the brand and Al 
is the grade.

If the returned value is null then it should print “No Car is available with the specified brand”. Before calling these 
static methods in main, use Scanner object to read the values of four autonomousCar objects referring attributes in the 
above mentioned attribute sequence (except grade attribute). Next, read the value for environment and brand.

Input
----------------
100
Tesla
1000
500
Hills
200
Ford
2000
1500
Desert
300
Royce
3000
1700
Hills
400
Mercedez
1000
400
Desert
Desert
Mercedez

Output
-----------
1900
Mercedez::B2 */
import java.util.Arrays;
import java.util.Scanner;

public class autonomouscar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        car[] c = new car[4];
        for (int i = 0; i < c.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            int f = sc.nextInt();
            sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            String e = sc.nextLine();
            c[i] = new car(a, b, f, d, e);
        }
        String ie = sc.nextLine();
        String ib = sc.nextLine();
        int ans = ftpe(c, ie);
        if (ans != 0) {
            System.out.println(ans);
        } else {
            System.out.println("There are no tests passed in this particular environment");
        }
        car[] res = ucg(ib, c);
        if(res!=null){
            for(int i=0;i<res.length;i++){
            int grade;
        
        grade= (res[i].getp()*100)/res[i].gett();
         if(grade >=80){
        System.out.println(res[i].getb()+":"+"A1");
        }
        else{
        System.out.println(res[i].getb()+":"+"B2");

        }
    }
}

    }

    public static int ftpe(car[] c, String ie) {
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i].gete().equals(ie)) {
                sum += c[i].getp();
            }

        }
        if (sum > 0) {
            return sum;
        }
        return 0;
    }

    public static car[] ucg(String ib, car[] c) {
        car[] ref = new car[0];
        for (int i = 0; i < c.length; i++) {
            if (c[i].getb().equals(ib)) {
                ref = Arrays.copyOf(ref, ref.length + 1);
                ref[ref.length - 1] = c[i];
            }
        }
        if(ref.length >0){
            return ref;
        }
        else{
            return null;
        }
        

    }
}

class car {
    public int id;
    public String b;
    public int t;
    public int p;
    public String e;

    public car(int id, String b, int t, int p, String e) {
        this.id = id;
        this.b = b;
        this.t = t;
        this.p = p;
        this.e = e;
    }

    public int getp() {
        return p;
    }

    public void setp(int p) {
        this.p = p;
    }

    public String gete() {
        return e;
    }

    public void sete(String e) {
        this.e = e;
    }

    public String getb() {
        return b;
    }

    public void setb(String b) {
        this.b = b;
    }
    public int gett(){
        return t;
    }
    public void sett(int t){
        this.t=t;
    }
}
