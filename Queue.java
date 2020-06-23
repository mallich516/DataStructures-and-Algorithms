public class Queue {
    
    int[] arr = new int[5];
    int size = 0;
    int front = 0;
    int rear = -1;

    public void enqueue(int data) {
        
        if(size >= 5) {
            System.out.println("Queue is Full");
        } else {
            rear++;
            arr[rear] = data;
            size++;
        }
        
    }

    public void dequeue() {
        
        if(size <= 0) {
            System.out.println("Queue is Empty");
        } else {
            arr[front] = 0;
            for(int i = 1; i < size; i++) {
                arr[i - 1] = arr[i];
                arr[i] = 0;
            }
            rear--;
            size--;
        }

    }

    public int peek() {
        return arr[front];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0) ? true : false;
    }

    public boolean isFull() {
        return (size == 5) ? true : false;
    }

    public void show() {
        for(int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        Queue queue = new Queue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Peek : " + queue.peek());
        System.out.println("Size : " + queue.size());
        System.out.println("IsEmpty : " + queue.isEmpty());
        System.out.println("IsFull : " + queue.isFull());
        queue.show();

        queue.dequeue();

        System.out.println("Peek : " + queue.peek());
        System.out.println("Size : " + queue.size());
        System.out.println("IsEmpty : " + queue.isEmpty());
        System.out.println("IsFull : " + queue.isFull());
        queue.show();

        queue.dequeue();
        queue.dequeue();

        System.out.println("Peek : " + queue.peek());
        System.out.println("Size : " + queue.size());
        System.out.println("IsEmpty : " + queue.isEmpty());
        System.out.println("IsFull : " + queue.isFull());
        queue.show();
    } 

}
