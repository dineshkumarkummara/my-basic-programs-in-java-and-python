import java.io.*;
import java.util.*;
class Minmax{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int a[]=new int[5];
        //long sum1=0,sum2=0,sum3=0,sum4=0,sum5=0;
        for(int i=0;i<5;i++){
            a[i]=s.nextInt();
        }
               /* for(int k=0;k<4;k++){
                    sum1+=a[k];
                }
                for(int l=1;l<5;l++){
                    sum2+=a[l];
                }
                for( int m=0;m<5;m++){
                    if(m==1)
                    continue;
                    sum3+=a[m];
                }
                for(int n=0;n<5;n++){
                    if(n==2)
                    continue;
                    sum4+=a[n];
                }
                for(int o=0;o<5;o++){
                    if(o==3)
                    continue;
                    sum5+=a[o]; 
                }  */
                long f[]=new long[5];
               for(int j=0;j<5;j++){
                   long sum = 0;
                   for(int m=0;m<5;m++){
                       if(m==j)
                    continue;
                    sum=sum+a[m];                     
                 }   
                 f[j]=  sum;
               }
               //System.out.println(f[2]);
               long k[]={f[0],f[1],f[2],f[3],f[4]};
               long max,min;
               max= k[0];
               min= k[0];
               for(int y=1;y< k.length; y++) {
   
                   if(k[y] > max)
                   {
                       max= k[y];
                   }
                   if(k[y] < min)
                   {
                       min= k[y];
                   }
               }
               System.out.println(min+" "+max);

               /* long b[]={sum1,sum2,sum3,sum4,sum5};
                long max,min;
                max=b[0];
                min=b[0];
                for(int y=1;y<b.length; y++) {
    
                    if(b[y]>max)
                    {
                        max=b[y];
                    }
                    if(b[y]<min)
                    {
                        min=b[y];
                    }
                }
                System.out.println(min+" "+max); */
                
    }

}
