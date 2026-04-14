public class Linkedlist2 {
   
    public static class Node{
        Node next;
        int data;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
 

    public static boolean IsCycle(){
        Node slower=head;
        Node faster=head;

        while (faster!=null && faster.next!=null) {
            slower=slower.next;//+1
            faster=faster.next.next;//+2
            if(slower==faster){
                return true;//cycle exists
            }
        }
        return false;//cycle does not exist
    }

    public static void Removecycle(){
        //detect cycle
        Node slower=head;
        Node faster=head;
        boolean cycle=false;
        
        
            slower=slower.next;
            faster=faster.next.next;
            while(faster!=null && faster.next!=null){
                slower=slower.next;
                faster=faster.next.next;
                if(slower==faster){
                    cycle=true;
                    break;
                }
            }
            if(cycle==false){
                return;
            }
        
        //find meeting point
        slower=head;
        Node prev=null;
        while(slower!=faster){
            slower=slower.next;
            prev=faster;
            faster=faster.next;
        }

        //remove cycle -> last.next=null
        prev.next=null;
        
    }

    // public void addLast()
    // static void print(){
    //     Node curr = head;
    //     while(curr != null){
    //         System.out.println(curr.data+" -> ");
    //         curr = curr.next;
    //     }
    //     System.out.println(" NULL");
    // }

    public static void main(String[] args) {
        // Linkedlist2 Head = new Linkedlist2();
        head = new Node(0);
        Node temp=new Node(1);
        head.next = temp;
        head.next.next=new Node(2);
        head.next.next.next=new Node(3);
        head.next.next.next=temp;
        
        System.out.println(IsCycle());
        Removecycle();
        System.out.println(IsCycle());
    }
}
