import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Double {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        double po=0;
        double ne=0;
        double ze=0;
        int n=s.nextInt();
        int h[]=new int[n];
        for(int i=0;i<n;i++){
            h[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if (h[i]>0){
                po+=1;
            }
            if (h[i]<0){
                ne+=1;
            }
            if (h[i]==0){
                ze+=1;
            }
        }
        System.out.println(po/n);
        System.out.println(ne/n);
        System.out.println(ze/n);
    }
}
