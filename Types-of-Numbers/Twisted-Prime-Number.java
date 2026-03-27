import java.util.*;

class TwistedPrime_Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a twisted prime number or not:");
        int x = sc.nextInt();
        int n = x, d, num = 0;

        while(n>0)
        {
            d=n%10;
            num=(num*10)+d;
            n/=10;
        }

        int ctr1 = prime_check(x);
        int ctr2 = prime_check(num);

        if(ctr1==2 && ctr2==2)
            System.out.println(x+" is a twisted prime number.");
        else
            System.out.println(x+" is not a twisted prime number.");
    }

    static int prime_check(int a)
    {
        int ctr = 0;
        for(int i = 1; i<=a; i++)
        {
            if(a%i==0)
                ctr++;
        }
        return ctr;
    }
}
