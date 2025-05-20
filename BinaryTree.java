import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.tree.TreeNode;

class Node{
    int data;
    Node left;
    Node right;
    Node(){
        left=null;
        right=null;
    }
}

public class BinaryTree {

    public static Node buildTree(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the val");
        int d = sc.nextInt();
        if(d==-1){
            return null;
        }

        Node root =new Node();
        root.data=d;
        root.left= buildTree();
        root.right=buildTree();
        return root;

    }
    public static void preOrder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+"  ");
        preOrder(root.left);
        preOrder( root.right);
    }
    public static void inOrder(Node root){
        if(root==null){
            return ;
        }
        inOrder(root.left);
        System.out.print(root.data+"  ");
        inOrder( root.right);
    }
    public static void postOrder(Node root){
        if(root==null){
            return ;
        }
        postOrder(root.left);
        postOrder( root.right);
        System.out.print(root.data+"  ");

    }
    public static void levelOrder(Node root){
       Queue<Node> q = new LinkedList<>();
       q.add(root);

       while(q.isEmpty()!=true){
        
        Node a = q.peek();
        q.poll();
        System.out.print(a.data+"  ");
        if(a.left!=null){
            q.add(a.left);
        }
        if(a.right!=null){
            q.add(a.right);
        }
       }
    }
    public static Node createTree(Node root,int d){
        Node temp = new Node();
        temp.data=d;
        if(root==null){
            return temp;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.isEmpty()!=true){
            Node curr=q.peek();
            q.poll();
            if(curr.left==null){
                curr.left=temp;
                return root;
            }
            else{
                q.add(curr.left);
            }
            if(curr.right==null){
                curr.right=temp;
                return root;
            }
            else{
                q.add(curr.right);
            }
        }
        return root;
    }
    public static void preOrderByItr(Node root){
        Stack<Node> s = new Stack<>();
        s.push(root);
        while(s.isEmpty()!=true){
            Node cur=s.peek();
            s.pop();
            System.out.print(cur.data+"  ");
            if(cur.right!=null){
                s.add(cur.right);
            }
            if(cur.left!=null){
                s.add(cur.left);
            }
        }
    }
    public static void  inOrderByItr(Node root){
        Stack<Node> s = new Stack<>();
        Node curr = root;
        while(curr!=null||s.isEmpty()!=true){
            while(curr!=null){
                s.push(curr);
                curr=curr.left;
            }
            curr=s.peek();
            s.pop();
            System.out.println(curr.data+"  ");
            curr=curr.right;
        }
    }
    public static void postOrderByItrWith2Stack(Node root) {
        Stack<Node> s1= new Stack<>();
        Stack<Node> s2= new Stack<>();
        s1.push(root);
        while(s1.isEmpty()!=true){
            Node curr= s1.peek();
            s1.pop();
            s2.push(curr);
            if(curr.left!=null){
                s1.push(curr.left);
            }
            if(curr.right!=null){
                s1.push(curr.right);
            }
        }
        while(s2.isEmpty()!=true){
            Node curr= s2.peek();
            s2.pop();
            System.out.print(curr.data+ "  ");
        }  
    }
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
         //Node root = buildTree();
         Node root=null;
         
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<6;i++){
            System.out.println("Enter the val");
            int d = sc.nextInt();
            root = createTree(root, d);
        }
        bt.inOrder(root);
        System.out.println();
        bt.preOrder(root);
        System.out.println();
        bt.postOrder(root);
        System.out.println();
        bt.levelOrder(root);
        System.out.println();
        bt.preOrderByItr(root);
        System.out.println();
        bt.postOrderByItrWith2Stack(root);
    }
}
