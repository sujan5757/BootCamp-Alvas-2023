/Distance Between Two Points

import java.util.*;
public class Main
{
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the x1= ");
        int x1 = scanner.nextInt();
        System.out.print("Enter the y1=");
        int y1 = scanner.nextInt();
        System.out.print("Enter the x2=");
        int x2 = scanner.nextInt();
        System.out.print("Enter the y2=");
        int y2 = scanner.nextInt();
        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        System.out.println("Distance between the two points is" + distance);
    }
}
}
