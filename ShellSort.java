class ShellSort {

    public static void main(String[] args) {
        
        int[] arr = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};

        System.out.println("UnSorted Array");
        show(arr);

        sort(arr);

        System.out.println("Sorted Array");
        show(arr);

    }

    public static void sort(int[] arr) {

        for(int gap = arr.length/2; gap > 0; gap = gap / 2) {

            for(int j = gap; j < arr.length; j++) {

        
                for(int i = j - gap; i >= 0; i = i - gap) {

                    if(arr[i + gap] > arr[i]) {
                        break;
                    } else {
                        int swap = arr[i + gap];
                        arr[i + gap] = arr[i];
                        arr[i] = swap;
                    }

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