class BreakGoto {

	public static void main(String aa[]) {
	
		
		
		for(int i = 1; i < 4; i++) {
			
		one:{
			two:{
				three:{
						
						System.out.println("\ni is " + i);
						if(i == 1) break one;
						if(i == 2) break two;
						if(i == 3) break three;
						
						System.out.println("This won't run.");
						
					}
					
					System.out.println("After block three");
					
				}
				
				System.out.println("After block two");
				
			}
			
			System.out.println("After block one");
				
			
		}
		
		System.out.println("After for");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}



}