public class BubbleSort {

     public static void main(String[] args) {
          int[] arr = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};

          System.out.println("Unsorted Array");
          show(arr);

          bubblesort(arr);

          System.out.println("Sorted Array");
          show(arr);
     }

     public static void bubblesort(int[] arr) {
          
          for(int i = 0; i < arr.length; i++) {
          
               for(int j = 0; j < arr.length-1; j++) {
          
                    if(arr[j] > arr[j + 1]) {
                         int swap = arr[j];
                         arr[j] = arr[j+1];
                         arr[j+1] = swap;
                    }
          
               }
          
          }

     }

     public static void show(int[] arr) {
          for(int i : arr) {
               System.out.print(i + " ");
          }
          System.out.println();
     }
     
}