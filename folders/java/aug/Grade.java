import java.util.*;

class Grade {
	
	public static void main(String aa[]) {
		
		int marks;
		char gr = 'N';
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the mark: ");
		marks = in.nextInt();
		
		if(marks >= 90)
			gr = 'S';
		if(marks < 90 && marks >= 70)
			gr = 'A';
		if(marks < 70 && marks >= 50)
			gr = 'B';
		if(marks < 50 )
			gr = 'C';
		
		System.out.println("The grade is " + gr);
		 
		
		
		
	}


}