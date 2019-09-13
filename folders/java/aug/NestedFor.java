class NestedFor {

	
	public static void main(String aa[]) {
	
	for(int i = 0; i < 10; i++) 
	{
			
		for(int j = 0; j < 10;  j++) {
				
			for(int k = 0; k < 10; k++) 
				done:{
					
					if(k == 5)
						break done;
					System.out.print(k + " ");
				}
				System.out.println("After K block");
				
			}
			System.out.println("After J block");
		}
		System.out.println("After i block");
	
	
	
	
	
	
	}



}