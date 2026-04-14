import java.util.*;
public class ReverseStringUsingStack {
    public static String reverse(String str){
        Stack<Character> s=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            s.push(ch);
        }
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="maahi";
        System.out.println(reverse(str));
    }
}

