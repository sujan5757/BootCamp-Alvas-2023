Age and Body Weight ---->underweight or overweight

import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
float a,b,d;
System.out.println("Your height in m:");
a=sc.nextFloat();
System.out.println("Your weight in kg : ");
b=sc.nextFloat();
if(a<=5 &&b<50)
{
    System.out.println("Underweight");
    
}
else if(a<=5 && b>100)
{
    System.out.println("Overweight");
}
}
}
