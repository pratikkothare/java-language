public class queueviaLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        
    static class queueLL{
        public static Node head=null;
        public static Node tail=null;

        public static boolean isEmpty(){
            return head==null && tail==null;
            }

        public static void push(int data){
         Node newnode=new Node(data);
         if(head==null){
            head=tail=newnode;
            return;
            }
            tail.next=newnode;
            tail=newnode;
     }
        public int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int value=head.data;
            if(tail==head){
                tail=head=null;
            }else{
                head.next=head;
            }
            return value;
    }
    
    }
    public static void main(String[] args) {
        queueLL q=new queueLL();

        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.pop();
        }
    }
}
