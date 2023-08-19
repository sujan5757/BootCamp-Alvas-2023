/*
1

2 1

3 2 1

4 3 2 1

5 4 3 2 1
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
            m=i+1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(m);
               m--; 
            }
            
            System.out.println();
        }
	}
}
