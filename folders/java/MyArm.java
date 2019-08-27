import java.util.*;
import java.io.*;
class MyArm{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();
        int i = 0,a;
        a=n;
        while (n > 0) {
            a=a/10;
            i++;
        }
        System.out.print(i);
}
}