
// alt-tab is the best example for linklist
public class Linkedlist {
    class  Node{
        int data;
        Node next; //referance variable 

        public Node(int data){ //constructor
            this.data=data;
            this.next=null; 
        }
    }
    public static Node Head;//propertie
    public static Node Tail;//propertie
    public static int size;

    public void AddFirst(int data){

        // create new node
        Node Newnode=new Node(data);  
        size++;
        
        //if previously no nodes exists
        if(Head==null){
            Head=Tail=Newnode;
            return;
        }

        //new nodes next point towards head
        Newnode.next=Head;

        //head isequal to new node
        Head=Newnode;
    }
    public void AddLast(int data){
        Node Newnode=new Node(data);
        size++;

        if(Head==null){
            Head=Tail=Newnode;
            return;
        }
        Tail.next=Newnode;
        Tail=Newnode;
        Newnode.next=null;
    }

    public static void Print(){
        if(Head==null){
            System.out.println("null");
            return;
        }
        Node Temp=Head;
        while(Temp!=null){
            System.out.print(Temp.data + "->");
            Temp=Temp.next;
        }
        System.out.println();
    }

    public void add(int indx, int data){
        if(indx==0){
            AddFirst(data);
            return;
        }
        Node newnode=new Node(data);
        size++;
        Node temp=Head;
        int i=0;
        while(i < indx-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

    public static int Removefirst(){
        if(size==0){
            System.out.println("LL is empty");
        }
        else if(size==1){
            int value=Head.data;
            Head=Tail=null;
            return value;
        }
        int value=Head.data;
        Head=Head.next;
        return value; 
    }

    public static int Removelast(){
        int value=Tail.data;
        int i=0;
        Node temp=Head;
        while(i<size-2){
            i++;
            temp=temp.next;
        }
        temp.next=null;
        Tail=temp;
        size--;
        return value;
        

    }

    public static int ItrativeSearch(int key){
        int idx=0;
        Node temp=Head;
        while(temp!=null){
            if(temp.data==key){
                return idx;
            }
            temp=temp.next;
            idx++;
        }
        return -1;
    }

    public static void DltNthFromEnd(int n){
        //calculating size(sz)
        int sz=0;
        Node temp=Head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }

        if(n==sz){
            Head=Head.next;//remove first
            return;
        }

        int j=1;
        Node prev=Head;
        while(j < sz-n){
            prev=prev.next;
            j++;
        }
        prev.next=prev.next.next;
        return;
    }

    public static Node rev(){
        Node prev = null;
        while(Head!=null){
            Node curr = Head.next;
            Head.next = prev;
            prev = Head;
            Head = curr;
        }
        return prev;
    }

    public static void reverse(){
       //3variables
        Node prev=null;
        Node curr=Tail=Head;
        Node next;

       //4steps 
        while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        }
       Head=prev;
    }

    public static Node FindMid(Node head){
        Node slower=Head;//slower=+1
        Node faster=Head;//faster=+2

        while(faster!=null && faster.next!=null){
            slower=slower.next;
            faster=faster.next.next;
        }
        Node middle=slower;
        return middle;
    }

    public static Boolean CheckPalindrom(){

    //Base case
    if(Head==null || Head.next==null){
        return true;
    }

    //in 3 steps-

        //find middle element
       Node mid= FindMid(Head);

        //reverse 2nd half
        Node prev=null;
        Node curr=mid;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right=prev;
        Node left=Head;

        //check left half equal to right half
        while(right!=null){
            if(right.data!=left.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
        
public static void Zigzag(){
 //3steps->
    //findmid
    Node slow=Head;
    Node fast=Head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    Node mid=slow;

    //revere 2nd half
    Node curr=mid.next;  
    mid.next=null;
    Node prev=null;
    Node next;
 while(curr!=null){
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
 }
 Node right=prev;
 Node left=Head;
 Node Nright;
 Node Nleft;


 //alt merge, zigzag merge
 while(left!=null && right!=null){
    Nleft=left.next;
    left.next=right;    
    Nright=right.next;
    right.next=Nleft;

    left=Nleft;
    right=Nright;

 }


}






    
    public static void main(String args[]){
        Linkedlist ll=new Linkedlist();
        //ll.Print();
        ll.AddFirst(2);
        //ll.Print();
        ll.AddFirst(1);
        //ll.Print();
        ll.AddLast(3);
        //ll.Print();
        ll.AddLast(4);
        ll.AddLast(5);
        // ll.Print();
        // ll.AddLast(5);
        // ll.Print();
        // ll.add(2,8);
        // ll.Print();
        
        // System.out.println(ll.size);
        Removelast();
        // ll.Print();
        // System.out.println(ll.size);


        ItrativeSearch(8);

       // DltNthFromEnd(3);
        // ll.reverse();
        // ll.Print();

        // System.out.println(ll.CheckPalindrom());
        // ll.Print();

        
        Print();
        Zigzag();
        Print();
        

    }

}
