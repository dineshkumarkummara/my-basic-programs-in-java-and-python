import java.util.*;

class Great {

	public static void main(String aa[]) {
		
		int aar[] = new int[10];
		Scanner in = new Scanner(System.in);
		int min, max;
		
		for(int i = 0; i < aar.length; i++) {
			
			aar[i] = in.nextInt();
		}
		
		min = max = aar[0];
		
		for(int i = 1; i < aar.length; i++) {
			
			if(min > aar[i])
				min = aar[i];
			if(max < aar[i])
				max = aar[i];
		}
		
		System.out.println(max + " " + min);
		
	}

}