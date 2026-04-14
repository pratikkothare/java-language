import java.util.*;
public class AnagramUsingHashmap {
    public static void main(String[] args) {
        String s="knee";
        String t="keen";
        
        System.out.println(checkAnagram(t,s));
    }

    public static Boolean checkAnagram(String t,String s){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer>map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

       for(int i=0;i<t.length();i++){
        Character ch=t.charAt(i);
        if(map.get(ch)!=null){
            if(map.get(ch)==1){
                map.remove(ch);
            }else{
                map.put(ch,map.get(ch)-1);
            }
        }else{
            return false;
        }
       }

       return map.isEmpty();
    }
}
