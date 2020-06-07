public class BinarySearch {

     public static void main(String args[]) {
          int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

          show(arr);
          binarySearch(arr, 0);

     }

     public static void binarySearch(int[] arr, int search) {
          int low = 0;
          int mid = 0;
          int high = arr.length;

          while(low < high) {
               mid = (low + high) / 2;
               if(arr[mid] == search) {
                    System.out.println("Element found at index : " + mid);
                    return;
               } else if(arr[mid] > search) {
                    high = mid - 1;
               } else if(arr[mid] < search) {
                    low = mid + 1;
               }
          }
          if(low > high) {
               System.out.println("Element not found");
          }
     }

     public static void show(int[] arr) {
          System.out.print("Given Array : "); 
          for(int i : arr) {
               System.out.print(i + " "); 
          }
          System.out.println();
     }
     
}