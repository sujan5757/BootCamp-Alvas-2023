//permutation and Combination
import java.util.*;
public class Main
{
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number ");
        int n = scanner.nextInt();
        System.out.print("Enter the numbers  ");
        int r = scanner.nextInt();
        int permutation = factorial(n) / factorial(n - r);
        System.out.println("The permutation is " + permutation);
        int combination = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println("The combination is " + combination);
    }
    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
