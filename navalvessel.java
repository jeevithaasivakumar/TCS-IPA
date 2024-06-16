/*Create a class NavalVessel with the below attributes:

vesselld – int
vesselName – String
noOfVoyagesPlanned – int
noOfVoyagesCompleted – int
purpose – String


Write getters, setters for the above attributes. Create constructor which takes parameter in the above 
sequence except classification.

Create class Solution with main method. Implement two static methods – findAvgVoyagesByPct and findVesselByGrade 
in Solution class.

findAvgVoyagesByPct method:

This method will take two input parameters -array of NavalVessel objects and int parameter percentage. The method will 
return the average of the noOfVoyagesCompleted attribute from NavalVessel objects which meets the percentage requirement 
as mentioned below.The percentage for each navalVessel is calculated as 
percentage .(noOfVoyagesCompleted * 100)/noOfVoyagesPlanned. If the above calculated percentage is greater than or equal 
to the percentage passed as the parameter, then those objects should participate in the average calculation. If there are 
no objects with the mentioned criteria, then the method should return 0.

findVesselByGrade method:

This method will take a String parameter purpose, along with the array of NavalVessel objects. The method will return the 
NavalVessel object, if the input String parameter matches with the purpose attribute of the NavalVessel object. Before 
returning the object, the classification should be derived as mentioned below. This classification value should be assigned 
to the object before returning. If any of the above conditions are not met, then the method should return null. The 
classification attribute should be calculated based on the percentage calculation mentioned above. 
If the percentage = 100 then classification should be ‘Star’, if percentage is between 99 and 80 then classification should 
be ‘Leader, if percentage is between 79 and 55 then classification should be ‘Inspirer' otherwise the classification should 
be ‘Striver’ If the returned value is null then it should print “No Naval Vessel is available with the specified purpose”.

Before calling these static methods in main, use Scanner object to read the values of four NavalVessel objects referring 
attributes in the above mentioned attribute sequence (except the classification attribute). Next, read the value for 
percentage and purpose.

Input
-------------------
111
Rojer
100
100
Passenger
222
Kalam
200
100
Goods
333
Yashwin
400
300
Army
444
Thanishwini
500
500
Welfare
75
Army

Output
------------------
300
Yashwin%Inspirer */
import java.util.*;

public class navalvessel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        vesel[] v = new vesel[4];
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            String e=sc.nextLine();

            v[i] = new vesel(a, b, c, d, e);
        }
        int percentage = sc.nextInt();sc.nextLine();
        String ip = sc.nextLine();
        int ans = fvbp(v, percentage);
        if (ans != 0) {
            System.out.println(ans);
        } else {
            System.out.println(" ");
        }
        vesel[] res = fvbg(v, ip);
        if(res!=null){
            for(int i=0;i<res.length;i++){
                int grade = (res[i].getc()*100)/res[i].getp();

            if(grade==100){
                System.out.println(res[i].getn()+"%Star");
            }
            else if(grade>=80 && grade<=99){
                System.out.println(res[i].getn()+"%Leader");

            }
            else if (grade>=55 && grade<=79){
                System.out.println(res[i].getn()+"%Inspirer");

            }
            else{
                System.out.println(res[i].getn()+"%Striver");

                }
        }
    }
  
    }

    public static int fvbp(vesel[] v, int percentage) {
        int count = 0, sum = 0;
        for (int i = 0; i < v.length; i++) {
            if (((v[i].getc() * 100) / v[i].getp()) >= percentage) {
                sum += v[i].getc();
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
    public static vesel[] fvbg(vesel[] v, String ip){
         vesel[] ref =new vesel[0];
for(int i=0;i<v.length;i++){
    if(v[i].getpur().equalsIgnoreCase(ip)){
        ref = Arrays.copyOf(ref,ref.length+1);
        ref[ref.length-1]=v[i];
        
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

class vesel {
    public int id;
    public String n;
    public int p;
    public int c;
    public String pur;
    public vesel(int id, String n,int c2, int c, String pur){
        this.id=id;
        this.n=n;
        this.p=c2;
        this.c=c;
        this.pur=pur;
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
    public int getc() {
        return c;
    }
    public void setc(int c) {
        this.c = c;
    }
    public String getpur() {
        return pur;
    }
    public void setpur(String pur) {
        this.pur = pur;
    }
}
