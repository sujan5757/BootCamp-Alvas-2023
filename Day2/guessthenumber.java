//Guess the NUmber
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Random Number Generator (1-10)");
		int p=1,ch,count=0,retry=5;
		int pin = rand.nextInt(11);
		while(p==1)
		{
		    System.out.print("\nEnter your Digit: ");
		    ch = sc.nextInt();
		    if(ch==pin)
		    {
		        p=0;
		        System.out.println("Guess is Correct\nYou Guessed the Number in "+count+" Attempts:)");
		    }
		    else{
		        
		        System.out.println("Wrong Digitt, Try Again:(");
		        System.out.println("Retry Attempts left: "+ --retry);
		        if(ch>pin){
		            System.out.println("Guess Lower Digit");
		        }
		        else{
		            System.out.println("Guess Higher Digit");
		        }
		        if(retry==0)
		        {
		            System.out.println("Attempts Finished:(");
		            p=0;
		        }
		        
		        count++;
		    }
		}
	}
}
