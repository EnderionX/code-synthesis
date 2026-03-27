import java.util.*;

public class Special_Number
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a special number or not:");
        int a = sc.nextInt();
        int n = a, d, sum = 0;

        while(n>0)
        {
            d=n%10; int fac = 1;
            for(int i = 1; i<=d; i++)
            {
                fac*=i;
            }
            sum+=fac;
            n/=10;
        }

        if(sum==a)
        System.out.println(a+" is a special number.");
        else
        System.out.println(a+" is not a special number.");
    }
}
