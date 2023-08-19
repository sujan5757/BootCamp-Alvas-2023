//Fibonacci number
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int i,n,a=0,b=1,nv;
		System.out.println("Enter the Number : ");
		n=sc.nextInt();
		nv=a+b;
		System.out.println("fibonacci series is :"+a+"\n"+b);
	
	    for(i=1;i<=n;i++)
	    {
	        System.out.println(nv);
	        a=b;
	        b=nv;
	        nv=a+b;
	    }
	}
}
