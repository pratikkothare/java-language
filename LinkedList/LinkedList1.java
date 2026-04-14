import java.util.LinkedList; //java collection framework

public class LinkedList1 {
    public static void main(Strings[] args) {
        
    //create a linkedlist
    LinkedList<Integer> ll=new LinkedList<>();
    //add
    ll.addFirst(1);
    ll.addFirst(3);
    ll.addLast(4);
    ll.add(2,8);

    //remove
    ll.removeFirst();
    ll.removeLast();

    //print
    System.out.println(ll);

 }
}