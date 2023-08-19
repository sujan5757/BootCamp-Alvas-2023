/* 3)Write a program  in java to input 5 numbers from the keyboard and find their sum and average
*/
import java.util.*;

public class Main
{
public static void main(String[] args) {
    float a,b,c,d,e;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Five Numbers :");
    a=sc.nextFloat();
    b=sc.nextFloat();
    c=sc.nextFloat();
    d=sc.nextFloat();
    e=sc.nextFloat();
    float sum=(a+b+c+d+e)/5;
    float average=sum/5;
    System.out.println("Sum is:"+sum+"\n"+"Average is :"+average);
}
}
