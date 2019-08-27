import java.util.*;
import java.io.*;
class Palindrome{
    public static void main(String args[]) 
    {
        int a,n,b,temp=0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter input");
        n=s.nextInt();
        b=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            temp=temp*10+a;
        }

        if(temp==b){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not");
        }
    }
    }
    
