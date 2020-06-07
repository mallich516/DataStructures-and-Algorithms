class QuickSort {

     public static void main(String[] args) {
          
          int[] arr = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0};

          System.out.println("Unsorted Array");
          show(arr);

          quicksort(arr, 0, arr.length-1);

          System.out.println("Sorted Array");
          show(arr);
     }

     public static void quicksort(int[] arr, int low, int high) {
          int i = low;
          int j = high;
          int pivot = arr[low];

          while(i < j) {
               while(arr[i] < pivot) {
                    i++;
               }
               while(arr[j] > pivot) {
                    j--;
               }
               if(i < j) {
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
               }
          }
          if(low < j) {
               quicksort(arr, low, j - 1);
          }
          if(high > i) {
               quicksort(arr, i + 1, high);
          }
     }

     public static void show(int[] arr) {
          for(int i : arr) {
               System.out.print(i + " ");
          }
          System.out.println();
     }
}