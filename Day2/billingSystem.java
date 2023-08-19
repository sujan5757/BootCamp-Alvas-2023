//Billing System 

import java.util.*;

public class Main
{
public static void main(String[] args) {
int p=1,ch,price=0,sum=0,ch1;
Scanner sc = new Scanner(System.in);
while(p==1)
{
   System.out.println("1. Vanilla\n2. ButterScotch\n3. Tender Cocunut\n4. Chocolate\n5. Strawberry\n6. Exit");
   System.out.print("Enter your Choice: ");
   ch = sc.nextInt();
   switch(ch)
   {
       case 1: System.out.print("1. One Scoop-20\n2. Two Scoop-40\n3. Cone-50\nEnter your Choice: ");
               ch1 = sc.nextInt();
               switch(ch1)
               {
                   case 1: price=20;
                           break;
                   case 2: price=40;
                           break;
                   case 3: price=50;
                           break;
               }
               
               sum+=price;
               break;
       case 2: System.out.print("1. One Scoop-30\n2. Two Scoop-60\n3. Cone-80\nEnter your Choice: ");
               ch1 = sc.nextInt();
               switch(ch1)
               {
                   case 1: price=30;
                           break;
                   case 2: price=60;
                           break;
                   case 3: price=80;
                           break;
               }
               sum+=price;
               break;
       case 3: System.out.print("1. One Scoop-45\n2. Two Scoop-90\n3. Cone-100\nEnter your Choice: ");
               ch1 = sc.nextInt();
               switch(ch1)
               {
                   case 1: price=45;
                           break;
                   case 2: price=90;
                           break;
                   case 3: price=100;
                           break;
               }
               sum+=price;
               break;
       case 4: System.out.print("1. One Scoop-30\n2. Two Scoop-60\n3. Cone-80\nEnter your Choice: ");
               ch1 = sc.nextInt();
               switch(ch1)
               {
                   case 1: price=30;
                           break;
                   case 2: price=60;
                           break;
                   case 3: price=80;
                           break;
               }
               sum+=price;
               break;
       case 5: System.out.print("1. One Scoop-35\n2. Two Scoop-70\n3. Cone-80\nEnter your Choice: ");
               ch1 = sc.nextInt();
               switch(ch1)
               {
                   case 1: price=35;
                           break;
                   case 2: price=70;
                           break;
                   case 3: price=80;
                           break;
               }
               sum+=price;
               break;
       default: p=0;
                System.out.println("Thank You:) ");
                break;
   }
}
System.out.println("Amount to be Paid = " + sum);
}
}
