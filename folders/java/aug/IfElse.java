class IfElse {

	public static void main(String aa[]) throws java.io.IOException {
	
		char ch, key = 97;
		System.out.print("Enter a character: ");
		ch = (char)System.in.read();
		
		if(ch == key) 
			System.out.println("You gussed the number");
		else {
			System.out.println("wrong");
			System.out.println("sorry try again");
		}
		
		
	}

}