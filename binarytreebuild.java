import java.util.*;

public class binarytreebuild{

    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void preorder(Node root){
        if(root==null){
            System.out.print("-1 ");
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root==null){
            System.out.print("-1 ");
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root==null){
            System.out.print("-1 ");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelorder(Node root){
        
        if(root == null){
            return;
        }
        
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data + " ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
                
            }
        }
    }

    public static int countnode(Node root){

        if (root == null) {
            return 0;
        }

        int leftnodes = countnode(root.left);
        int rightnodes = countnode(root.right);
        return leftnodes + rightnodes + 1;
    }

    public static int sum(Node root){
        if(root==null){
            return 0;
        }

        int leftnode = sum(root.left);
        int rightnode = sum(root.right);
        return leftnode+rightnode+root.data;
        
    }

    public static int heightoftree(Node root){

        if(root==null){
            return 0;
        }

        int leftheight = heightoftree(root.left);
        int rightheight = heightoftree(root.right);

        return  Math.max(leftheight,rightheight)+1;
    }

    public static int diameteroftree(Node root){

        if (root == null) {
            return 0;
        }

        int diameterleft = diameteroftree(root.left);
        int diameterright = diameteroftree(root.right);
        int path = heightoftree(root.left)+heightoftree(root.right)+1;
        return Math.max(diameterright, Math.max(diameterleft, path));
    }

    public static boolean isIdentical(Node root, Node subroot){
        if(root == null && subroot == null){
            return true;
        }
        if(root == null || subroot == null ){
            return false;
        }
        if (root.data == subroot.data){
            return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
        }
        return false;
    }

    public static boolean subTree(Node root, Node subroot){
        if(subroot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(root.data == subroot.data){
            if(isIdentical(root, subroot)){
                return true;
            }
        }
        return subTree(root.left, subroot) || subTree(root.right, subroot);
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println();
        System.out.println();
        preorder(root);
        System.out.println();
        System.out.println();
        inorder(root);
        System.out.println();
        System.out.println();
        postorder(root);
        System.out.println();
        System.out.println();
        levelorder(root);
        System.out.println();
        System.out.println("Number of Nodes = "+countnode(root));
        System.out.println();
        System.out.println("Sum of Nodes = "+sum(root));
        System.out.println();
        System.out.println("Height of the tree = "+heightoftree(root));
        System.out.println();
        System.out.println("Diameter of the tree = "+diameteroftree(root));
    }
}