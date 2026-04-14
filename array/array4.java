//reverse an array
public class array4 {
    public static void reverse(int numbers[]){
        int first=0 , last=numbers.length-1; ////space complexity O(1), time complexity O(n)
        while(first<last){
            int temp= numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++; 
            last--;
       }
       for(int j=0;j<numbers.length;j++){
        System.out.print(numbers[j]+ " ");
    }

        // another approch
        
        // int i;
        // int reverseArr[]=new int[numbers.length];    //space complexity O(n), time complexity O(n)
        // for(i=0;i<numbers.length;i++){
        //     reverseArr[i]=numbers[numbers.length-1-i];
        // }
        // for(int j=0;j<reverseArr.length;j++){
        //     System.out.print(reverseArr[j]+ " ");
        // }
              
    }
    
    public static void main(String args[]){
        
        int numbers[]={2,4,6,8,10};

        reverse(numbers);
        
    }
}

int first=0;
int last=arr.length-1;
int temp;
while(last>first){
temp=arr[first];
first=arr[last];
last=temp;

first++;
last--;
}