
public class array5 {
    int i,j;
    public static void printpairs(int array[]){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
         System.out.println("(" + array[i] + ","+array[j]+ ")");
            }
        }
    }

    public static void subarrays(int array[]){ //contanious sub-part of array
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                for(int z=i;z<=j;z++){
                System.out.print(array[z] + ",");
                }
                System.out.println();
            }
        }
    }
    //code for printing maximum sub arrays also
    //brute force approch
    public static void printsubarray(int array[]){
        int totalSubarrays=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            int start=i;
            for(int j=i;j<array.length;j++){
                int end=j;
                int sum=0;
                for(int z=start;z<=end;z++){
                    System.out.print(array[z]+ ",");
                    
                    sum=sum+array[z];
                }
                System.out.println();
                System.out.println("sum- "+sum);
                if(maxsum<sum){
                    maxsum=sum;
                }
                totalSubarrays++;
            }
            System.out.println();
        }
        System.out.println("total Subarrays are- "+totalSubarrays);
        System.out.println("max sub array sum is- "+ maxsum);
    }//time complexity jada hai ie-n^3
    
    public static void prefixsum(int array[]){
        int maxsum=Integer.MIN_VALUE;
        int prefixarray[]=new int[array.length];
        prefixarray[0]=array[0];
        for(int i=1;i<prefixarray.length;i++){
            prefixarray[i]=prefixarray[i-1] + array[i];
        }
        
        for(int i=0;i<array.length;i++){
            int start=i;
            for(int j=i;j<array.length;j++){
                int end=j;
                int sum= start==0 ? prefixarray[end] : prefixarray[end] - prefixarray[start-1];
                        //terenary operator['condition' ? 'value_if_true' : 'value_if_false']
                
                // if(sum>maxsum){
                //     maxsum=sum;
                // }
                maxsum=Math.max(maxsum,sum);
            }
        }
        //System.out.println("total Subarrays are- "+totalSubarrays);
        System.out.println("max sub array sum is- "+ maxsum);
    }//time complexity kam hai coz 3 loops nhi hai ie n^2



    public static void kadanes(int array[]){
        int maxsum=Integer.MIN_VALUE;
        int cursum=0;

        for(int i=0;i<array.length;i++){
            cursum=cursum+array[i];
            if(cursum<0){
                cursum=0;
            }
            maxsum=Math.max(cursum,maxsum);
        }
        System.out.println(maxsum);
    }



    public static void main(String args[]){
        int array[]={1,-2,6,-1,3};
        //printpairs(array);
        //subarrays(array);
       //printsubarray(array);
       prefixsum(array);
       kadanes(array);
    }
}
