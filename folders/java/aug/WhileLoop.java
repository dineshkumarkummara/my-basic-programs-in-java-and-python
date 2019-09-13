import java.util.*;

class WhileLoop {

	public static void main(String aa[]) {
		
		
		int id;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter id number: ");
		id = in.nextInt();
		
		while(id <= 100 || id >= 500) {
				
			System.out.print("Enter id number: ");
			id = in.nextInt();
		}
		
	}
	

	

}