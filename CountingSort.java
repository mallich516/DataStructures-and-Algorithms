public class CountingSort {

    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        System.out.println("UnSorted Array");
        show(arr);

        countingsort(arr);

        System.out.println("Sorted Array");
        show(arr);

    }

    public static void countingsort(int[] arr) {

        int max = getMax(arr);
        int[] count = new int[max + 1];
        int[] output = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        for(int i = 1; i < count.length; i++) {
            count[i] = count[i - 1] + count[i]; 
        }

        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]--;
            output[count[arr[i]]] = arr[i];
        }

        for(int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }

    }

    public static int getMax(int[] arr) {
        int max = 0;

        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void show(int[] arr) {

        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
    
}