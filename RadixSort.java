public class RadixSort {

     public static void main(String[] args) {
          int[] arr = {1000, 900, 800, 700, 600, 500, 400, 300, 200, 100, 0};

          System.out.println("UnSorted Array");
          show(arr);

          sort(arr);

          System.out.println("Sorted Array");
          show(arr);
     }

     public static void sort(int[] arr) {
          
          int max = getMax(arr);
          
          for(int i = 1; max/i > 0; i = i*10) {
               countingsort(arr, i);
          }
     }

     public static void countingsort(int[] arr, int place) {
          int max = getMax(arr);
          int[] output = new int[arr.length];
          int[] count = new int[max + 1];

          for(int i = 0; i < arr.length; i++) {
               count[(arr[i]/place)%10]++;
          }

          for(int i = 1; i < count.length; i++) {
               count[i] = count[i] + count[i-1];
          }

          for(int i = arr.length-1; i >= 0; i--) {
               count[(arr[i]/place)%10]--;
               output[count[(arr[i]/place)%10]] = arr[i];
          }

          for(int i = 0; i < arr.length; i++) {
               arr[i] = output[i];
          }
     }

     public static void show(int[] arr) {
          for(int i : arr) {
               System.out.print(i + " ");
          }
          System.out.println();
     }

     public static int getMax(int[] arr) {
          int max = arr[0];
          for(int i = 1; i < arr.length; i++) {
               if(arr[i] > max) {
                    max = arr[i];
               }
          }
          return max;
     }
     
}