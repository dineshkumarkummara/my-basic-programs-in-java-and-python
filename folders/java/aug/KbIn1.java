import java.util.*;

class KbIn1 {

	public static void main(String aa[]) {
		
		Scanner in = new Scanner(System.in);
		
		char ch = in.next().charAt(0);
		int inum = in.nextInt();
		double dnum = in.nextDouble();
		String str = in.nextLine();
		str = in.nextLine();
		
		System.out.println(ch);
		System.out.println(inum);
		System.out.println(dnum);
		System.out.println(str);
	}

}