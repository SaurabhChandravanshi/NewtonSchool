package tree;

import java.util.Scanner;

public class InorderTraversal {

     static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Node root = new Node(1);
        Node tempL = root;
        Node tempR = root;
        for(int i = 0; i < N; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            insertNode(root,left, right, i + 1);
        }
        inorderTraversal(root);
    }

    private static void insertNode(Node root, int left, int right, int nodeNumber) {
         if(root != null) {
             if(root.data == nodeNumber) {
                 if(left != -1) root.left = new Node(left);
                 if(right != -1) root.right = new Node(right);
             } else {
                 insertNode(root.left,left,right,nodeNumber);
                 insertNode(root.right,left,right,nodeNumber);
             }
         }
    }

    private static void inorderTraversal(Node root) {
        if(root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data+" ");
            inorderTraversal(root.right);
        }
    }
}
