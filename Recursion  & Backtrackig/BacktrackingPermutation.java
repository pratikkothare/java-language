import java.util.*;
public class BacktrackingPermutation {
    public static void main(String[] args) {
        String str="abc";
        FindPermutation(str, "");
    }
    public static void FindPermutation(String str, String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //O(n*n!)
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newstr=str.substring(0,i) + str.substring(i+1);
            FindPermutation(newstr, ans+curr);
        }
    }
}
