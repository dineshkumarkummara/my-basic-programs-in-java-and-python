import java.util.*;
class Fun {
    String name;
    String reg;
    int age;
    int marks;
    void details(){
        Scanner s=new Scanner(System.in);
        name=s.nextLine();
        reg=s.nextLine();
        age=s.nextInt();
        marks=s.nextInt();
        
    }
}

class Student{
    public static void main(String[] args){
        Fun f=new Fun();
        f.details();
        System.out.println(f.name+" "+ f.reg+" "+f.age+" "+ f.marks);

    }
}