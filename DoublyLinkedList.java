class DoublyLinkedList {

    class Node {

        int data;
        Node prev, next;

        Node(int data) {

            this.data = data;
            this.prev = null;
            this.next = null;

        }

    }

    Node head;

    public void insert(int data) {

        Node node = new Node(data);

        if(head == null) {
            head = node;
        } else {
            Node n = head;
            while(n.next != null) {
                n = n.next;
            }
            n.next = node;
            node.prev = n;
        }

    }

    public void insertAtFirst(int data) {

        Node node = new Node(data);
        head.prev = node;
        node.next = head;
        head = node;

    }

    public void insertAt(int index, int data) {

        Node node = new Node(data);
        Node n = head;
        for(int i = 0; i < index-1; i++) {
            n = n.next;
        }
        node.next = n.next;
        node.prev = n;
        n.next = node;

    }

    public void remove(int index) {

        Node n = head;
        Node n1 = null;
        for(int i = 0; i < index-1; i++) {
            n = n.next;
        }
        n1 = n.next;
        n1.next.prev = n;
        n.next = n1.next;

    }

    public void show() {

        Node n = head;
        while(n.next != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.print(n.data);
        System.out.println();

    }

    public void showreverse() {
        Node n = head;
        while(n.next != null) {
            n = n.next;
        }

        Node tail = n;

        while(n.prev != null) {
            System.out.print(n.data + " ");
            n = n.prev;
        }
        System.out.print(n.data);
    }

    public static void main(String args[]) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.show();

        list.insertAtFirst(6);

        list.show();

        list.insertAt(2, 7);

        list.show();

        list.remove(2);

        list.show();

        list.showreverse();
    }

}