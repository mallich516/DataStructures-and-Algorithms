public class ArrayOperations1 {

     public static void main(String args[]) {

          int[] arr = {10, 90, 20, 80, 30, 70, 40, 60, 50};

          System.out.println("Given Array");
          show(arr);

          int searchelement = 0;
          search(arr, searchelement);

          delete(arr, 5);

          System.out.println("Modified Array");
          show(arr);

          sort(arr);

          System.out.println("Sorted Array");
          show(arr);

          leftRotation(arr);

          System.out.println("Left Rotated Array");
          show(arr);

          rightRotation(arr);

          System.out.println("Right Rotated Array");
          show(arr);

          prefixsum(arr);

          System.out.println("Prefix sum Array");
          show(arr);

     }

     public static void prefixsum(int[] arr) {

          for(int i = 1; i < arr.length; i++) {

               arr[i] = arr[i] + arr[i - 1];

          }

     }

     public static void rightRotation(int[] arr) {

          int last = arr[arr.length-1];

          for(int i = arr.length-1; i > 0; i--) {

               arr[i] = arr[i-1];

          }

          arr[0] = last;

     }

     public static void leftRotation(int[] arr) {

          int first = arr[0];

          for(int i = 1; i < arr.length; i++) {

               arr[i-1] = arr[i];

          }
          arr[arr.length-1] = first;

     }

     public static void sort(int[] arr) {
          for(int i = 0; i < arr.length; i++) {
               for(int j = 0; j < arr.length; j++) {
                    if(arr[j] > arr[i]){ // ' > ' for ascending order, ' < ' for decending order
                         int swap = arr[i];
                         arr[i] = arr[j];
                         arr[j] = swap;
                    }
               }
          }
     }

     public static void delete(int[] arr, int index) {

          for(int i = index; i < arr.length - 1; i++) {
               arr[i] = arr[i + 1];
               arr[i + 1] = 0;
          }

     }

     public static void search(int[] arr, int search) {
          boolean found = false;
          for(int i = 0; i < arr.length; i++) {

               if(arr[i] == search) {
                    System.out.println("Search Element found at index : " + i);
                    found = true;
               }

          }
          if(!found) {
               System.out.println("Search Element not found!");
          }
     }

     public static void show(int[] arr) {
          for(int i : arr) {
               System.out.print(i + " ");
          }
          System.out.println();
     }
     
}