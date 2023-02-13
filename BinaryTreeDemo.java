
class TreeNode{
    TreeNode left;
    int data;
    TreeNode right;
    TreeNode(int data){
        this.left = null;
        this.data = data;
        this.right = null;
    }
}

class BinaryTree{

    TreeNode root;
    BinaryTree(){
        root = null;
    }
    void insertNode(int data){
        root = insertRecursive(root, data);
    }
    TreeNode insertRecursive(TreeNode temp, int data){
        if(temp == null){
            return new TreeNode(data);
        }
        if(data < temp.data){
            temp.left = insertRecursive(temp.left, data);
        }
        else if(data > temp.data){
            temp.right = insertRecursive(temp.right, data);
        }
        else{

        }
        return temp;
    }

    void preOrderTraversal(TreeNode root){
        if(root != null){
            System.out.print(root.data+" ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    void postOrderTraversal(TreeNode root){
        if(root != null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    void inOrderTraversal(TreeNode root){
        if(root != null){
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

}

public class BinaryTreeDemo {
   public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insertNode(5);
        bt.insertNode(3);
        bt.insertNode(7);
        bt.insertNode(4);
        bt.insertNode(2);
        bt.insertNode(6);
        bt.insertNode(8);
        bt.preOrderTraversal(bt.root);
        System.out.println();
        bt.postOrderTraversal(bt.root);
        System.out.println();
        bt.inOrderTraversal(bt.root);
   }
   
    
}
