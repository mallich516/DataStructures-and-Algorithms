class Stack {

    int[] arr = new int[5];
    int size = 0;
    int top = -1;

    public void push(int data) {
        
        if(size >= 5) {
            System.out.println("Stack is Full!");
        } else {
            top++;
            size++;
            arr[top] = data;
        }
    
    }

    public void pop() {
        
        if(size == 0) {
            System.out.println("Stack is Empty!");
        } else {
            arr[top] = 0;
            top--;
            size--;
        }
    
    }

    public int peek() {
        return arr[top];
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
        
        if(size > 0) {
            for(int i = 0; i < 5; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Stack UnderFlow!");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Stack stack = new Stack();

        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        System.out.println(stack.size());
        stack.show();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        System.out.println(stack.size());

        stack.show();

        stack.pop();

        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        System.out.println(stack.size());

        stack.show();

        stack.pop();
        stack.pop();

        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        System.out.println(stack.size());
        stack.show();

 
    }
}


