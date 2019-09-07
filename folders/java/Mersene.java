import java.io.*;
import java.util.*;
public class Mersene
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int x[];
        int h[];
        x=new int[n];
        h=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=s.nextInt();    
        }
        int sum=0;
        if(n>0)
        {
            for(int j=1;j<n;j++){
                h[j]=(int)Math.pow(2,j)-1;
            }
            for(int k=0;k<n;k++){
                for(int sc=0;sc<n;sc++){
                    if(h[k]==x[sc]){
                        sum+=h[k];
                    }
                    else{
                        sum+=0;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
