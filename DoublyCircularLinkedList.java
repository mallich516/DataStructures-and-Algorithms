public class DoublyCircularLinkedList {
    
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
            head.next = head;
        } else {
            Node n = head;
            while(n.next != head) {
                n = n.next;
            }
            node.next = head;
            n.next = node;
        }
    }

    public void insertAtFirst(int data) {

        Node node = new Node(data);
        
        Node n = head;
        while(n.next != head) {
            n = n.next;
        }
        n.next = node;

        node.next = head;
        head = node;

    }

    public void insertAt(int index, int data) {

        Node node = new Node(data);
        Node n = head;
        for(int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        node.next = n.next;
        n.next = node;

    }
    
    public void remove(int index) {

        Node n = head;
        Node n1 = null;
        for(int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        n1 = n.next;
        n.next = n1.next;

    }


    public void show() {

        Node n = head;
        while(n.next != head) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.print(n.data);

    }

    public static void main(String args[]) {

        DoublyCircularLinkedList list = new DoublyCircularLinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.insertAtFirst(6);

        list.insertAt(2, 7);

        list.show();

        list.remove(2);
        
        list.show();
        
    }   

}
