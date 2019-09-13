class Person {
	
	String name;
	int age;
	String occupation;
	double salary;
	
	Person(String name, int age, String occupation, double salary) {
		 
		 this.name = name;
		 this.age = age;
		 this.occupation = occupation;
		 this.salary = salary;
		
	}

}


class MainStorage {
	
	public static void main(String aa[]) {
		
		Person ob = new Person("dinesh", 20, "engineer", 22222);
		System.out.println(ob.name + " " + ob.age + " " + ob.occupation + " " + ob.salary);
		System.out.println(ob);
	}
	
}

