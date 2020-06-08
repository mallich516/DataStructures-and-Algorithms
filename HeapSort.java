public class HeapSort {
	
	public static void main(String args[]) {
	
		int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

		System.out.println("UnSorted Array");
		show(arr);

		heapSort(arr);		

		System.out.println("Sorted Array");
		show(arr);		

	}

	public static void heapSort(int[] arr) {
		
		for(int i = (arr.length-1)/2; i >= 0; i--) {
			maxheap(arr, arr.length-1, i);
		}

		for(int i = arr.length-1; i >= 0; i--) {
			int swap = arr[0];
			arr[0] = arr[i];
			arr[i] = swap;
			maxheap(arr, i, 0);
		}

	}

	public static void maxheap(int[] arr, int arrsize, int parent) {
		
		int temp = parent;
		int left = (parent * 2) + 1;
		int right = (parent * 2) + 2;

		if(left < arrsize && arr[left] > arr[temp]) {
			temp = left;
		} 	

		if(right < arrsize && arr[right] > arr[temp]) {
			temp = right; 
		}
		
		if(temp != parent) {
			int swap = arr[temp];
			arr[temp] = arr[parent];
			arr[parent] = swap;
			maxheap(arr, arrsize, temp);
		}

	}

	public static void show(int[] arr) {
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
