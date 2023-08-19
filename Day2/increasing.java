/*5)Write a program that accepts three numbers from the user and prints “increasing” if the number are in ascending order, ”decreasing” if the number are in decreasing order, and “Neither increasing or decreasing order” otherwise.*/
import java.util.Scanner;

public class exceed {
    public static void main(String[] args) {
        System.out.println("Three numbers ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b && b>c)
        {
           System.out.println("DESCENDING"); 
        }
        else if(c>b && b>a)
        {
           System.out.println("INCREASING"); 
        }
        else
        {
            System.out.println("RANDOM "); 
        }
    }
}
