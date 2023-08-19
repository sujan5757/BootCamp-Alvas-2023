/* 
	 4 3 2 1  1 2 3 4
   3 2 1      1 2 3
   2 1          1 2
   1              1
*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int n=sc.nextInt();
        int m=1;
        for(int i=n;i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
              
                   System.out.print(j);
                   m++;
            }
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                           
                   System.out.print(j);
                   m++;
            }
           
           
            System.out.println();
        }
	}
}
