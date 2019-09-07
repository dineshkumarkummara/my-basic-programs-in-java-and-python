import java.io.*;
import java.util.*;
class ArmArray{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String str=Integer.toString(n);
      //  System.out.println(str.length());
        int a[]=new int[str.length()];
        for(int i=0;i<str.length();i++){
            a[i]=str.charAt(i)-48;
        }
      // System.out.println(a[0]+ " "+a[1]+ " "+a[2]);
        int sum=0;
        for(int j=0;j<str.length(); j++)
         {
           sum= (int) (sum + Math.pow(a[j], str.length()));   
        }
      //  System.out.println((int)sum);
        if(sum==n)
        {
            System.out.println(n +" Armstrong");
        }
        else{
            System.out.println(n+" Not Armstrong");
        }
    }
}
