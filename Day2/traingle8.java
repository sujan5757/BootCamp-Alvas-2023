/*____1

___21

__321

_4321

54321
*/
import java.util.Scanner;

public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int i,j;
int n=sc.nextInt();
for(i=1;i<=n;i++)
{
for(int k=0;k<n-i;k++)
System.out.print(" ");
for(j=1;j<=i;j++)
System.out.print(j);
System.out.println();
}
}
}
