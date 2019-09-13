import java.util.Scanner;

class Table {
    Scanner s=new Scanner(System.in);
    
    
    void multiply(){
        int n=s.nextInt();
        for(int i=0;i<10;i++){
            System.out.println(n +"*"+ i+ "="+ n*i);
        }

    }
}


class Main1{
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            
            Table t=new Table();
            //Table t1=new Table();
            t.multiply();
           // t1.multiply();
        }
        

    }
}