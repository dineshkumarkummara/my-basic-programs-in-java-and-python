import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Long {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        long n = s.nextLong();
        long l=0;
        long h[]=new long[(int) n];
        for(int i = 0; i < n; i++) {
            h[i]=s.nextLong();
        }
        for(int i = 0; i < n; i++) {
            l=l+h[i];
        }
        System.out.println(l);
    }
}
