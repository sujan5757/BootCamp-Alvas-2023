/*4) Write a java program that reads a floating point number if the number is zero it prints zero otherwise print “positive” or “negative” add “small” if the absolute value of the number is less than 1 or “large” if it exceeds 1,000,000*/
import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		float num1 = sc.nextFloat();
		if(num1==0)
		    System.out.println("Zero");
		else if(num1>0 && Math.abs(num1)<1){
		    System.out.println("Small Positive Number");
		}
		else if(num1>0 && Math.abs(num1)>1000000){
		    System.out.println("Large Positive Number");
		}
		else if(num1>0){
		    System.out.println("Positive Number");
		}
		else if (num1<0 && Math.abs(num1)<1){
		    System.out.println("Small Negative Number");
		}
		else if(num1<0 && Math.abs(num1)>1000000){
		        System.out.println("Large Positive Number");
		}
		else if(num1<0){
		    System.out.println("Negative Number");
		}
		
	}
}
