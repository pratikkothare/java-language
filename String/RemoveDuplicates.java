import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        String str= "apnnacollege";
        System.out.println(removeduplicates(str));
    }

    public static String removeduplicates(String str){
        StringBuilder sb=new StringBuilder();
        HashSet<Character> seen=new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(seen.contains(str.charAt(i))){
                continue;
            }else{
                seen.add(str.charAt(i));
                sb.append(str.charAt(i));
            }

        }
        return sb.toString();
    }
}