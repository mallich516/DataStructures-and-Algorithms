public class BinaryTree {
    
    class Node {

        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }

    }

    Node root;

    public void insert(int key) {
        root = insertRecursive(root, key);
    }

    public Node insertRecursive(Node root, int key) {

        if(root == null) {
            root =  new Node(key);
        } else {
            if(root.right == null) {
                root.right = insertRecursive(root.right, key);
            } else {
                root.left = insertRecursive(root.left, key);
            }
        }

        return root;
    }

    public void inOrder() {
        inOrderTraversal(root);
    }
    public void inOrderTraversal(Node root) {

        if(root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.key + " ");
            inOrderTraversal(root.right);
        }

    }

    public void preOrder() {
        preOrderTraversal(root);
    }
    public void preOrderTraversal(Node root) {
        
        if(root != null) {
            System.out.print(root.key + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }

    }

    public void postOrder() {
        postOrderTraversal(root);
    }
    public void postOrderTraversal(Node root) {
        
        if(root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.key + " ");
        }

    }

    public static void main(String args[]) {

        BinaryTree tree = new BinaryTree();

        tree.insert(5);
        tree.insert(2);
        tree.insert(4);
        tree.insert(8);
        tree.insert(6);
        tree.insert(7);
        tree.insert(3);
        tree.insert(9);

        tree.inOrder();
        System.out.println();

        tree.preOrder();
        System.out.println();

        tree.postOrder();
    }
 
}
