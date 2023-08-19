/* 
1) Write a java program that reads two floating point numbers and tests whether they are the same up to three decimal places 

test data

Input floating number :25.586

input floating point another number :25.589

expected output :they are different
*/

import java.util.*;

public class Main
{
public static void main(String[] args) {
    float a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the two  numbers")
    a=sc.nextFloat();
    float f=a*1000;
    b=sc.nextFloat();
    float g=b*1000;
    int x=(int)f;
    int y=(int)g;

    if(x==y)
    {
        System.out.println("They are Same ");
        
    }
    else{
        System.out.println("They are Different");
    }
}

}
