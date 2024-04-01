import java.util.*;

public class binarysearchtree {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            //left subtree
            root.left = insert(root.left, val);
        }

        if (root.data < val) {
            //right subtree
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static boolean search(Node root, int key){ //O(H) or O(logn)
        if(root == null){
            return false;
        }
        else if(root.data > key){
            return search(root.left, key);
        }
        else if(root.data == key){
            return true;
        }
        else{
            return search(root.right, key);
        }
    }

    public static void inorder(Node root){
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static Node delete(Node root, int val){
        if (root.data > val) {
            root.left = delete(root.left, val);
        }
        else if(root.data < val) {
            root.right = delete(root.right, val);
        }
        else{

            // case 1 - single node no child
            if(root.left == null && root.right == null){
                return null;
            }

            // case 2 - node with one child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            // case 3 - node with two childs
            
            Node insuc = inorderSuccessor(root.right);
            root.data = insuc.data;
            root.right = delete(root.right, insuc.data);
        }
        return root;
    }
    
    public static Node inorderSuccessor(Node root){
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void inRange(Node root, int x_val, int y_val){

        if (root == null) {
            return;
        }
        
        if(root.data >= x_val && root.data <= y_val){
            inRange(root.left, x_val, y_val);
            System.out.print(root.data+" ");
            inRange(root.right, x_val, y_val);
        }
        else if(root.data >=  y_val){
            inRange(root.left, x_val, y_val);
        }
        else if(root.data <= x_val){
            inRange(root.right, x_val, y_val);
        }
    }    

    public static void printpath(ArrayList<Integer> path){
        for(int i = 0; i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }

    public static void printroot2leave(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printpath(path);
        }

        printroot2leave(root.left, path);
        printroot2leave(root.right, path);
        path.remove(path.size()-1);
    }
    
    public static boolean isvalidBSt(Node root, Node min, Node max){
        if(root == null){
            return true;
        }
        if (min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }
        return isvalidBSt(root.left, min, root) && isvalidBSt(root.right, root, max);
    }

    public static void main(String[] args) {
        int[] values = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for(int i : values){
            root = insert(root,i);
        }
        inorder(root);
        System.out.println();
        
        if(isvalidBSt(root, null, null)){
            System.out.println("valid");
        }else{
            System.out.println("Not valid");
        }
    }
}
