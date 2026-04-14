//LARGEST IN ARRAY
import java.util.*;
public class array2 {
  
    public static int largestinarray(int numbers[]){
    int largest=Integer.MIN_VALUE; //-INFINITY
    int smallest = Integer.MAX_VALUE;
    int i;
    for(i=0;i<numbers.length;i++){
        // if(numbers[i]>largest){
        //     largest=numbers[i];
        // } if(numbers[i] < smallest){
        //     smallest = numbers[i];
        // }

        largest=Math.max(largest,numbers[i]);
        smallest=Math.min(smallest,numbers[i]);
}   
System.out.println(smallest+"/"+largest);
    return largest;
 }
    public static void main(String args[]){
    int numbers[]={1,5,7,9,3,4};
    System.out.println(largestinarray(numbers));
}
}