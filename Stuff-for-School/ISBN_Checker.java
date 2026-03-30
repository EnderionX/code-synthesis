import java.lang.*; 
import java.util.*;

public class ISBN
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("INTERNATIONAL STANDARD BOOK NUMBER");
        System.out.println("Enter the name of the book:");
        String name = sc.nextLine();
        System.out.println("Enter ISBN code of the book:");
        int bn = sc.nextInt();
        int d, ctr = 0, x = bn, y = bn, d2, sum = 0, i = 10;

        while(x > 0)
        {
            d = x % 10;
            ctr++;
            x /= 10;
        }

        if(ctr != 10)
            System.out.println("Illegal ISBN!");
        else
        {
            while(bn > 0)
            {
                d2 = bn % 10;
                sum += (d2 * i);
                bn /= 10;
                i--;
            }

            if(sum % 11 == 0)
            {
                System.out.println("Entered ISBN is " + y);
                System.out.println("The required sum of digits of ISBN of the book " + name + " is: " + sum);
                System.out.println("Legal ISBN.");
            }
            else
                System.out.println("Illegal ISBN!");
        }
    }
}
