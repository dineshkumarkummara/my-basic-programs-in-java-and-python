import java.util.*;

class Loop1 {
	
	public static void main(String aa[]) {
		
		Scanner in = new Scanner(System.in);
		char ch, key = 'k', desi;
		
		
		
		for( ; ; ) {	
		
			System.out.print("Enter key: ");
			ch = in.next().charAt(0);
			
			if(ch == key) {
				System.out.println("Correct");
				break;
			}
			else {
				System.out.print("Sorry ");
				if(ch > key)
					System.out.print("Enter nuber is too high. ");
				else
					System.out.print("Enter nuber is too low. ");
				
				System.out.println("Try again.");
				
				
			}
			System.out.println("Enter 'n' to discontinue: ");
			desi = in.next().charAt(0);
			if(desi == 'n' || desi == 'N')
				break;
		
		}
		
		
		
		
		
		
	}

}