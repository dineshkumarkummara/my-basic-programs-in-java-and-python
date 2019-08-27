import java.util.*;
public class Fibonacci
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter any positive number");
        int n=s.nextInt();
        int n1,n2,n3;
        n1=0;
        n2=1;
        n3=n1+n2;
        System.out.print(n1 + ",");
        System.out.print(n2+ ",");
        for (;n3<n;)
        {
            n1=n2;
            n2=n3;
            n3=n1+n2;
            if (n3>n){
                break;
            }
            System.out.print(n3 + ",");
        }
    }
}
