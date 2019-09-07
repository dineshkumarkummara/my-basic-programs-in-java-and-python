import java.io.*;
import java.util.*;

class Triplets {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int suma=0;
        int sumb=0;
        int x[];
        x=new int[3];
        int y[];
        y=new int[3];
        for(int i=0;i<3;i++){
            x[i]=s.nextInt();
            //System.out.println(x[i]);
        }
        for(int j=0;j<3;j++){
            x[j]=s.nextInt();
            //System.out.println(x[j]);
        }
        for (int i=0;i<3 ; i++){
           
                if(x[i]>y[i]){
                    suma+=1;
                    
                }
                if(x[i]<y[i]){
                    sumb+=1;
                    
                }
                if(x[i]==y[i]){

                }
            
        }
        System.out.println(suma+ " ");
        System.out.println(sumb+ " ");

    }
}
