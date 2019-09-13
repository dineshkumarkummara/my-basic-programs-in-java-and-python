import java.util.*;

class DoWhile {

	public static void main(String aa[]) throws java.io.IOException {
	
		char ch , extra, key = 'k';
		
		
		for(int i = 0; i < 3; i++) {
			
			System.out.print("Enter the key: ");
			ch = (char)System.in.read();
			
			do {
				
				extra = (char)System.in.read();
				
			}while(extra != '\n');
			
			
			if(ch == key) 
				System.out.println("Correct");
			else 
				System.out.println("Wrong");
		
		}
	
	}
	


}