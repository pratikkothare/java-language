import java.util.*;
public class arraylist {
public static void main(String args[]){
    ArrayList<Integer> numbers =new ArrayList<>();
    ArrayList<String> names=new ArrayList<>();
    ArrayList<Boolean> characters=new ArrayList<>();
        //names.add("p");
        //add operation in ArrayList
        numbers.add(5);
        numbers.add(8);
        numbers.add(9);
        numbers.add(6);
        numbers.add(2,4);
        System.out.println(numbers);

    //get operarion in ArrayList

        // int index=numbers.get(2);
        // System.out.println(index);
        System.out.println(numbers.get(2));

    //remove operation in ArrayList
        int removal= numbers.remove(3);
        System.out.println(removal);
        System.out.println(numbers);

    //set/replace element  at index
        System.out.println(numbers.set(2,1));
        System.out.println(numbers);
        

    //size()
    System.out.println(numbers.size());

    //print arraylist
    for(int i=0;i<numbers.size();i++){
        System.out.print(numbers.get(i));
    }
    System.out.println("");

    //print revwese
    for(int i=numbers.size()-1;i>=0;i--){
        System.out.print(numbers.get(i));
    }

    //sorting
       Collections.sort(numbers); //in arraylist we use Collections. here collections is an class and .sort is a method of that class
       System.out.println(numbers);
        
       Collections.sort(numbers, Collections.reverseOrder());// for decending order




    MaxElement(numbers);
    Swapno(numbers,0,2);
    }





    //find max in AL
    public static void MaxElement(ArrayList<Integer> numbers){
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<numbers.size();i++){
            largest=Math.max(largest,numbers.get(i));
        }
        System.out.println(largest);
    }

    //swap numbers
    public static void Swapno(ArrayList<Integer> numbers, int idx1 , int  idx2){
        System.out.println(numbers);// sequence before swpping
        int temp=numbers.get(idx1);
        numbers.set(idx1 , numbers.get(idx2));
        numbers.set(idx2 , temp);
        System.out.print(numbers);// sequence after swapping
    }
}
