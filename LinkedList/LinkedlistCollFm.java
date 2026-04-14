import java.util.*;
public class LinkedlistCollFm {
    public static void main(String[] args) {
        
    
    LinkedList<Integer> ll= new LinkedList<>();

    ll.addFirst(2);
    ll.addLast(3);
    ll.addFirst(1);
    ll.addLast(4);
    System.out.println(ll);

    ll.removeFirst();
    ll.removeLast();
    ll.add(2,9);
    System.out.println(ll);

    
    
}
}