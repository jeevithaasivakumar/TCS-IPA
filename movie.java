/*Create class Movie with below attributes: 

movieName - String 
company - String 
genre - String 
budget - int

Create class Solution and implement static method "getMovieByGenre" in the Solution class. This method will 
take array of Movie objects and a searchGenre String as parameters. And will return another array of Movie 
objects where the searchGenre String matches with the original array of Movie object's genre attribute 
(case insensitive search).

Write necessary getters and setters.

Before calling "getMovieByGenre" method in the main method, read values for four Movie objects referring the 
attributes in above sequence along with a String searchGenre. Then call the "getMovieByGenre" method and write
logic in main method to print "High Budget Movie",if the movie budget attribute is greater than 80000000 else 
print "Low Budget Movie".

Input
---------
aaa
Marvel
Action
250000000
bbb
Marvel
Comedy
25000000
ccc
Marvel
Comedy
2000000
ddd
Marvel
Action
300000000
Action

Output
-------------------
High Budget Movie
High Budget Movie */
import java.util.*;

public class movie {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Movies[] arr = new Movies[4];// create array with objects
        for (int i = 0; i < 4; i++) { // pushing objects into class
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            arr[i] = new Movies(a, b, c, d);
        }
        String genre= sc.nextLine();
        String[] res=getmoviebygenre(arr, genre);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
        
    }
    
    public static String[] getmoviebygenre(Movies[] arr,String genre){
       String[] arr2 = new String[0]; 
       for(int i=0;i<arr.length;i++){
        if(arr[i].getgenre().equalsIgnoreCase(genre)){
            if(arr[i].getbudget()>80000000){
                arr2=Arrays.copyOf(arr2,arr2.length+1);
                arr2[arr2.length-1]="high budget movie";
            }
            else{
                arr2=Arrays.copyOf(arr2,arr2.length+1);
                arr2[arr2.length-1]="low budget movie";
            }
        }
       }
       return arr2;

    }
}

class Movies {
    String moviename;
    String productioncomp;
    String genre;
    int budget;

    public Movies(String moviename, String productioncomp, String genre, int budget) {
        this.moviename = moviename;
        this.productioncomp = productioncomp;
        this.genre = genre;
        this.budget = budget;
    }

    public String getmoviename() {
        return moviename;
    }

    public String getproductioncomp() {
        return productioncomp;
    }

    public String getgenre() {
        return genre;
    }

    public int getbudget() {
        return budget;
    }
    public void setmoviename(String moviename){
        this.moviename=moviename;
    }
    public void setproductioncomp(String productioncomp){
        this.productioncomp=productioncomp;
    }
    public void setgenre(String genre){
        this.genre=genre;
    }
    public void setbudget(int budget){
        this.budget=budget;
    }
}