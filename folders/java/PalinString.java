import java.io.*;
import java.util.*;
class PalinString{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String b=" ";
        for(int i=str.length()-1;i>=0;i--)
        {
            b+=str.charAt(i);
        }
        if(str.length()<=10){
            if(str.equals(b)){
                
            }
        }
    }
}