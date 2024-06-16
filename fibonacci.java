import java.util.*;
public class fibonacci {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n = sc.nextInt();
int a =1,b=1;
int c;
System.out.println(a);
System.out.println(b);
while(n-2>0){
    c=a+b;
    System.out.println(c);
    a=b;
    b=c;
    n--;
    
}



}
}
