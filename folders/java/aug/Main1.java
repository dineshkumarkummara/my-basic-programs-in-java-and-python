
public class Main1
{
	public static void main(String[] args) {
		
		String str = "I am not a string";
		int count = 0;
		
		for(int i = str.length() - 1; i >= 0; i--) {
		    
		    if(str.charAt(count ++) == ' ')
		        System.out.print(" ");
		    System.out.print(str.charAt(i));
		}
	}
}
