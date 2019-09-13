class details{
    String name;
    String occupation;
    int age;
    double salaray;
     
    details(String n, String o, int a, double s) {
        this.name=n;
        this.occupation=o;
        this.age=a;
        salaray=s;
        System.out.println(name+" "+occupation+" "+age+" "+salaray);
    }

}

class Person{
    public static void main(String[] args) {
        details p=new details("dinesh","fdyg", 89, 876.09);
        System.out.println(p.name+" "+p.occupation+" "+p.age+" "+p.salaray);
        
    }
}
