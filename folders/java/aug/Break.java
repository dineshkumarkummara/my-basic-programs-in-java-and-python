import java.util.*;

class Break {

	
	public static void main(String aa[]) {
	
		Scanner in = new Scanner(System.in);
		int num;
		char ch;
		
		for( ; ; ) {
				
			System.out.print("Enter a number: ");
			num = in.nextInt();
			
			for(int i = 1; i <= 10; i++) {
				
				System.out.println(num + " * " + i + " = " + num * i);
			}
			
			System.out.println("\n");
			
			System.out.print("Enter 'n' to break: ");
			ch = in.next().charAt(0);
			if(ch == 'n')
				break;
			
		}
		
	}

}