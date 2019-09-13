import java.util.*;
class Vehicle {
	
	Scanner in = new Scanner(System.in);
	String car;
	int passengers;
	String ownername;
	
	void getInfo() {
		
			
			car = in.nextLine();
			passengers = in.nextInt();
			ownername = in.nextLine();
			ownername = in.nextLine();
			
	}
	
	void showInfo() {
		
		System.out.println(car + " " + passengers + " " + ownername);
		
	}


}

class Main {


	public static void main(String aa[]) {
		
		
		Vehicle ob1 = new Vehicle();
		
		ob1.getInfo();
		ob1.showInfo();
		
	}


}