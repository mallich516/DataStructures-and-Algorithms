public class MergeSort {
     static int[] arr1;
     public static void main(String[] args) {
          int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

          sort(arr);
     }

     public static void sort(int[] arr) {
          
          arr1 = new int[arr.length];
          
          System.out.println("UnSorted Array");
          show(arr);

          mergesort(arr, 0, arr.length-1);

          System.out.println("Sorted Array");
          show(arr);
     }

     public static void show(int[] arr) {
          for(int i : arr) {
               System.out.print(i + " ");
          }
          System.out.println();
     }

     public static void mergesort(int[] arr, int low, int high) {

          if(low < high) {
               
               int mid = (low + high) / 2;

               mergesort(arr, low, mid);

               mergesort(arr, mid + 1, high);

               merge(arr, low, mid, high);

          }
     }

     public static void merge(int[] arr, int low, int mid, int high) {
          
          for(int i = 0; i < arr.length; i++) {
               arr1[i] = arr[i];
          }

          int i = low;
          int j = mid + 1;
          int k = low;

          while(i <= mid && j <= high) {
               if(arr1[i] < arr1[j]) {
                    arr[k] = arr1[i];
                    i++;
               } else {
                    arr[k] = arr1[j];
                    j++;
               }
               k++;
          }
          if(i > mid) {
               while(j <= high) {
                    arr[k] = arr1[j];
                    j++;
                    k++;
               }
          }
          if(j > high) {
               while(i <= mid) {
                    arr[k] = arr1[i];
                    i++;
                    k++; 
               }
          }
     }
}
