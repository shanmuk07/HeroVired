
import java.util.Scanner;

class Node{
    Node left;
    int data;
    Node right;

    Node(int data){
        this.left = null;
        this.data = data;
        this.right = null;
    }
}

class Tree{
    Scanner sc = new Scanner(System.in);
    Node root;

    void addNode(int data){
        if(root == null){
            root = new Node(data);
            return;
        }
        System.out.println("Where do you want to insert the node: ");
        System.err.println("Enter 'L/l' to insert at left of the node: ");
        System.out.println("Enter 'R/r to insert at right: ");
        System.out.println("Enter Your choice: ");
        char ch = sc.next().charAt(0);
        if( ch == 'L' || ch == 'l'){
            Node temp = root;
            while(temp.left != null){
                temp = temp.left;
            }
            temp.left = new Node(data);
        }
        else if(ch == 'R' || ch == 'r'){
            Node temp = root;
            while(temp.right != null){
                temp = temp.right;
            }
            temp.right = new Node(data);
        }
    }

    void preOrderTraversal(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    void postOrderTraversal(Node root){
        if(root != null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    void inOrderTraversal(Node root){
        if(root != null){
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

}

public class TreeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tree tree = new Tree();
        while(true){
            System.out.println();
            System.out.println("1. Insert Node: ");
            System.out.println("2. Preorder Traversal: ");
            System.out.println("3. Postorder Traversal: ");
            System.out.println("4. Inorder Traversal: ");
            System.out.println("5. Exit: ");
            System.out.println("Enter Your Choice: ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    tree.addNode(1);
                    tree.addNode(2);
                    tree.addNode(3);
                    break;
                case 2:
                    tree.preOrderTraversal(tree.root);
                    break;
                case 3:
                    tree.postOrderTraversal(tree.root);
                    break;
                case 4:
                    tree.inOrderTraversal(tree.root);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter only specified values");
                    break;
            }
        }
       
    }
}
