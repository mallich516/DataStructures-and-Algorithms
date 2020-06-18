public class SinglyLinkedList {

     class Node {

          int data;
          Node next;

          public Node(int data) {
               this.data = data;
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
          }

     }

     public void insertAt(int index, int data) {

          Node node = new Node(data);

          Node n = head;
          for(int i = 0; i < index-1; i++) {
               n = n.next;
          }
          node.next = n.next;
          n.next = node;

     }

     public void insertAtFirst(int data) {

          Node node = new Node(data);
          node.next = head;
          head = node;

     }

     public void update(int index, int data) {

          Node n = head;
          for(int i = 0; i < index-1; i++) {
               n = n.next;
          }
          n.next.data = data;

     }

     public void delete(int index) {

          Node node = head;
          Node n = null;
          for(int i = 0; i < index-1; i++) {
               node = node.next;
          }
          n = node.next;
          node.next = n.next;

     }

     public void deleteFirst() {

          Node node = head;
          head = node.next;

     }

     public void show() {

          Node n = head;
          while(n.next != null) {
               System.out.print(n.data + " ");
               n = n.next;
          }
          System.out.print(n.data);

     }

     public static void main(String[] args) {
          
          SinglyLinkedList list = new SinglyLinkedList();

          list.insert(10);
          list.insert(20);
          list.insert(30);
          list.insert(40);
          list.insert(50);

          list.insertAt(2, 60);

          list.insertAtFirst(100);

          list.update(2, 120);

          list.delete(2);

          list.deleteFirst();

          

          list.show();
     }

}