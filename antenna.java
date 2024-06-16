/*create a class Antenna with below attributes.
antennaid=int
antennaName=String
projectLead=String
antennaVSWR=double

the above attribute should be private ,write getter and setter and parametrized constructor as well.

create class MyClass with main method.
implement two static methods searchAntennaByName and sortAntennaByVSWR in MyClass class.


searchAntennaByName :
  This method will take an array of Antenna objects and the
string value as input parameter.The method will find out Antenna name(String parameter
passed) .it will return Antennaid if found.if there is no Antenna that matches then the
method will return zero.
the main method should print the antennaid,if the returned value is not 0.if the
returned value is 0 then print,"There is no antenna with the given parameter".


sortAntennaByVSWR:
This method will take an array of Antenna Objects and a double value as input.
this method will return an array of Antenna objects sorted in ascending orderof their


antennaVSWR. which is less than VSWR(double value passed)       

  the main method should print name of the project leads from the returned array
if the returned value is not null.if the returned value is null then main method should
print "No Antenna found";


input1:

111
Reconfigurable
Hema
0.4
222
Wearable
Kavya
0.9
333
Microstrip
Teju
0.3
444
Dielectric
Sai
0.65
Microstrip
0.5

output:
333
Teju
Hema


input 2:
111
Reconfigurable
Hema
0.3
222
Wearable
Kavya
0.9
333
Microstrip
Teju
0.4
444
Dielectric
Sai
0.65
Resonator
0.25

output:
There is no antenna with given parameter
No Antenna found */
import java.util.*;

public class antenna {
    public static void main(String[] args) {
        antena arr[] = new antena[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            sc.nextLine();
            arr[i] = new antena(a, b, c, d);
        }
        String in = sc.nextLine();
        double iv = sc.nextDouble();
        sc.nextLine();
        int ans = san(arr, in);
        if (ans!= 0) {
            System.out.println(ans);
        } else {
            System.out.println("No antena with given parameter");
        }
        antena[] res = sabv(arr,iv);
        if(res!=null){
            for(int i=0;i<res.length;i++){
            System.out.println(res[i].getl());
            }
        }
        else{
            System.out.println("no antena found");
        }
    }

    public static int san(antena[] arr, String in) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getn().equals(in)) {
                return arr[i].getid();
            }
        }
        return 0;

    }

    public static antena[] sabv(antena[] arr,double iv){
        antena[] ref = new antena [0];
for(int i=0;i<arr.length;i++){
    if(arr[i].getv() < iv){
        ref= Arrays.copyOf(ref,ref.length+1);
        ref[ref.length-1]= arr[i];
    

    }
}
for(int i=0;i<ref.length;i++){
    for(int j=0;j<ref.length-i-1;j++){
        if(ref[i].getv() > ref[i+1].getv()){
            antena temp =ref[i];
            ref[i]=ref[i+1];
            ref[i+1]=temp;
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

class antena {
    private int id;
    private String n;
    private String l;
    private double v;

    public antena(int id, String n, String l, double v) {
        this.id = id;
        this.n = n;
        this.l = l;
        this.v = v;
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
    public double getv(){
        return v;
    }
    public void setv(double v){
        this.v=v;
    }
    public String getl(){
        return l;
    }
    public void setl(String l){
        this.l=l;
    }

}
