public class InsertionSort {
	

	public static void main(String[] args) {
		
		

		int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		
		

		System.out.println("UnSorted Array");
		
		show(arr);
		
		

		insertionSort(arr);
		
		

		System.out.println("Sorted Array");
		
		show(arr);
		
	

	}
	
	

	public static void insertionSort(int[] arr) {
	    
	       

		for(int i = 0; i < arr.length; i++) {
	           
	            

			int j = i - 1;
	            
			int element = arr[i];
	            
	            

			while(j >= 0 && arr[j] >= element) {
	                
				arr[j + 1] = arr[j];
	                
				j--;
	            
			}
	            
	            

			j = j + 1;
	            
			arr[j] = element;
	       
	       

		}
	    
	
	}
	
	

	public static void show(int[] arr) {
	    

		for(int i : arr) {
	        
			System.out.print(i + " ");
	    
		}
	    
		System.out.println();
	

	}

}

