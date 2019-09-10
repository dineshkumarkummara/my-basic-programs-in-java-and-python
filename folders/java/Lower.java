import java.io.*;
import java.util.*;
class Lower{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char ch[] = str.toCharArray(); 
        for (int i = 0; i < str.length(); i++) { 
            if (i == 0 && ch[i] != ' ' ||  ch[i] != ' ' && ch[i - 1] == ' ') { 
                if (ch[i] >= 'a' && ch[i] <= 'z') { 
                    ch[i] = (char)(ch[i] - 'a' + 'A'); 
                } 
            } 
            else if (ch[i] >= 'A' && ch[i] <= 'Z')  
                ch[i] = (char)(ch[i] + 'a' - 'A');             
        } 
        String str1=new String(ch);
        System.out.println(str1);
    }
}
