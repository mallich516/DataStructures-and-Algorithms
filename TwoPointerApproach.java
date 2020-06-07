public class TwoPointerApproach {

     public static void main(String[] args) {
          int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
          int[] arr1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

          show(arr);

          //method to find minimun value pair in a given single array
          find_minvalue_pair(arr);

          //method to find maximum value pair in a given single array
          find_maxvalue_pair(arr);

          //method to show the given arrays
          show(arr);
          show(arr1);

          //method to find minimum value pair from given two arrays
          find_minvalue_pair_in_twoarrays(arr, arr1);

          //method to find maximum value pair from given two arrays
          find_maxvalue_pair_in_twoarrays(arr, arr1);

     }

     public static void find_maxvalue_pair_in_twoarrays(int[] arr, int[] arr1) {
          int index_1 = 0;
          int index_2 = 0;
          int max_value = 0;
          int sum = 0;

          for(int i = 0; i < arr.length; i++) {
               for(int j = 0; j < arr1.length; j++) {
                    sum = arr[i] + arr1[j];
                    if(sum > max_value) {
                         max_value = sum;
                         index_1 = i;
                         index_2 = j;
                    }
               }
          }
          System.out.println("Max value pairs for given arrays are : " + arr[index_1] + " " + arr1[index_2]);
     }

     public static void find_minvalue_pair_in_twoarrays(int[] arr, int[] arr1) {
          int index_1 = 0;
          int index_2 = 0;
          int min_value = Integer.MAX_VALUE;
          int sum = 0;

          for(int i = 0; i < arr.length; i++) {
               for(int j = 0; j < arr1.length; j++) {
                    sum = arr[i] + arr1[j];
                    if(sum < min_value) {
                         min_value = sum;
                         index_1 = i;
                         index_2 = j;
                    }
               }
          }
          System.out.println("Min value pairs for given arrays are : " + arr[index_1] + " " + arr1[index_2]);
     }

     public static void find_maxvalue_pair(int[] arr) {
          int index_1 = 0, index_2 = 0;
          int max_value = 0;
          int sum = 0;

          for(int i = 0; i < arr.length; i++) {
               for(int j = i + 1; j < arr.length; j++) {
                    sum = arr[i] + arr[j];
                    if(sum > max_value) {
                         max_value = sum;
                         index_1 = i;
                         index_2 = j;
                    }
               }
          }
          System.out.println("Max value pairs for given array are : " + arr[index_1] + " " + arr[index_2]);
     }

     public static void find_minvalue_pair(int[] arr) {
          int index_1 = 0, index_2 = 0;
          int min_value = Integer.MAX_VALUE;
          int sum = 0;

          for(int i = 0; i < arr.length; i++) {
               for(int j = i + 1; j < arr.length; j++) {
                    sum = arr[i] + arr[j];
                    if(sum < min_value) {
                         min_value = sum;
                         index_1 = i;
                         index_2 = j;
                    }
               }
          }
          System.out.println("Min value pairs for given array are : " + arr[index_1] + " " + arr[index_2]);
     }

     public static void show(int[] arr) {
          System.out.print("Given Array : ");
          for(int i : arr) {
               System.out.print(i + " ");
          }
          System.out.println();
     }
}