class KbIn {

	public static void main(String aa[]) throws java.io.IOException {
		
		char ch, extra;
	
	
		for(int i = 0; i < 4; i++) {
			
			ch = (char)System.in.read();
			extra = ch;
			
			while(extra !='\n') {
				extra = (char)System.in.read();
			}
			
			System.out.println(ch);
	
		}
		
		
	}

}