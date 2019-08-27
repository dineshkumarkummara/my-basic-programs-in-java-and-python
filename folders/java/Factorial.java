import java.util.*;
public class Factorial
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=s.nextInt();
        int fact=1;
        if(n<0)
        {
            System.out.println("enter a positive integer");
        }
        else if (n==0)
        {
            System.out.println("the factorial of 0 is 1");
        }
        else if (n>0){
        for (int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("the factorial of " + n + " is " + fact);
    }
    }
}
