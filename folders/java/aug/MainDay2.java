import java.util.*;
class Vehicle {

	int num1, num2;
	Scanner in = new Scanner(System.in);

	void setValues(int n1, int n2) {
	
		num1 = n1;
		num2 = n2;
	}
	
	void setValuesKeyBoard() {
		num1 = in.nextInt();
		num2 = in.nextInt();
	}
	
	void bigNum() {
		
		
		if(num1 > num2)
			System.out.println(num1);
		else
			System.out.println(num2);
		
		
	}

}


class MainDay2 {


	public static void main(String aa[]) {
		
		Vehicle v = new Vehicle();
		v.setValuesKeyBoard();
		v.setValues(5, 6);
		
		v.bigNum();
		
		
		
	}
	
	

}