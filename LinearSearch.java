public class LinearSearch {

     public static void main(String args[]) {

          int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};

          show(arr);
          linearSearch(arr, 0);

     }

     public static void linearSearch(int[] arr, int search) {
          boolean found = false;
          for(int i = 0; i < arr.length; i++) {
               if(search == arr[i]){
                    System.out.println("Element found at index " + i);
                    found = true;
               }
          }
          if(!found) {
               System.out.println("Element Not Found");
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