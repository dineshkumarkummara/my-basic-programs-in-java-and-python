import java.util.*;

class GradeIf {
	
	public static void main(String aa[]) {
		
		int marks;
		char gr = 'N';
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the mark: ");
		marks = in.nextInt();
		
		if(marks >= 90) {
			gr = 'S';
		continue;}
		else if(marks >= 70)
			gr = 'A';
		else if(marks >= 50)
			gr = 'B';
		else
			gr = 'C';
		
		System.out.println("The grade is " + gr);
		 
		
		
		
	}


}