public class MaxHeap {

     public static void main(String[] args) {

          int arr[] = {35, 33, 42, 10, 14, 19, 27, 44, 26, 31};

          show(arr);

          for(int i = arr.length-1/2; i >= 0; i--) 
          heapify(arr, i);

          show(arr);

     }

     public static void heapify(int[] arr, int parent) {

          int temp = parent;
          int left = (parent * 2) + 1;
          int right = (parent * 2) + 2;

          if(left < arr.length && arr[left] > arr[temp]) {
               temp = left;
          }

          if(right < arr.length && arr[right] > arr[temp]) {
               temp = right;
          }

          if(temp != parent) {
               int swap = arr[temp];
               arr[temp] = arr[parent];
               arr[parent] = swap;
               heapify(arr, temp);
          }

     }

     public static void show(int[] arr) {
          for(int i : arr) {
               System.out.print(i + " ");
          }
          System.out.println();
     }
     
}