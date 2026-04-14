import java.util.*;
public class PreOrder{
    static class Node{
    int data;
    Node left;
    Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
            return null;
            }

            Node newNode=new Node(nodes[idx]);
            newNode.left= buildTree(nodes);
            newNode.right= buildTree(nodes);

        return newNode;
        }

        public static void preOrderTraversal(Node root){  //O(n)
            if(root==null){
                return;
            }
            System.out.print(root.data + ",");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    
        public static void inOrderTraversal(Node root){
            if(root==null){
                return;
            }
            inOrderTraversal(root.left);
            System.out.print(root.data + ",");
            inOrderTraversal(root.right);
        }

        public static void postOrderTraversal(Node root){
            if(root==null){
                return;
            }
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.println(root.data+ ",");
        }

        public static void levelOrderTraversal(Node root){
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node curr=q.remove();
                if(curr==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.println(curr.data);
                    if(curr.left !=null){
                        q.add(curr.left);
                    }
                    if(curr.right !=null){
                        q.add(curr.right);
                    }
                }
            }

        }
    }
    public static void main(String[] args) {
    int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

    BinaryTree tree=new BinaryTree();
    Node root=tree.buildTree(nodes);

    //tree.preOrderTraversal(root);
    //tree.inOrderTraversal(root);
    //tree.postOrderTraversal(root);
    tree.levelOrderTraversal(root);
}
}