import java.util.*;
class Vehicle {

	int num1,num2;
	Scanner in = new Scanner(System.in);
	
	
	
	void setValues() {
		System.out.print("Enter a num1: ");
		num1 = in.nextInt();
		System.out.print("Enter a num2: ");
		num2 = in.nextInt();
	}
	
	void bigNum() {
		
		if(num1 > num2)
			System.out.println(num1);
		else
			System.out.println(num2);
		
		
	}

}

class MainDay {


	public static void main(String aa[]) {
		
		Vehicle v = new Vehicle();
		v.setValues();
		v.bigNum();
		
		Vehicle v1 = new Vehicle();
		v1.setValues();
		v1.bigNum();
		
	}
	
	

}