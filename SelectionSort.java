public class SelectionSort {
    
    public static void main(String args[]) {

        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        System.out.println("UnSorted Array");
        show(arr);

        selectionsort(arr);

        System.out.println("Sorted Array");
        show(arr);

    }

    public static void selectionsort(int[] arr) {

        for(int i = 0; i < arr.length; i++) {

            int index = i;
            for(int j = i; j < arr.length; j++) {
                if(arr[j] < arr[index]) {
                    index = j;
                }
            }
            int swap = arr[index];
            arr[index] = arr[i];
            arr[i] = swap;

        }

    }

    public static void show(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}