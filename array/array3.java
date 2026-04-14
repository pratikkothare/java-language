//binary search- Appicable only on sorted array. increasing or decreasing order
import java.util.*;
public class array3 {
    public static int binarysearch(int numbers[],int key){
        int start=0, end= numbers.length-1;
        while(start<=end){
           int mid=(start+end)/2;

           if(numbers[mid]==key){
            return mid;
           }
           if(numbers[mid]<key){
            start=mid+1;         
           }
           else{
            end=mid-1;
           }
        }
        return -1;
    }
    //reverse an array
    public static void reverse(int numbers[]){
        int first=0 , last=numbers.length-1;
        while(first<last){
            int temp= numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
        }
        for(int i=0;i<=numbers.length;i++){
            System.out.println(numbers);
        }
        
    }
    public static void main(String[] args) {
       int numbers[]={1,2,3,4,5,6,7,8};
       int key=6;
       System.out.println(binarysearch(numbers,key));
       //System.out.print(reverse(numbers));
    }
}
