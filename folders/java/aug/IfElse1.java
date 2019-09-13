class IfElse1 {

	public static void main(String aa[]) throws java.io.IOException {
	
		char ch, key = 97;
		System.out.print("Enter a character: ");
		ch = (char)System.in.read();
		
		if(ch == key) 
			System.out.println("You gussed the number");
			System.out.println("sorry try again");
			
		else 
			System.out.println("wrong");
			
		
		
		
	}

}