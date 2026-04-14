//LINEAR SEARCH
import java.util.*;
public class array1 {
    public static int linearsearch(int numbers[], int key){
        int i;
        for(i=0;i<=numbers.length;i++){
            if(numbers[i]==key){
               return i;
            }
              }
               return -1;
        }
    public static void main(String args[]){
        int numbers[]={3,4,6,2,8,9,1};

        Scanner sc=new Scanner(System.in);
        System.out.println("enter number from the list whose index to know: ");
        int key=sc.nextInt();

        int index=linearsearch(numbers,key);
        if(index==-1){
            System.out.println("does not exist ");
        } else{
            System.out.println("index is:"+ index);
        }
        }

        }
    
    

