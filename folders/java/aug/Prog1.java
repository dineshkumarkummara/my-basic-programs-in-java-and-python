import java.util.*;

class Prog1 {

	public static void main(String aa[]) {
		Scanner in = new Scanner(System.in);
		String names[] = new String[3];
		int marks[][] = new int[3][4];
		
		
		for(int i = 0; i < names.length; i++) {
				
			System.out.print("Enter the name: ");
			if(i == 0)
				names[i] = in.nextLine();
			else {
				names[i] = in.nextLine();
				names[i] = in.nextLine();
			}
			
			
			for(int j = 0; j < marks[i].length; j++) {
				
				System.out.print("Marsk " + (j + 1) + ": ");
				marks[i][j] = in.nextInt();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}