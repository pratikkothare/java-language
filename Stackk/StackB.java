import java.util.*;
public class StackB {
     static class Stack{
        static ArrayList<Integer>arr=new ArrayList<>();
        static final int MAX_CAPACITY=6;

        public static boolean isFull() {
            return arr.size() == MAX_CAPACITY;
        }

        public static boolean IsEmpty(){
            return arr.size()==0;
        }
    
    public static void push(int data){
        if(isFull()){
            System.out.println("stack is full. max size is 6");
            return;
        }
        arr.add(data); 
    }

    public static int pop(){
        if(IsEmpty()){
           return -1;
        }
        int top=arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        return top;
    }

    public static int peek(){ //to peek last elememnt
         if(IsEmpty()){
           return -1;
        }
        return arr.get(arr.size()-1);
    }
}
    public static void main(String args[]){
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        // s.push(7);
        // s.push(8);
        //System.out.println(s.pop());
        

        //s.isFull();

       while(!s.IsEmpty()){
         System.out.println(s.peek());
         s.pop();
       }

    }

}
