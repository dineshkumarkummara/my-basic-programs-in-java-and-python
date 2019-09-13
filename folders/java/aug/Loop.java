import java.util.*;

class Loop {
	
	public static void main(String aa[]) {
		
		int sum = 0, num;
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < 10; ) {
			
			System.out.print("Enter a number: ");
			num = in.nextInt();
			
			if(num < 0)
				continue;
			
			sum = sum + num;
				i++;
			
		}
		
		System.out.println("The sum of number is " + sum);
	}

}