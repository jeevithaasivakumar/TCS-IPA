/*Create a class TravelAgencies with below attributes:

regNo – int
agencyName – String
pakageType – String
price – int
flightFacility – boolean

Write getters, setters for the above attributes . Create constructor which takes parameter in the above sequence.

Create class Solution with main method. Implement two static methods – findAgencyWithHighestPackagePrice and 
agencyDetailsforGivenIdAndType in Solution class.

findAgencyWithHighestPackagePrice method:

This method will take array of TravelAgencies objects as an input parameter and return the highest package 
price from the given array of objects.

agencyDetailsForGivenldAndType method:

This method will take three input parameters -array of TravelAgencies objects, int parameter regNo and String
parameter packageType. The method will return the TravelAgencies object based on below conditions.

FlightFacility should be available.
The input parameters(regNo and packageType) should matched with the regNo and packageType of TravelAgencies object.
If any of the above conditions are not met, then the method should return null. Note : Same Travel agency can 
have more than one package type. Travel agency and package type combination is unique. All the searches should 
be case insensitive.

The above mentioned static methods should be called from the main method.


For findAgencyWithHighestPackagePrice method – The main method should print the highestPackagePrice as it is. 
For agencyDetailsForGivenldAndType method -The main method should print the AgencyName and price of the returned 
object.The AgencyName and price should be concatinated with : while printing.
---------
Input
---------
123
A2Z Agency
Platinum
50000
true
345
SSS Agency
Gold
30000
false
987
Cox and Kings
Diamond
40000
true
888
Global Tours
Silver
20000
false
987
Diamond
-------------------------------
Output
-------------------------------
50000
Cox and Kings:40000 */
import java.util.*;
public class Travel{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        travelagencies[] arr = new travelagencies[4]; // new travelagencies object is created using constructor and stored in arr[i]
        for(int i=0;i<4;i++){
            int a= sc.nextInt(); 
            sc.nextLine();
            String b=sc.nextLine(); 
            String c = sc.nextLine();
            int d = sc.nextInt();
            boolean e= sc.nextBoolean();

            arr[i]= new travelagencies(a,b,c,d,e);

        }
        int regno = sc.nextInt(); sc.nextLine();
        String packagetype = sc.nextLine();
        int max = findagencywithhighestpackageprice(arr);
        System.out.println(max);
        travelagencies result = agencydetailsforgivenidandtype(arr, regno, packagetype);
        System.out.println(result.getagencyname()+":"+result.getprice());
    }

        public static int findagencywithhighestpackageprice(travelagencies[] arr){
        //takes the array objects and prints the highest 
            int max = arr[0].getprice();
            for(int i=1;i<arr.length;i++){
                if(max < arr[i].getprice()){
                    max = arr[i].getprice(); //finds highest package
                }
            } 
            if(max<0){
                return 0;
            }
            else{
                return max;
            }
        
    }
    public static travelagencies agencydetailsforgivenidandtype(travelagencies[] arr, int regno, String packagetype){
        for(int i=0;i<arr.length;i++){
            if(arr[i].flightfacility==true){
                if(arr[i].getregno()==regno && arr[i].packagetype.equals(packagetype)){
                    return arr[i];
                }
            }
        }
        return null;
    }
}

 class travelagencies
{
//attributes
    int regno;
    String agencyname;
    String packagetype;
    int price;
    boolean flightfacility;
    //constructor -- initialize the attributes
    public travelagencies(int regno,String agencyname,String packagetype,int price,boolean flightfacility){
        this.regno= regno;
        this.agencyname=agencyname;
        this.packagetype=packagetype;
        this.price=price;
        this.flightfacility=flightfacility;
    } 
    //getter -- to access them
    public int getregno(){
        return regno;
    }
    public String getagencyname(){
        return agencyname;
    }
    public String getpackagetype(){
        return packagetype;
    }
    public int getprice(){
        return price;
    }
    public boolean isflightfacility(){
        return flightfacility;
    }

}