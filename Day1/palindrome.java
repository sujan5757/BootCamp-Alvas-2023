//palindrome 
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int rem,num,rev=0,temp;
		System.out.println("Enter the Number : ");
		num=sc.nextInt();
		temp=num;
		while(num>0)
		{
		    rem=num%10;
		    rev=(rev*10)+rem;
		    num=num/10;
		}
		if(temp==rev)
		{
		    System.out.println("Palindrome Number");
		}
		else
		{
		    System.out.println("Not a Palindrome ");
		}
	}
}
