import java.util.*;
public class hashmap {
    public static void main(String[] args) {
    
    HashMap<String,Integer> map=new HashMap<>();

    //put O(1)
    map.put("India",100);
    map.put("China",150);
    map.put("Australia",50);
    System.out.println(map);

    //get O(1)
    int population=map.get("India");// key chya corrosponding value return krte
    System.out.println(population);

    System.out.println(map.get("Nepal"));    

    //contains key
    System.out.println(map.containsKey("India")); //true
    System.out.println(map.containsKey("pakistan")); //false

    //remove 
    System.out.println(map.remove("China"));
    System.out.println(map);

    System.out.println(map.remove("Nepal"));//when key dosent exit it returns null
    System.out.println(map);

    //Size
    System.out.println(map.size());

    //Is Empty
    System.out.println(map.isEmpty());

    //clear
    // map.clear();
    // System.out.println(map);
    
    
    //iterating over hashmap
    Set<String> keys =map.keySet(); //create a set of keys
    System.out.println(keys);
    for(String k : keys){
        System.out.println(k + ":" + map.get(k));
    }
    //enterySet
    System.out.println(map.entrySet()); // prints set of all pairs


}
}
