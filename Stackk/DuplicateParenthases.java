//faltu ka extra parentheses rhe to true return kro else false
import java.util.*;
public class DuplicateParenthases {
    public static boolean checkduplicate(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){ 
                int count=0;
                while(s.pop() != '('){
                    count++;
                }
                if(count<1){
                    return true;
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="((a+b))";
        System.out.println(checkduplicate(str));
    }
}
