class Count {

	
	public static void main(String aa[]) {
	
		String str1 = "count";
		String str2 = "cout";
		String str3 = "sound";
		int len;
		String comp = "";
		boolean bol1 = false, bol2 = false;
		int biggy[] = new int[120];
		int bigcount = 0;
		int mcount = 0, tcount =0;
		
		for(int k = 0; k < str1.length(); k++) {
			
			comp = "";
			for(int i = k; i < str1.length() ; i++) {
				mcount = 0;
				tcount = 0;
				comp = comp + str1.charAt(i);
				
				for(int j = 0; j < str2.length()-i ; j++) {
					
					if(comp.equals(str2.substring(j,comp.length() + mcount++))){
						bol1 = true;
						break;
					}
				}
				
				for(int j = 0; j < str3.length()-i  ; j++) {
					
					if(comp.equals(str3.substring(j,comp.length() + tcount++))) {
						bol2 = true;
						break;
					}
				}
				
				
				if(bol1 == true && bol2 == true) {
					biggy[bigcount] = comp.length();
					bigcount ++;
				}
				
			}
			
	
		}
	
	
	
	
	
	for(int i = bigcount - 1; i >= 0; i --) 
		System.out.print(biggy[i] + " ");
	
	
	
	
	
	
	}


}