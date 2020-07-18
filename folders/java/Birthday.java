import java.io.*;
import java.util.*;
class Birthday{
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int max=a[0];
        for(int k=1;k<n;k++){
            if(a[k]>max){
                max=a[k];
            }
        }
        int l=max;
        int count=0;
        for(int j=0;j<n;j++){
            if(a[j]==l){
                count++;
            }
	}
        System.out.println(count);
    }
}