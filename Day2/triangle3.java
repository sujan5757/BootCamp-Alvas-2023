/*
1

2 3

4 5 6

7 8 9 10
*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m=1;
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(m);
               m++; 
            }
            
            System.out.println();
        }
	}
}
