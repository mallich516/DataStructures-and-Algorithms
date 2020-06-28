public class MinHeap {
    
    int[] arr;
    int size;
    int maxsize;

    MinHeap(int maxsize) {
        this.maxsize = maxsize;
        this.size = 0;
        arr = new int[maxsize + 1];
    }

    public void minheapify(int parent) {
        
        int position = parent;
        int left = parent * 2;
        int right = (parent * 2) + 1;

        if(left <= maxsize && arr[left] < arr[position]) {
            position = left;
        }
        if(right <= maxsize && arr[right] < arr[position]) {
            position = right;
        }
        if(position != parent) {
            int swap = arr[position];
            arr[position] = arr[parent];
            arr[parent] = swap;
            minheapify(position);
        }

    }

    public int parent(int position) {
        return position / 2;
    }

    public void insert(int key) {

        if(size > maxsize) {
            System.out.println("Array is Full!");
            return;
        }

        arr[++size] = key;
        int current = size;

        while(arr[current] < arr[parent(current)]) {
            int swap = arr[current];
            arr[current] = arr[parent(current)];
            arr[parent(current)] = swap;
            current = parent(current); 
        }

    }

    public void minHeap() {
        for(int i = maxsize / 2; i > 0; i--) {
            minheapify(i);
        }
    }

    public void show() {
        for(int i = 1; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {

        MinHeap min = new MinHeap(10);

        min.insert(5);
        min.insert(3);
        min.insert(17);
        min.insert(10);
        min.insert(84);
        min.insert(19);
        min.insert(6);
        min.insert(22);
        min.insert(9);
        min.insert(1);
 
        min.minHeap();

        min.show();

    }

}