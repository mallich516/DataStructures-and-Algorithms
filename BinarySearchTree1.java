public class BinarySearchTree1 {
    
    class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
            this.left = this.right = null;
        }
    }

    Node root;

    public void insert(int key) {
        root = insertRecursive(root, key);
    }
    public Node insertRecursive(Node root, int key) {

        if(root == null) {
            return root = new Node(key);
        } else {

            if(key > root.key) {
                root.right = insertRecursive(root.right, key);
            } else if(key < root.key) {
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

    public void search(int key) {
        root = searchkey(root, key);
    }
    public Node searchkey(Node root, int key) {
        
        if(root != null) {
            if(root.key == key) {
                System.out.println("Found");
            }
            if(root.key > key) {
                root.left = searchkey(root.left, key);
            } else if(root.key < key) {
                root.right = searchkey(root.right, key);
            }
    
        }

        return root;
    }

    public int getMin(Node root) {
        int min = root.left;
        whlie(root.!= null) {
            min = root.key;
            root = root.left;
        }
        return min;
    }

    public void delete(int key) {
        root = deleteRecursive(root, key);
    }
    public Node deleteRecursive(Node root, int key) {

        if(root != null) {
            if(root.key > key) {
                root.left = deleteRecursive(root.left, key);
            } else if(root.key < key) {
                root.right = deleteRecursive(root.right, key);
            } else {
                if(root.left == null) {
                    root = root.right;
                } else if(root.right == null) {
                    root = root.left;
                } else {
                    root.key = getMin(root.right);
                    root.right = deleteRecursive(root.right, root.key);
                }
            }
        }

        return root;
    }

    public int Max(int a, int b) {
        return a > b ? a : b;
    }

    public int height(Node root) {
        if(root == null) {
            return 0;
        }
        return Max(height(root.left), height(root.right)) + 1;
    }

    public static void main(String args[]) {

        BinarySearchTree1 tree = new BinarySearchTree1();

        tree.insert(8);
        tree.insert(3);
        tree.insert(1);
        tree.insert(6);
        tree.insert(4);
        tree.insert(7);
        tree.insert(10);
        tree.insert(14);
        tree.insert(13);

        System.out.println();
        System.out.println("InOrder Traversal");
        tree.inOrder();

        System.out.println();
        System.out.println("PreOrder Traversal");
        tree.preOrder();

        System.out.println();
        System.out.println("PostOrder Traversal");
        tree.postOrder();

        tree.search(1);
        
        tree.delete(13);

        System.out.println("InOrder Traversal of Modified Tree");
        tree.inOrder();

        System.out.println();
        System.out.println("Tree Height : " + tree.height(tree.root));
    }

}