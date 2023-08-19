//normal program  Married or not 
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	char gender,married;
	String fname,lname;
	int age;
	System.out.print("What is your gender (M or F)");
	gender=sc.next().charAt(0);
	System.out.print("Enter First and Last name");
	fname=sc.next();
	lname=sc.next();
	System.out.print("What is your age");
	age=sc.nextInt();
	if(gender=='F')
	{
		if(age>20) {
			System.out.print("Married or not(Y or N)");
			married=sc.next().charAt(0);
			if(married=='Y')
			{
				System.out.println("Mrs."+fname+" "+lname);
			}
			else
				System.out.println("Ms."+fname+" "+lname);
		}
		else
			System.out.println(fname+" "+lname);
	}
	else{
		if(age>20)
			System.out.println("Mr."+fname+" "+lname);
		else
			System.out.println(fname+" "+lname);
	}
	sc.close();
}
}
