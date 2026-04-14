import java. util.*;
public class Recursionbasicspracticeque{
public static void main(String[] args) {
    int arr[]={3, 2, 4, 5, 6, 2, 7, 2, 2};
    int key=2;

    String str="pratik";

    //occurences(arr,0,key);
    //System.out.println(strLength(str,0,1));
    //strLength(str, 0, 1);
    convertInString(1092);
}
public static void occurences(int[] arr,int curr ,int key){
    if(curr==arr.length){
        return;
    }

    if(arr[curr]==key){
        System.out.println(curr + " ");
    }
    occurences(arr,curr+1,key);

}

public static void strLength(String str,int i, int count){
    if(i==str.length()){
        System.out.println(count);
        return;
    }
    strLength(str,i+1,count+1);
}

public static int StrLength(String str, int i,int count){
    if(i==str.length()){
    return count;
    }
    return StrLength(str,i+1,count+1);
}

// You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”.
// Use a recursive function to solve this problem
// Sample Input: 1947Sample 
// Output: “one nine four seven”

public static void convertInString(int number){
    String s[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    if(number==0){
        return;
    }
    convertInString(number/10);
    System.out.print(s[number%10] + " ");
}
}