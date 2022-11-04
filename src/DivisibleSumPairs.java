
public class DivisibleSumPairs {
	
		public static void main(String[] args) {
						
			
			int [] array = {1,2,3,4,5,6,7,8}; 
			
			
				System.out.println(DivisibleSumPairs.division(array, 8, 3));
				
				
				
			
			
		}
		
	
	
	public static int division(int [] array, int n, int k) {
		
		
		int count = 0;
		
		
				for (int i = 0; i < array.length - 1; i++) {
					
						for (int j =  i + 1; j < array.length; j++) {
						
							
							if( (array[i] + array[j]) % k == 0) count++;
							
						}
					
				}
		
		
		return count;
		
	}

}
