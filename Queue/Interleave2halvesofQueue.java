import java.util.*;
public class Interleave2halvesofQueue {

    public static void interleave(Queue<Integer> q){
    Queue<Integer> qq=new LinkedList<>();
    for(int i=0;i<=q.size()/2;i++){
        qq.add(q.remove());
    }
    while(!qq.isEmpty()){
        q.add(qq.remove());
        q.add(q.remove());
    }

    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        interleave(q);
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }

    }   
}
