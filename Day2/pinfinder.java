//PIN FINDER

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pin=456434;
		System.out.println("THE BACK OF INDIA WELCOMES YOU");
		int p=1,ch,retry=3;
		while(p==1)
		{
		    System.out.print("\nEnter your 6-Digit PIN: ");
		    ch = sc.nextInt();
		    if(ch==pin)
		    {
		        p=0;
		        System.out.println("Pin Accepted. You have access to your Account Now:)");
		    }
		    else{
		       
		        System.out.println("Wrong PIN, Try Again:(");
		        System.out.println("Retry Attempts left: "+ --retry);
		        if(retry==0)
		        {
		            System.out.println("Attempts Exceeded:(");
		            p=0;
		        }      
		    }
		}
	}
}
