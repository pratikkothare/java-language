import java.util.*;
public class set {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();

        //add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);//set unique key hi letra hai thats why 1 vpas add nhi hoga
        System.out.println(set);
        
        //remove
        set.remove(2);
        System.out.println(set);

        //contains
        System.out.println(set.contains(1));
        //hashmap mai key aur value dono hote hai thats why 'containskey' keyword hai, aur hashsets mai 'contains' 
        
        //size
        System.out.println(set.size());

        //isEmpty
        System.out.println(set.isEmpty());

        //clear
        set.clear();
        System.out.println(set);

    }
}
