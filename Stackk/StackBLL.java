public class StackBLL {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    
    public static class stack{
        static Node head;
        public static boolean IsEmpty(){
            return head==null;
        }

        public static void push(int data){
            Node newNode=new Node(data);
            if(IsEmpty()){
                head=newNode;
            }

            newNode.next=head;
            head=newNode;
        }

        public static int pop(){
            if(IsEmpty()){
                return -1;
            }
           int top=head.data;
            head=head.next;
            return top;
        }

        

        public static int peek(){
            if(IsEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(Strings args[]){
        stack s=new stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.IsEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
